/**
 * Map Service provides methods to work with the Google map
 */

			/* map service for display results*/
			
			function createMarkerButton(m, idx) {
				var item = document.getElementById(idx);
				  //Trigger a click event to marker when the button is clicked.
				  google.maps.event.addDomListener(item, "click", function(){ //mouseover
					    infoWnd.setContent(
					    		'<strong>' + $(item).data('title') + '</title>' + 
					    		'<br>'+
					    		'<img class="photo_item" src="' + $(item).data('img') + '" alt="Photo">');
					    infoWnd.open(map, m);					 
					  if (map.getZoom() < detailZoom) {
						  map.setZoom(detailZoom);
					  }
					  var latlng = new google.maps.LatLng(poiList[idx].lat, poiList[idx].lng);
					  map.setCenter(latlng);	
				  });
				  
				  google.maps.event.addDomListener(item, "mouseover", function(){ //
					    infoWnd.setContent(
					    		'<strong>' + $(item).data('title') + '</title>' + 
					    		'<br>'+
					    		'<img class="photo_item" src="' + $(item).data('img') + '" alt="Photo">');
					    infoWnd.open(map, m);	
				  });
			}
			
			function createMarker(map, latlng, title, idx) {
				  //Creates a marker
				  var m = new google.maps.Marker({
				    position : latlng,
				    map : map,
				    title : title,
				    icon: "/img/flags/vietnammarker.png",
				  });
				  ;
				  //The infoWnd is opened when the sidebar button is clicked
				  google.maps.event.addListener(m, 'click', function(){
					  google.maps.event.trigger(m, "mouseover");	
					  if (map.getZoom() < detailZoom) {
						  map.setZoom(detailZoom);
					  }
					  map.setCenter(m.position);
				  });
				  var item = document.getElementById(idx)
				  google.maps.event.addListener(m, 'mouseover', function(){
					
				    infoWnd.setContent(
				    		'<strong>' + title + '</title>' + 
				    		'<br>'+
				    		'<img class="photo_item" src="' + $(item).data('img') + '" alt="Photo">');
				    infoWnd.open(map, m);
				    
		            if (!$(item).hasClass("item_active")) {
		                var lastActive = $(item).closest("#results").children(".item_active");
		                lastActive.removeClass("item_active");
		                $(item).addClass("item_active");		                
		            }
		            
				  });
				  return m;
			}
			
			
			function showLocationLatLng(lat, lng) {
			    var me = new google.maps.LatLng(lat, lng);
			    showLocation(me);				
			}
			
			function showLocation(location) {
			    //marker.setAnimation(google.maps.Animation.BOUNCE);
			    marker.setPosition(location);
			    map.setCenter(location);			
			    marker.setVisible(true);
			}
			
			function SetMapAddress(address) {  // "London, UK" for example 
				   var geocoder = new google.maps.Geocoder();
				   if (geocoder) {
				      geocoder.geocode({ 'address': address }, function (results, status) {
				        if (status == google.maps.GeocoderStatus.OK) {
				          map.fitBounds(results[0].geometry.viewport);				          
				        }
				      });
				   }
				 }
			/* end map service to display results */	