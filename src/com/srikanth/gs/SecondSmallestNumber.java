package com.srikanth.gs;

public class SecondSmallestNumber {

	public static void main(String[] args) {
	int arr[] = {2,9,6,1,8,3,9,5,8,4,6,8,4,2,7,-4,-3,-2,-1};
	System.out.println("Second Smallest number is "+secondSmallestNumber(arr));

	}
	
	public static int secondSmallestNumber(int[] arr){
		if(arr.length==0 || arr == null){
			return 0;
		}else if(arr.length == 1){
			return arr[0];
		}else if(arr.length == 2){
			if(arr[0]<arr[1]){
				return arr[0];
			}else{
				return arr[1];
			}
		}else{
			int min1 = arr[0];
			int min2 = arr[0];
			
			for(int i=0;i<arr.length;i++){
				if(arr[i]<min1){
					min2 = min1;
					min1 = arr[i];
				}else if(arr[i]>min1 && arr[i]<min2){
					min2 = arr[i];
				}
				
			}
			return min2;
		}	
		
	}

}
