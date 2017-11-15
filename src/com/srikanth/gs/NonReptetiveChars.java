package com.srikanth.gs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonReptetiveChars {

	public static void main(String[] args) {
		String str = "Hello welcome to the world of programming in java";
		System.out.println("Non repeating characters in the string are "+nonRepChars(str));
	}
	
	public static String nonRepChars(String str){		
		char[] charArray = str.toCharArray();
		Map<String,Integer> map = new HashMap<>();
		for(char c:charArray){
			if(map.containsKey(Character.toString(c))){
				int temp = map.get(Character.toString(c));
				temp++;
				map.put(Character.toString(c), temp);
			}else{
				map.put(Character.toString(c),1);
			}
		}
		
		Set<String> set = map.keySet();
		String result = null;
		for(String s:set){
			if(map.get(s)==1){
				if(result!=null){
				result = result.concat(s);
				}else{
					result = s;
				}
			}
		}
		return result;
	}

}
