/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Akhil");
    // The Collectors.groupingBy() method is used to group elements in a stream based on a
    // classifier function.
    // Group names by the first letter
    Map<Character, List<String>> groupByLetter =
        names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
    System.out.println(groupByLetter);
    groupByLetter.forEach(
        (key, value) -> System.out.println("count of Names Starts with Letter " + key + ":" + value.size()));
  }
}
