/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.lamdas;

interface IAverage {
  double average(int[] array);
}

public class LambdaExampleMultipleStatements {
  public static void main(String[] args) {
    IAverage withLamda =
        (int[] lambdaArray) -> {
          double sum = 0;
          int size = lambdaArray.length;
          for (int i = 0; i < size; i++) {
            sum = sum + lambdaArray[i];
          }
          System.out.println("sum : " + sum);
          return (sum / size);
        };

    int[] withLambdaArray = {1, 4, 6, 8, 9};
    System.out.println(withLamda.average(withLambdaArray));
  }
}
