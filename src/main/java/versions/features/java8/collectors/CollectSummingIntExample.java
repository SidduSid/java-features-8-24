/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSummingIntExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    //int sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
    int sum = numbers.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Sum: " + sum);
  }
}
