package com.apphub.algorithm.complexity;

public class NSquareLogNComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(nSquareLogNComplexity(n));
		System.out.println(nSquareLogN2Complexity(n));
		System.out.println(nSquareLogN3Complexity(n));
	}
	public static int nSquareLogNComplexity(int n){
		int count = 0;
		for (int i = 1; i < n; i = i *2){
			for (int j = 1; j < n; j++){
				for (int k = 1; k < n; k++){
					count ++;
				}
			}
		}
		return count;
	}
	public static int nSquareLogN2Complexity(int n){
		int count = 0;
		for (int i = 1; i < n; i = i + 1){
			for (int j = 1; j<n;j = j*2){
				for (int k = 1; k<n;k = k + 1){
					count ++;
				}
			}
		}
		return count;
	}
	public static int nSquareLogN3Complexity(int n){
		int count = 0;
		for (int i = 1; i < n; i++){
			for (int j = 1; j < n; j++){
				for (int k = 1; k < n; k = k *2){
					count ++;
				}
			}
		}
		return count;
	}
}
