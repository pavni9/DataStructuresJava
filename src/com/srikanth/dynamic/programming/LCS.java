package com.srikanth.dynamic.programming;


import java.util.LinkedHashSet;
import java.util.Set;

public class LCS {

	public static void main(String[] args) {
		
		  String s1 = "AGGTAB";
		  String s2 = "GXTXAYB";
		  Set<Character> set = new LinkedHashSet<>();
		  System.out.println("Length of longest subsequence in two strings is ->"+lcs(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length(),set));
		  String str=set.toString();
		  str = str.substring(1,str.length()-1);
		  str = str.replace(",","");
		  str = str.replace(" ","");
		  StringBuilder sb = new StringBuilder(str);
		  sb.reverse();
		  System.out.println(sb);
		  
	}
	
	/**
	 * Length of the largest common sub-sequence in two strings
	 */
	public static int lcs(char[] arr1,char[] arr2,int m,int n,Set<Character> set){
		if(m==0||n==0){
			return 0;
		}else if(arr1[m-1]==arr2[n-1]){
			set.add(arr1[m-1]);
			return 1+lcs(arr1,arr2,m-1,n-1,set);
		}else{
			return Math.max(lcs(arr1,arr2,m,n-1,set),lcs(arr1,arr2,m-1,n,set));
		}
	}

}
