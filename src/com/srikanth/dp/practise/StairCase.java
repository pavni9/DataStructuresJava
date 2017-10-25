package com.srikanth.dp.practise;

public class StairCase {
	
	public static void main(String args[]){
		for(int i=0;i<=36;i++){
			System.out.println("Number of ways you can climb "+i+" steps is--->"+ways(i));
		}		
		
	}
	
	public static int ways(int n){
		if(n<=1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		int[] mem = new int[n+1];
		mem[0] = 1;
		mem[1] = 1;
		mem[2] = 2;
		//mem[3] = 3;
		for(int i=3;i<=n;i++){
			mem[i] = mem[i-1]+mem[i-2]; 
		}
		
		return mem[n];
		
	}
	
	
}
