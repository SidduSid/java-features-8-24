/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingByExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Akhil");

    // Grouping names by the first letter
    Map<Character, List<String>> groupedByLetter =
        names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
    System.out.println(groupedByLetter);
  }
}
