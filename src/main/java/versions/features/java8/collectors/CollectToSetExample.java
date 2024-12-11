/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSetExample {
   public static void main(String[] args) {
      List<String> cities = Arrays.asList("Mumbai", "Delhi", "Bangalore", "Bombay", "Bombay");
      // Collecting the stream into a List
      //We use Collectors.toList() to collect the stream elements into a List.
      Set<String> cityList = cities.stream().filter(city ->
            city.startsWith("B")).collect(Collectors.toSet());
      System.out.println(cityList);
   }
}
