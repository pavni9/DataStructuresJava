package com.srikanth.dynamic.programming;

public class EggDropProblem {
	public static void main(String args[]){
		 int n = 2, k = 100;
		 System.out.println(eggDrops(n,k));
	}
	
	public static int eggDrops(int eggs,int floors){
		if(floors==0 ||floors==1){
			return floors;
		}
		if(eggs==1){
			return floors;
		}
		int min= Integer.MAX_VALUE;
		int x,res;
		
		for(x =1;x <=floors;x++){
			res = Math.max(eggDrops(eggs-1,x-1), eggDrops(eggs,floors-x));
			if(res<min){
				min =res;
			}
		}
		return min+1;
	}
}
