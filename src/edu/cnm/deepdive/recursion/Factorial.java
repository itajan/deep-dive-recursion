package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

public class Factorial {
  
  public static BigInteger factorial(int n) {
    // int product = 1;
    // for (int i = 2; i <= n; i++) {
    //   product *= i;
    // }
    // return product;
    return (n <= 1)
        ? BigInteger.ONE
        : factorial(n - 1).multiply(BigInteger.valueOf(n));
  }
}
