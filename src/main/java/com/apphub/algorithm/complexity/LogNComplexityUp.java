package com.apphub.algorithm.complexity;

public class LogNComplexityUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 39;
		System.out.println(findlogNComplexity(n));
	}
	
	public static int findlogNComplexity(int n){
		int count = 0;
		for (int i = 1; i < n; ){
			count ++;
			i = i *2;
		}
		return count;
	}
}
