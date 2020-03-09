//package dal.cloud.tourism.InformationService.controllers;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import dal.cloud.tourism.InformationService.dao.CityService;
//
//@RestController
//@RequestMapping("cities")
//public class CityController {
//
//	@Autowired
//	CityService cities;
//	
//	@RequestMapping("/all")
//	public List<String> getCities(){
//		List<String> list = new ArrayList<String>();
//		list = cities.getCities();
//		return list;
//	}
//	
//	@RequestMapping("/cityById")
//	public List<String> getCitiesByCityId(@RequestParam("cityId") int cityId){
//		List<String> list = new ArrayList<String>();
//		list = cities.getCityByCityId(cityId);
//		return list;
//	}
//	
//	@RequestMapping("/citiesByProvinceId")
//	public List<String> getCitiesByProvinceId(@RequestParam("provinceId") int provinceId){
//		List<String> list = new ArrayList<String>();
//		list = cities.getCitiesByProvinceId(provinceId);
//		return list;
//	}
//	
//}
