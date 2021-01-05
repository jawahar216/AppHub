package com.apphub.algorithm.complexity;

public class NComplexity {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int n = 39;
    System.out.println(orderNComplexity(n));
  }

  public static int orderNComplexity(int n) {
    int count = 0;
    for (int i = 1; i < n; ) {
      count++;
      i = i + 1;
    }
    return count;
  }
}
