package com.apphub.algorithm.complexity;

public class LogNComplexityDown {

	public static void main(String[] args) {
		int n = 19;
		System.out.println(logNDown(n));
	}
	
	public static int logNDown(int n){
		int count = 0;
		for (int i = n; i > 0; ){
			count ++;
			i = i / 2;
		}
		return count;
	}

}
