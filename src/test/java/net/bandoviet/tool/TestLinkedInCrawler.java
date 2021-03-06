package net.bandoviet.tool;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;

import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderAddressComponent;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocoderResult;

import fr.dudie.nominatim.client.JsonNominatimClient;
import fr.dudie.nominatim.client.request.NominatimSearchRequest;
import fr.dudie.nominatim.model.Address;
import net.bandoviet.place.Place;
import net.bandoviet.place.PlaceType;

/**
 * @author quocanh
 *
 */
public class TestLinkedInCrawler {

  
  public void testGoogleGeoCoder() {
    try {
      final Geocoder geocoder = new Geocoder();
      GeocoderRequest geocoderRequest = new GeocoderRequestBuilder().setAddress("San Francisco Bay")
          .setLanguage("en").getGeocoderRequest();

      GeocodeResponse geocoderResponse = geocoder.geocode(geocoderRequest);
      List<GeocoderResult> results = geocoderResponse.getResults();

      float latitude = results.get(0).getGeometry().getLocation().getLat().floatValue();

      float longitude = results.get(0).getGeometry().getLocation().getLng().floatValue();

      String address = results.get(0).getFormattedAddress();

      String country = "";
      for (GeocoderAddressComponent e :results.get(0).getAddressComponents()) {
        if (e.getTypes().contains("country")) {
          country = e.getShortName();
          break;
        }         
      }
      
      System.out.println(latitude + "," + longitude + ": " + address + " -- " + country );
    } catch (IOException e) {
      System.out.println("Co loi tu google geocoder: " + e.getMessage());
    }
  }

  public void testAccents() {
    String s = "Quốc Anh Lê";
    System.out.println(VietnameseWords.removeAccents(s));

    s = "Quoc-Anh Le";
    System.out.println(VietnameseWords.removeAccents(s));
  }

  @Test
  public void getDataFromLinkedin() {
    String url = "https://www.linkedin.com/in/anphungkhac";
    Place place = getPlace(url);
    if (place != null) {
      System.out.println(place.getLatitude() + "," + place.getLongitude());
    }
  }

  private Place getPlace(String url) { // id, title, address, country,latitude, longitude,
                                       // place_type
    Place place = new Place();
    place.setCommunityCode("VN");
    place.setReferenceUrl(url);
    place.setPlaceType(PlaceType.INDIVIDUAL.toString());

    Document doc;
    try {
      // System.setProperty("http.proxyHost", "95.211.206.151");
      // System.setProperty("http.proxyPort", "80");
      // System.out.println("Dang xu ly: " + url);
      doc = Jsoup.connect(url)
          .userAgent(
              "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.71 Safari/537.36")
          .get();

      Elements name = doc.select("#name");
      String fullname = name.text();
      if (StringUtils.isEmpty(fullname)) {
        return null;
      }
      if (fullname.indexOf(",") > 0) {
        fullname = fullname.substring(0, fullname.indexOf(","));
      }

      place.setTitle(fullname);

      Elements title = doc.select(".profile-overview").select(".title");
      String subtitle = title.get(0).text();
      place.setSubtitle(subtitle);
      place.setTitle(place.getTitle() + " - " + subtitle);

      Elements picture = doc.select(".profile-picture").get(0).select(".photo");
      String imagePath = picture.get(0).attr("data-delayed-url");
      place.setImagePath(imagePath);

      doc.select(".summary-header").remove();

      Elements information = doc.select("#profile");
      String info = information.html();

      /*
       * if (info.indexOf("Chinese") > 0) { return null; }
       */

      info = info.replace("<h2>Background</h2>", "");
      info = info.replace("h5", "h6");
      info = info.replace("h4", "h5");
      info = info.replace("h3", "h4");
      info = info.replace("Summary", "Giới thiệu");
      info = info.replace("Experience", "Kinh nghiệm làm việc");
      info = info.replace("Education", "Quá trình đào tạo");
      info = info.replace("Skills", "Kỹ năng");
      info = info.replace("Publications", "Công trình công bố");
      info = info.replace("Interests", "Sở thích cá nhân");
      place.setInformation(info);

      Elements locality = doc.select(".locality");
      String address = locality.get(0).html().replace("Area", "");

      /*
       * if (address.indexOf("Vietnam") >= 0) { return null; }
       */

      // System.out.println(address);
      if (!getAddress(place, address)) {
        return null;
      }

      if (address.indexOf("Vietnam") < 0) {

        Elements links = doc.select(".insights li");
        System.out.println(links.size());
        for (Element link : links) {
          String furl = link.select("a").get(0).attr("href");
          // System.out.println(furl);
          String ffullname = link.select(".info").get(0).select("a").text();
          if (ffullname.indexOf(",") > 0) {
            ffullname = ffullname.substring(0, ffullname.indexOf(","));
          }

          // System.out.println(ffullname);
          String photo = link.select("a").get(0).select("img").attr("src");
          System.out.println(photo);

          if (VietnameseWords.isVietnamese(ffullname) && (photo.indexOf("ghosts") < 0)) {
            System.out.println("Day la ten tieng Viet: " + ffullname);
            
              System.out.println("Them vao: " + furl);
            
          }
        }
      }
    } catch (IOException e) {
      return null;
    }
    return place;
  }

  private boolean getAddress(Place place, String location) {
    NominatimSearchRequest req = new NominatimSearchRequest();

    final SchemeRegistry registry = new SchemeRegistry();
    registry.register(new Scheme("http", new PlainSocketFactory(), 80));
    final ClientConnectionManager connexionManager = new SingleClientConnManager(null, registry);

    final HttpClient httpClient = new DefaultHttpClient(connexionManager, null);

    final String baseUrl = "http://nominatim.openstreetmap.org/";
    final String email = "quocanh263@gmail.com";
    JsonNominatimClient nominatimClient = new JsonNominatimClient(baseUrl, httpClient, email);

    try {
      List<Address> addresses = nominatimClient.search(location);
      for (final Address address : addresses) {
        System.out
            .println(ToStringBuilder.reflectionToString(address, ToStringStyle.MULTI_LINE_STYLE));
        place.setLatitude(address.getLatitude());
        place.setLongitude(address.getLongitude());
        place.setAddress(address.getDisplayName());
        break;
      }
    } catch (IOException e) {
      return false;
    }
    return true;
  }

  public void getProfile() throws Exception {
    Document doc = Jsoup.connect("https://www.linkedin.com/in/anphungkhac").get();

    Elements name = doc.select(".full-name");

    System.out.println(name.text());
    Elements title = doc.select(".title");
    System.out.println(title.text());

    Elements picture = doc.select(".profile-picture").select("img");
    System.out.println(picture.get(0).attr("src"));

    Elements information = doc.select("#background");
    // System.out.println(information.html());

    Elements locality = doc.select(".locality");
    System.out.println(locality.get(0).html());

    Elements links = doc.select(".insights-browse-map ul li");
    System.out.println(links.size());
    for (Element link : links) {
      String url = link.select("h4 a").attr("href");
      System.out.println(url);
      String fullname = link.select("h4 a").text();
      System.out.println(fullname);
      String photo = link.select("a img").attr("data-li-src");
      System.out.println(photo);

      if (VietnameseWords.isVietnamese(fullname)) {
        System.out.println("Day la ten tieng Viet: " + fullname);
      }
    }
  }
}
