package com.apphub.algorithm;

import com.apphub.algorithm.interfaces.Factorial;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class FactorialMain {

  public FactorialMain() {}

  public static void main(String[] args) {
    System.out.println("Enter a number : ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Integer factorial = 0; // findFactorial(n);
    // Using Method Reference
    Factorial factorialRef = FactorialMain::findFactorial;
    factorial = n * factorialRef.calculateFactorial(n - 1);
    System.out.println("The factorial of " + n + " using method reference is " + factorial);
    // Using Lambda expression for predefined interface "ToIntFunction"
    ToIntFunction function = (n1) -> findFactorial((Integer) n1);
    factorial = n * (function.applyAsInt(n - 1));
    System.out.println(
        "The factorial of " + n + " using predefined interface \"ToIntFunction\" is " + factorial);
  }

  static int findFactorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * findFactorial(n - 1);
    }
  }
}
