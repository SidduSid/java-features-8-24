/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSortingDescending {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Orange");

    // descending order
    List<String> sortedList3 =
        fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(sortedList3);

    List<String> sortedList4 =
        fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
    System.out.println(sortedList4);
  }
}
