package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.ProvinceService;

@RestController
@RequestMapping("provinces")
public class ProvinceController {
	
	@Autowired
	ProvinceService province;
	
	@RequestMapping("/all")
	public List<String> getProvinces(){
		List<String> list = new ArrayList<String>();
		list = province.getProvinces();
		return list;
	}
	
	@RequestMapping("/provinceById")
	public List<String> getProvincesByProvinceId(@RequestParam("provinceId") int provinceId){
		List<String> list = new ArrayList<String>();
		list = province.getProvincebyProvinceId(provinceId);
		return list;
	}
}
