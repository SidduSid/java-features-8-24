/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.predefined.functional.interfac.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
  public static void main(String[] args) {
     // Test method for predicate example
    Predicate<Integer> predicate =
        (t) -> {
          if (t % 2 == 0) {
            return true;
          } else {
            return false;
          }
        };
    System.out.println(predicate.test(10));

     // Test method and default and method for predicate example
     List< Integer > list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 16, 18);
     Predicate<Integer> predicate1 = (x) -> x>3;
     Predicate<Integer> predicate2 = (x) -> x<10;
     list1.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList()).forEach(System.out::print);


     // Test method and default or method for predicate example
     Predicate < String > lengthIs3 = x -> x.length() == 3;
     Predicate < String > startWithA = x -> x.startsWith("A");

     List < String > list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

     List < String > collect = list.stream()
           .filter(lengthIs3.or(startWithA))
           .collect(Collectors.toList());

     System.out.println(collect);

  }
}
