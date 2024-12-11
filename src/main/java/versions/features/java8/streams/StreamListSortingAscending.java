/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSortingAscending {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    fruits.add("Banana");
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Orange");

    List<String> sortedList =
        fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    System.out.println(sortedList);

     List < String > sortedList1 = fruits.stream().sorted(String::compareTo).collect(Collectors.toList());
     System.out.println(sortedList1);
  }
}
