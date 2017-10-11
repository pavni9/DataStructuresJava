package com.srikanth.sorting;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String,Employee> hMap = new HashMap<String,Employee>();
		hMap.put("srikanth",new Employee("Srikanth"));
		hMap.put(null, null);
		hMap.put(null, null);
		hMap.put(null, null);
		hMap.put(null, null);
		hMap.put(null, null);
		hMap.put(null, null);
		hMap.put(null, null);
		
		System.out.println(hMap.get(null));
	}

}
