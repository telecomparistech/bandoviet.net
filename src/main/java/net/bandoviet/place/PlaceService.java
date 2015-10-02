package net.bandoviet.place;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import net.bandoviet.tool.GeographyTool;
/**
 * Place service.
 * 
 * @author quocanh
 *
 */

@Service
@Validated
public class PlaceService {
  private static final Logger LOGGER = LoggerFactory.getLogger(PlaceService.class);
  private final PlaceRepository placeRepository;

  @Autowired
  public PlaceService(final PlaceRepository placeRepository) {
    this.placeRepository = placeRepository;
  }

  /**
   * Search by keywords.
   * 
   * @param keywords given keys.
   * @return list of corresponding places.
   */
  @Transactional(readOnly = true)
  public List<Place> search(String keywords) {
    List<Place> results = null;
    try {
      results = placeRepository.findByKeywords(keywords);
    } catch (Exception e) {
      LOGGER.error("An error occurred trying to search for places: " + e.toString());
    }
    return results;
  }

  public List<Place> findByCity(String cityName) {
    return placeRepository.findByCity(cityName);
  }

  /**
   * Return 100 nearest places around the given location.
   * 
   * @param lat
   *          given latitude
   * @param lng
   *          given longitude
   * @return list of nearest places.
   */
  public List<Place> findByLocation(double lat, double lng) {
    List<Place> lst = placeRepository.findAll();

    TreeMap<Long, Double> sortedList = new TreeMap<Long, Double>();
    for (Place place : lst) {
      double distance = GeographyTool.distance(lat, lng, place.getLatitude(), place.getLongitude(),
          "K");
      sortedList.put(place.getId(), distance);
    }

    List<Place> results = new ArrayList<Place>();
    int max = sortedList.size() <= 100 ? sortedList.size() : 100;
    for (int i = 0; i < max; i++) {
      
    }
    return results;
  }
}