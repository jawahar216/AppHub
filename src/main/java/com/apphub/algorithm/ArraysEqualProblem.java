package com.apphub.algorithm;

import java.util.Arrays;

// Add any extra import statements you may need here

class ArraysEqualProblem {

  // Add any helper functions you may need here

  boolean areTheyEqual(int[] array_a, int[] array_b) {
    // Write your code here
    int[] bucket = new int[1001];
    for (int i = 0; i < array_b.length; ++i) {
      bucket[array_b[i]]++;
      bucket[array_a[i]]--;
    }

    for (int i : bucket) {
      if (i > 0) return false;
    }

    return true;
  }

  boolean areTheyEqualUsingSort(int[] array_a, int[] array_b) {
    // Write your code here
    Arrays.sort(array_a);
    Arrays.sort(array_b);
    return Arrays.equals(array_a, array_b);
  }

  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom, but they are otherwise not editable!
  int test_case_number = 1;

  void check(boolean expected, boolean output) {
    boolean result = (expected == output);
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    } else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      System.out.print(expected);
      System.out.print(" Your output: ");
      System.out.print(output);
      System.out.println();
    }
    test_case_number++;
  }

  void printString(String str) {
    System.out.print("[" + str + "]");
  }

  public void run() {
    int[] array_a_1 = {1, 2, 3, 4};
    int[] array_b_1 = {1, 4, 3, 2};
    boolean expected_1 = true;
    boolean output_1 = areTheyEqualUsingSort(array_a_1, array_b_1);
    check(expected_1, output_1);

    int[] array_a_2 = {1, 2, 3, 4};
    int[] array_b_2 = {1, 4, 3, 3};
    boolean expected_2 = false;
    boolean output_2 = areTheyEqualUsingSort(array_a_2, array_b_2);
    check(expected_2, output_2);
    // Add your own test cases here

    boolean output_3 = areTheyEqual(array_a_1, array_b_1);
    check(true, output_3);
  }

  public static void main(String[] args) {
    new ArraysEqualProblem().run();
  }
}
