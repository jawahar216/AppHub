package com.apphub.algorithm.complexity;

public class LogNComplexityDown {

  public static void main(String[] args) {
    int n = 39;
    System.out.println(findlogNComplexity(n));
  }

  public static int findlogNComplexity(int n) {
    int count = 0;
    for (int i = n; i > 0; ) {
      count++;
      i = i / 2;
    }
    return count;
  }
}
