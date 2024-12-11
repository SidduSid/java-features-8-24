/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.lamdas;

interface Printable {
  void print(String message);
}

/*Java Lambda Expression Example: Single Parameter*/
public class LambdaExampleSingleParameter {
  public static void main(String[] args) {
    Printable printable = (message -> System.out.println(message));
    printable.print("Single Parameter");
  }
}
