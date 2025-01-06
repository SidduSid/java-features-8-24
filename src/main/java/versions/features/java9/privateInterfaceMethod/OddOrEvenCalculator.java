/*
 * Copyright (c) 2025.  All rights are reserved
 */

package versions.features.java9.privateInterfaceMethod;

public class OddOrEvenCalculator implements CustomCalculator {
  public static void main(String[] args) {
    CustomCalculator demo = new OddOrEvenCalculator();

    int sumOfEvens = demo.addEvenNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println(sumOfEvens);

    int sumOfOdds = demo.addOddNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println(sumOfOdds);
  }
}
