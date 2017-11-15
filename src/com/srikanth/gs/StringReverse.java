package com.srikanth.gs;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India";
		System.out.println(reverse(str));
		System.out.println(rev(str));
		System.out.println(reverseRec(str));
	}
	
	public static String reverse(String str){
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	public static String rev(String str){
		String temp="";
		for(int i=str.length()-1;i>=0;i--){
			temp = temp.concat(Character.toString(str.charAt(i)));
		}
		return temp;
	}
	public static String reverseRec(String str){
		if(str.length() == 1){
			return str;
		}else{
			return str.substring(str.length()-1,str.length())+reverseRec(str.substring(0,str.length()-1));
		}
	}

}
