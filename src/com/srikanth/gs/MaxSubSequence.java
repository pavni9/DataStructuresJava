package com.srikanth.gs;

import java.util.HashMap;
import java.util.Set;

public class MaxSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestSubSquence("aabbbbcccdd");
		longestSubSquence("11000001");
		longestSubseq("aabbbbcccddbbbbbb");
	}
	//wont work for duplicates 
	public static int[] longestSubSquence(String str){
		int[] charCount = new int[256];
		char[] charArr = str.toCharArray();
		for(char c :charArr){
			charCount[c]++;
		}
		int max = 0;
		int index =0;
		for(int i=0;i<256;i++){
			if(max<charCount[i]){
				max = charCount[i];
				index = i;
			}
		}
		int startIndex = str.indexOf(index);
		System.out.println(startIndex+"---->"+max);
		return new int[]{startIndex,max};
	}
	//works for all scenarios
	public static int[] longestSubseq(String str){
		HashMap<Integer,Integer> map = new HashMap<>();
		char[] charArr = str.toCharArray();
		for(int i=0;i<charArr.length;){
			int j=0;
			int index_start = i;
			char c = charArr[i];
			while(i<charArr.length && charArr[i]==c){
				i++;
				j++;
			}
			map.put(index_start, j);
		}
		int key = 0;
		int value = 0;
		Set<Integer> set = map.keySet(); 
		for(int in : set){
			if(value<map.get(in)){
				key = in;
				value = map.get(in);
			}
		}
		System.out.println(key+"---->"+value);
		return new int[]{key,value};
	}
}
