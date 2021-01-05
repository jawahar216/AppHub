package com.apphub.algorithm.complexity;

public class SquareRootNComplexity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		System.out.println(squareRootNComplexity(n));
	}
	public static int squareRootNComplexity(int n){
		int i=1;
		int sum = 0;
		while(sum < n){
			sum = sum + i;
			i++;
		}
		return i-1;
	}
}
