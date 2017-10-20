package com.srikanth.dynamic.programming;

import java.util.ArrayList;
import java.util.List;

public class LIS {

	public static void main(String[] args) {
		int[] a = {3, 10, 2, 1, 20};
		System.out.println(LISCount(a).size());
		System.out.println(LISCount(a).toString());
		int[] b = {50, 3, 10, 7, 40, 80};
		System.out.println(LISCount(b).size());
		System.out.println(LISCount(b).toString());
	}
	
	public static List<Integer> LISCount(int[] arr){
		int temp =arr[0];
		List<Integer> lst = new ArrayList<>();
		for(int i:arr){
			if(i>=temp){
				lst.add(i);
			}
			temp=i;
		}
		
		return lst;
	}

}
