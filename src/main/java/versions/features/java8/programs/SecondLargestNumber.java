/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
   public static void main(String[] args){
      List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 50, 75, 65);
      Optional<Integer> secondLargest = numbers.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst();
     if (secondLargest.isPresent()) {
       System.out.println("The second largest number is: " + secondLargest.get());
     } else {
       System.out.println("The list does not have enough unique numbers.");
     }
   }
}
