package com.srikanth.gs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonReptetiveChars {

	public static void main(String[] args) {
		String str = "Hello welcome to the world of programming in java";
		System.out.println("Non repeating characters in the string are --->"+nonRepChars(str));
		
		System.out.println("First non repeating characters in the string is --->"+firstNonRepChars(str));
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
	
	public static String firstNonRepChars(String str){		
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
		
		int temp =0;
		for(int i=0;i<charArray.length;i++){			
			temp = map.get(Character.toString(charArray[i]));
			if(temp == 1){
				return Character.toString(charArray[i]);
			}
		}
		return null;
	}

}
