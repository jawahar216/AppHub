package com.apphub.algorithm.complexity;

public class NlogNComplexity {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int n = 39;
    System.out.println(nLogNComplexity(n));
  }

  public static int nLogNComplexity(int n) {
    int count = 0;
    for (int i = 1; i < n; i = i * 2) {
      for (int j = 1; j < n; j++) {
        count++;
      }
    }
    return count;
  }
}
