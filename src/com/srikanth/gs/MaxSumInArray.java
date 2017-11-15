package com.srikanth.gs;

public class MaxSumInArray {

	public static void main(String[] args) {
		int a[]={3,6,-3,-9,-7,-10,10};
		System.out.println(Sum(a));
	}
	
	public static int Sum(int arr[]){
		int tempPostive = 0;
		for(int i:arr){
			if(i>0){
				tempPostive+=i;
			}
		}
		return tempPostive;
	}

}
