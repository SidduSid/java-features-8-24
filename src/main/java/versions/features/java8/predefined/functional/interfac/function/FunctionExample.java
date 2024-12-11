/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.predefined.functional.interfac.function;

import java.util.function.Function;

public class FunctionExample {
  public static void main(String[] args) {
    Function<String, Integer> function = (name) -> name.length();
    System.out.println(function.apply("Sidd"));

    // Example for Apply
    Function<Integer, String> function2 =
        (number) -> {
          if (number % 2 == 0) {
            return "Number " + number + " is even";
          } else {
            return "Number " + number + " is odd";
          }
        };
     System.out.println(function2.apply(11));

     // example for andThen
     Function < String, Integer > function3 = (t) -> t.length();
     Function < Integer, Integer > function4 = (number) -> number * 2;
     System.out.println(function3.andThen(function4).apply("sidd"));


     //This example accepts Function as an argument, convert a List into a Map
  }
}
