package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CityService {

	public List<String> getCities() {
		List<String> list = new ArrayList<String>();
		list.add("Halifax");
		list.add("Cape Breton");
		list.add("Windsor");
		list.add("Truro");
		
		list.add("Ottawa");


		return list;
	}
	
	public List<String> getCitiesByProvinceId(int provinceId) {
		List<String> list = new ArrayList<String>();
		
		if(provinceId==1) {
			list.add("Halifax");
			list.add("Cape Breton");
			list.add("Windsor");
			list.add("Truro");
		}else{
			list.add("Ottawa");
			list.add("Toronto");
			list.add("Kitchener");
			list.add("Waterloo");
		}
		return list;
	}
	
	public List<String> getCityByCityId(int cityId) {
		List<String> list = new ArrayList<String>();
		
		switch(cityId) {
		case 1:  
			list.add("Halifax");
			break;
		case 2: 
			list.add("Fortress of Louisbourg National Historic Site");
			break;
		case 3: 
			list.add("Fortress of Louisbourg National Historic Site");
			break;
		case 4: 
			list.add("Joseph Howe Falls");
			break;
		case 5: 
			list.add("National Gallery of Canada");
			break;
		case 6: 
			list.add("Toronto Zoo");
			break;
		case 7: 
			list.add("Cambridge Butterfly Conservatory");
			break;
		case 8: 
			list.add("Kitchener-Waterloo Art Gallery");
			break;
		default: 
			list.add("No city found for this cityId");
			break;
		}

		return list;
	}
	
}
