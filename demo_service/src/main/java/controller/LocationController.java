package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.LocationService;

@RestController
@RequestMapping("touristLocations")
public class LocationController {

	@Autowired
	LocationService locations;
	
	@RequestMapping("/all")
	public List<String> getCities(){
		List<String> list = new ArrayList<String>();
		list = locations.getCities();
		return list;
	}
	
	@RequestMapping("/locationsByProvinceId")
	public List<String> getLocationsByProvinceId(@RequestParam("provinceId") int provinceId){
		List<String> list = new ArrayList<String>();
		list = locations.getLocationsByProvinceId(provinceId);
		return list;
	}
	
	@RequestMapping("/locationsByCityId")
	public List<String> getLocationsByCityId(@RequestParam("cityId") int cityId){
		List<String> list = new ArrayList<String>();
		list = locations.getLocationsByCityId(cityId);
		return list;
	}
	
	@RequestMapping("/locationById")
	public List<String> getLocationByLocationId(@RequestParam("locationId") int locationId){
		List<String> list = new ArrayList<String>();
		list = locations.getLocationByLocationId(locationId);
		return list;
	}
	
}
