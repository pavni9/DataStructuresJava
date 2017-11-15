package com.srikanth.gs;

public class Fabnocai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			System.out.println(fab(i));			
			System.out.println(fabRec(i));
			System.out.println("******");
		}
	}
	
	public static int fab(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int[] result = new int[n+1];
		result[0] = 0;
		result[1] = 1;
		for(int i=2;i<=n;i++){
			result[i] = result[i-1]+result[i-2];
		}
		return result[n];
	}
	
	public static int fabRec(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		return fabRec(n-1)+fabRec(n-2);
	}

}
