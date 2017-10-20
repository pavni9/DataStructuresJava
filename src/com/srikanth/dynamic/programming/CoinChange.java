package com.srikanth.dynamic.programming;

import java.util.Arrays;

public class CoinChange {
	
	public static void main(String args[]){
		int arr[] = {1, 2, 3};
        int n = 4;
        System.out.println(countWays(n,arr));
        
	}
	
	public static int countWays(int n,int[] arr){
		int[] ways = new int[n+1];
		Arrays.fill(ways, 0);
		ways[0] =1;
		for(int i=0;i<arr.length;i++){
			for(int j=arr[i];j<=n;j++){
				ways[j]+=ways[j-arr[i]];
			}
		}
		return ways[n];
	}
}
