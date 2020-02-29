package com.apphub.algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KstringGenerator {

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter value for k : ");
        int k = scanner.nextInt();
        int[] A = new int[n];
        printKstringArray(n, k, A);
    }

    static void printKstringArray(int n, int k, int[] A) {
        if (n < 1) {
            IntStream intStream = Arrays.stream(A);
            intStream.forEach(System.out::print);
            System.out.println();
            //Converting to String
            Stream stream = Stream.of(Arrays.toString(A));
            stream.forEach(System.out::print);
            System.out.println();
        } else {
            for (int i = 0; i < k; i++) {
                A[n - 1] = i;
                printKstringArray(n - 1, k, A);
            }
        }
    }
}