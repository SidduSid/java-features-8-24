/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.lamdas;

interface Addable {
  int add(int a, int b);
}

public class LambdaExampleMultipleParameters {
  public static void main(String[] args) {
    // without datatype
    Addable withDataType = ( a,  b) -> (a + b);
    System.out.println(withDataType.add(10, 10));

    // with datatype
    Addable withOutDataType = ( int a,  int b) -> (a + b);
    System.out.println(withOutDataType.add(20, 10));
  }
}
