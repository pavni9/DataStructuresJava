package com.srikanth.gs;

public class PrimeNumber {
	
	public static void main(String args[]){		
		
		for(int i=0;i<100;i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int n){
		if(n<=0 || n==1){
			return false;
		}if(n==2){
			return true;
		}else{
			for(int i= 2;i<n;i++){
				if(n%i==0){
					return false;
				}
			}
			return true;
		}
	}
}
