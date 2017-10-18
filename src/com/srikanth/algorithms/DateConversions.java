package com.srikanth.algorithms;

import java.util.Arrays;

public class DateConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = { 'v', 'a', 'z', 'k', 'b' };
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		String str = "About RESTful Web Service Security";
		str = str.replaceAll(" ", "");
		str = str.toLowerCase();
		char[] strCharArray = str.toCharArray();
		Arrays.sort(strCharArray);
		System.out.println(new String(strCharArray));
		
		for (int i = 0; i < 30; i++) {
			System.out.println("Staricase --->"+stairCase(i));
		}
	}

	public static int stairCase(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else if (n == 3) {
			return 4;
		}  else {
			return stairCase(n - 1) + stairCase(n - 2)+ stairCase(n - 3);
		}

	}
	
	public static int fab(int n){
	if(n==0){
		return 0;
	}else if(n==1){
			return 1;
		}else{
			return fab(n-1)+fab(n-2);
		}
	}
	
	public static int fabDP(int n){
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			int[] arr = new int[n+1];
			arr[0] = 1;
			arr[1] = 1;
			arr[2] = 2;
			for(int i=3;i<=n;i++){
				arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
			}
			return arr[n];
		}
	}
	

}
