package com.srikanth.algorithms;

public class StairCaseProblem {
	
	public static int findStep(int n){
	    if(n==1 || n==0){
	        return 1;
	    }else if(n==2){
	        return 2;
	    }
	    else{	        
	        return findStep(n-1)+findStep(n-2)+findStep(n-3);
	    }
	}
	
	public static void main(String args[]){
		for(int i=0;i<35;i++){
			System.out.println("Number of ways you can climb "+i+" steps is--->"+findStep(i));
		}
	}
	
}
