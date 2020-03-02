package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {

	public List<String> getCities() {
		List<String> list = new ArrayList<String>();
		list.add("Point Pleasant Park");
		list.add("Waterfront");
		
		list.add("Cabol Trail");
		list.add("Fortress of Louisbourg National Historic Site");
		
		list.add("Windsor Hocekt Heritage Museum");
		list.add("Fort Edward National Historic");
		
		list.add("Victoria Park");
		list.add("Joseph Howe Falls");
		
		list.add("Parliament Hill");
		list.add("National Gallery of Canada");
		
		list.add("CN Tower");
		list.add("Toronto Zoo");
		
		list.add("Waterloo Park");
		list.add("Cambridge Butterfly Conservatory");
		
		list.add("Huron National Area");
		list.add("Kitchener-Waterloo Art Gallery");
		
		return list;
	}
	
	public List<String> getLocationsByProvinceId(int provinceId) {
		List<String> list = new ArrayList<String>();
		
		if(provinceId==1) {
			
			list.add("Point Pleasant Park");
			list.add("Waterfront");
			
			list.add("Cabol Trail");
			list.add("Fortress of Louisbourg National Historic Site");
			
			list.add("Windsor Hocekt Heritage Museum");
			list.add("Fort Edward National Historic");
			
			list.add("Victoria Park");
			list.add("Joseph Howe Falls");
			
		}else{

			list.add("Parliament Hill");
			list.add("National Gallery of Canada");
			
			list.add("CN Tower");
			list.add("Toronto Zoo");
			
			list.add("Waterloo Park");
			list.add("Cambridge Butterfly Conservatory");
			
			list.add("Huron National Area");
			list.add("Kitchener-Waterloo Art Gallery");

		}
		return list;
	}
	
	public List<String> getLocationsByCityId(int cityId) {
		List<String> list = new ArrayList<String>();
		
		switch(cityId) {
		case 1:  
			list.add("Point Pleasant Park");
			list.add("Waterfront");
			break;
		case 2: 
			list.add("Cabol Trail");
			list.add("Fortress of Louisbourg National Historic Site");
			break;
		case 3: 
			list.add("Windsor Hocekt Heritage Museum");
			list.add("Fort Edward National Historic");
			break;
		case 4: 
			list.add("Victoria Park");
			list.add("Joseph Howe Falls");
			break;
		case 5: 
			list.add("Parliament Hill");
			list.add("National Gallery of Canada");
			break;
		case 6: 
			list.add("CN Tower");
			list.add("Toronto Zoo");
			break;
		case 7: 
			list.add("Waterloo Park");
			list.add("Cambridge Butterfly Conservatory");
			break;
		case 8: 
			list.add("Huron National Area");
			list.add("Kitchener-Waterloo Art Gallery");
			break;
		default: 
			list.add("No Locations found for this city");
			break;
		}

		return list;
	}
	
	public List<String> getLocationByLocationId(int locationId) {
		List<String> list = new ArrayList<String>();
		
		switch(locationId) {
		case 1:  
			list.add("Point Pleasant Park");
			break;
		case 2: 
			list.add("Waterfront");
			break;
		case 3: 
			list.add("Cabol Trail");
			break;
		case 4: 
			list.add("Fortress of Louisbourg National Historic Site");
			break;
		case 5: 
			list.add("Windsor Hocekt Heritage Museum");
			break;
		case 6: 
			list.add("Fort Edward National Historic");
			break;
		case 7: 
			list.add("Victoria Park");
			break;
		case 8: 
			list.add("Joseph Howe Falls");
			break;
		case 9:  
			list.add("Parliament Hill");
			break;
		case 10: 
			list.add("National Gallery of Canada");
			break;
		case 11: 
			list.add("CN Tower");
			break;
		case 12: 
			list.add("Toronto Zoo");
			break;
		case 13: 
			list.add("Waterloo Park");
			break;
		case 14: 
			list.add("Cambridge Butterfly Conservatory");
			break;
		case 15: 
			list.add("Huron National Area");
			break;
		case 16: 
			list.add("Kitchener-Waterloo Art Gallery");
			break;
		default: 
			list.add("No Locations found for this city");
			break;
		}

		return list;
	}
	
}
