/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceStreamExample {
   public static void main(String[] args){
      //The reduce() method is used to reduce a stream to a single value.
      //The reduce() method adds all elements of the stream, starting with 0.
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

      // Skip the first 2 elements
      //numbers.stream().skip(2).forEach(System.out::println);

      // Sum of all numbers using reduce()
      int sum = numbers.stream().reduce(0, Integer::sum);
      //int sum = numbers.stream().reduce(0,(a,b) -> a + b);
      System.out.println("Sum: " + sum);
   }
}
