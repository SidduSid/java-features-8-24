/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedStreamExample {
   public static void main(String[] args){
      List<String> names = Arrays.asList("Suresh", "Amit", "Deepa", "Rahul");

      // Sort and print names reverse
      Comparator<String> comp = Comparator.naturalOrder();
      names.stream().sorted(comp.reversed()).forEach(System.out::println);

      // Sort and print names fwd
      List<String> names1 = Arrays.asList("Suresh", "Amit", "Deepa", "Rahul");
      names1.stream().sorted().forEach(System.out::println);
   }
}
