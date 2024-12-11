/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.predefined.functional.interfac.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
  public static void main(String[] args) {

    // Here's an example using an anonymous class:
    BiFunction<Integer, Integer, Integer> biFunctionObj =
        new BiFunction<Integer, Integer, Integer>() {

          @Override
          public Integer apply(Integer t, Integer u) {
            return (t + u);
          }
        };

    System.out.println(biFunctionObj.apply(10, 20));

    // And with a lambda expression:
    BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> (t + u);

    BiFunction<Integer, Integer, Integer> substraction = (t, u) -> (t - u);

    BiFunction<Integer, Integer, Integer> multiplication = (t, u) -> (t * u);

    BiFunction<Integer, Integer, Integer> division = (t, u) -> (t / u);

    Function<Integer, Integer> function = (number) -> number * number;
    Integer integer = biFunction.andThen(function).apply(10, 20);
    System.out.println(integer);

    System.out.println(biFunction.apply(10, 20));
    System.out.println(substraction.apply(200, 100));

    System.out.println(multiplication.apply(200, 100));

    System.out.println(division.apply(200, 100));
  }
}
