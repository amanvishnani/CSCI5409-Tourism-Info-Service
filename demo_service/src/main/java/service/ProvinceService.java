package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProvinceService {

	public List<String> getProvinces() {
		List<String> list = new ArrayList<String>();
		list.add("NS");
		list.add("ON");
		return list;
	}
	
	public List<String> getProvincebyProvinceId(int provinceId) {
		List<String> list = new ArrayList<String>();
		
		if(provinceId==1) {
			list.add("NS");
		}else{
		list.add("ON");
		}
		return list;
	}
}
