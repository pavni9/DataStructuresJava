package com.srikanth.algorithms;

public class StairCaseProblem {
	
	public static long findStep(int n){
	    if(n==1 || n==0){
	        return 1;
	    }else if(n==2){
	        return 2;
	    }
	    else{	        
	        return findStep(n-1)+findStep(n-2)+findStep(n-3);
	    }
	}
	
	public static int secondHighest(int[] a){
		if(a == null){
			return 0;
		}else if(a.length==1){
			return a[0];
		}else if(a.length == 2){
			if(a[0]>a[1]){
				return a[0];
			}else{
				return a[1];
			}
		}else{
			int max1=a[0];
			int max2=a[0];
			for(int i=0;i<a.length;i++){
				if(a[i]>max1){
					max1 = a[i];
				}
				if(a[i]<max1 && a[i]>max2){
					max2 = a[i];
				}
			}
			return max2;
		}
		
	}
	
	public static int secondLowest(int[] a){
		if(a == null){
			return 0;
		}else if(a.length==1){
			return a[0];
		}else if(a.length == 2){
			if(a[0]<a[1]){
				return a[0];
			}else{
				return a[1];
			}
		}else{
			int min1 = a[0];
			int min2 = a[0];
			for(int i=0;i<a.length;i++){
				if(a[i]<min1){
					min2 = min1;
					min1 = a[i];
				}
				if(a[i]>min1 && a[i]<min2){
					min2 = a[i];
				}
			}
			return min2;
		}
		
	}
	public static void main(String args[]){		
		for(int i=0;i<=45;i++){
			System.out.println("Number of ways you can climb "+i+" steps is--->"+findStep(i));
		}
		
		int a[] ={-1,-6,-7,1,-3,2,6,7,8,4,6,7,8,4,6,8,4,9};
		
		System.out.println("Second maximum in the array is "+secondHighest(a));
		
		System.out.println("Second minimum in the array is "+secondLowest(a));
	}
	
}
