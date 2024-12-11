/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapStreamExample {
  public static void main(String[] args) {
     //The flatMap() method is used to flatten the nested lists into a single stream of names.
    List<List<String>> nestedList =
        Arrays.asList(Arrays.asList("Amit", "Rahul"),
              Arrays.asList("Deepa", "Suresh"));
    nestedList.stream().flatMap(List::stream).forEach(System.out::println);
  }
}
