package com.srikanth.dp.practise;

public class StairCase {
	
	public static void main(String args[]){
		for(int i=0;i<=1165;i++){
			//System.out.println("Number of ways you can climb "+i+" steps is--->"+ways(i));
			System.out.println(ways(i));
		}	
		
		for(int i=0;i<=200;i++){
			int j=i;
			while(j>0){
				System.out.print("*");
				j--;
			}
			System.out.println();
		}
		
	}
	
	public static double ways(int n){
		if(n<=1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		double[] mem = new double[n+1];
		mem[0] = 1;
		mem[1] = 1;
		mem[2] = 2;
		//mem[3] = 3;
		for(int i=3;i<=n;i++){
			mem[i] = mem[i-1]+mem[i-2]+mem[i-3]; 
		}
		
		return mem[n];
		
	}
	
	
}
