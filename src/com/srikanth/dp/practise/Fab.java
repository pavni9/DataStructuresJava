package com.srikanth.dp.practise;

public class Fab {
	//Recusrion
	public static int fab(int n){
		int fab =0;
		if(n<=0 ){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			fab = fab(n-1)+fab(n-2);
		}
		return fab;
	}
	
	//Memorization
	public static int fabMem(int n){
		if(n<=0 ){
			return 0;
		}else if(n==1){
			return 1;
		}
		int[] mem = new int[n+1];
		mem[0] = 0;
		mem[1] = 1;
		for(int i=2;i<=n;i++){
			mem[i] = mem[i-1]+mem[i-2];
		}
		
		return mem[n];
	}
	
	public static void main(String args[]){
		for(int i=0;i<=45;i++){
			System.out.println("Fabonnaci value of "+i+"---->"+fab(i));
			System.out.println("Fabonnaci value of "+i+"---->"+fabMem(i));
		}
	}
}
