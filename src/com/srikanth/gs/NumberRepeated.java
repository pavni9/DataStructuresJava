package com.srikanth.gs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberRepeated {

	public static void main(String[] args) {
		int arr[] = {2,9,6,1,8,3,9,5,8,4,6,8,4,2,7,-4,-3,-2,-1,10};
		repeatedMaxNumberOfTimes(arr);

	}
	
	public static void repeatedMaxNumberOfTimes(int[] arr){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i:arr){
			int temp =0;
			if(map.containsKey(i)){
				temp = map.get(i);
				temp++;
				map.put(i, temp);
			}else{
				map.put(i, 1);
			}
		}
		Set<Integer> keys = new HashSet<>();
		keys= map.keySet();
		int max=0;
		int number=0;
		for(int i:keys){
			if(max<map.get(i))
			{
				max = map.get(i);
				number = i;
			}
		}
		System.out.println("Number "+number+" appreared "+max+" times in the array");
	}

}
