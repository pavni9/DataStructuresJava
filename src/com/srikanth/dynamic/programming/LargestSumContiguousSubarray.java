package com.srikanth.dynamic.programming;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {		 
		int[] a ={-2,-3,-4,-1,3,3,1,-3};
		System.out.println("Sum of contiguous array is "+maxSum(a));
	}
	/* corner cases are not handled */
	public static int maxSum(int[] arr){
		int max_so_far = 0;
		int max_ending_here =0;
		int startIndex =0;
		int endIndex =0;
		int s =0;
		for(int i=0;i<arr.length;i++){
			max_ending_here = max_ending_here+arr[i];
			if(max_ending_here<0){
				max_ending_here = 0;
				s =i+1;
			}
			if(max_so_far < max_ending_here){
				max_so_far = max_ending_here;
				startIndex =s;
				endIndex =i;
			}
		}
		System.out.println("*******************");
		System.out.println("Printing sub Array");
		System.out.println("*******************");
		for(int k = startIndex;k<=endIndex;k++){
			System.out.print(" "+arr[k]);
		}
		System.out.println();
		return max_so_far;
	}
	
	public static int maxSumCorner(int[] arr){
		int max_so_far =0;
		int cur_max =0;
		for(int i=0;i<arr.length;i++){
			cur_max = Math.max(arr[i], cur_max+arr[i]);
			max_so_far = Math.max(max_so_far, cur_max);
		}
		return max_so_far;
	}

}
