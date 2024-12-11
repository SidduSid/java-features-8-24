/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectJoiningStringExample {
   public static void main(String[] args){
      List<String> cities = Arrays.asList("Mumbai", "Delhi", "Bangalore", "Chennai");

      // Joining elements into a single String
      String joinedCities = cities.stream().collect(Collectors.joining(" "));
      //String joinedCities = String.join(" ", cities);

      System.out.println(joinedCities);
   }
}
