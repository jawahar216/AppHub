package com.apphub.algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BinaryGenerator {

  public static void main(String[] args) {
    System.out.println("Enter a number : ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] A = new int[n];
    printBinaryArray(n, A);
  }

  static void printBinaryArray(int n, int[] A) {
    if (n < 1) {
      IntStream intStream = Arrays.stream(A);
      intStream.forEach(System.out::print);
      System.out.println();
      // Converting to String
      Stream stream = Stream.of(Arrays.toString(A));
      stream.forEach(System.out::print);
      System.out.println();
    } else {
      for (int i = 0; i <= 1; i++) {
        A[n - 1] = i;
        printBinaryArray(n - 1, A);
      }
    }
  }
}
