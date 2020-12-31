package com.apphub.algorithm;

import java.util.Scanner;

public class SortedArrayRecursion {
    public static void main(String... args)
    {
       System.out.println("Enter size of the array");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] array = new int[n];
        for (int i=0 ; i<n; i++) {
            array[i] = scanner.nextInt();
        }
        if (isArraySorted(array, n) == 1) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
    }

    private static int isArraySorted(int[] array, int n) {
        if(n==1)
            return 1;
           return (array[n-1]<array[n-2]) ? 0 :  isArraySorted(array,n-1);
    }
}
