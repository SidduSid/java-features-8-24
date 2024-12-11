/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.programs;

import java.util.Arrays;
import java.util.List;

public class MaxMinWithStreams {
   public static void main(String[] args){
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      System.out.println(numbers.stream().mapToInt(Integer::intValue).max().getAsInt());
      System.out.println(numbers.stream().mapToInt(Integer::intValue).min().getAsInt());

   }
}
