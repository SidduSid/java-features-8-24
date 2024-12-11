/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
   public static void main(String[] args){
      List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
      numbers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
      System.out.println("Prints Only duplicate");
      numbers.stream().filter(i -> Collections.frequency(numbers,i)>1)
            .distinct()
            .collect(Collectors.toList()).forEach(System.out::println);
   }
}
