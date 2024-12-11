/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMapExample {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Mumbai", "Delhi", "Bangalore");
     // Collecting the stream into a Map (city name -> city name length)
    Map<String, Integer> cityMap =
        cities.stream().collect(Collectors.toMap(city -> city, String::length));
     System.out.println(cityMap);
  }
}
