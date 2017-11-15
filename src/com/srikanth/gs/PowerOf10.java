package com.srikanth.gs;

public class PowerOf10 {

	public static void main(String[] args) {
		System.out.println(power10(20));
		System.out.println(power10(10));
		System.out.println(power10(100));		
		System.out.println(power10(10000));
		System.out.println(power10(200));		
		System.out.println(power10(200000));
	}
	
	public static boolean power10(int n) {
	    int i = 1;
	    while (i < n) i *= 10;   
	    return i == n;
	}

}
