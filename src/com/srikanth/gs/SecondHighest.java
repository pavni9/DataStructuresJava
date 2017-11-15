package com.srikanth.gs;

public class SecondHighest {

	public static void main(String[] args) {
		int arr[] = {2,9,6,1,8,3,9,5,8,4,6,8,4,2,7,-4,-3,-2,-1,10};
		System.out.println("Second Highest number is "+secondHigh(arr));
	}
	
	public static int secondHigh(int arr[]){
		if(arr.length==0 || arr == null){
			return 0;
		}else if(arr.length == 1){
			return arr[0];
		}else if(arr.length == 2){
			if(arr[0]>arr[1]){
				return arr[0];
			}else{
				return arr[1];
			}
		}else{
			int max1 = arr[0];
			int max2 = arr[1];
			for(int i=0;i<arr.length;i++){
				if(arr[i]>max1){
					max2 = max1;
					max1 = arr[i];
				}else if(arr[i]<max1 && arr[i]>max2){
					max2 = arr[i];
				}
			}
			return max2;
		}
	}

}
