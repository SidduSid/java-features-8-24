/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
   public static void main(String[] args){
      String input = "hello world";

      Map<Character, Long> characterFrequency =  input.chars()
            .filter(c -> c != ' ')
            .mapToObj(c ->  (char) c)
            .collect(Collectors.groupingBy(Function.identity(),
                  Collectors.counting()));

      // Step 3: Display the frequency of each character
      characterFrequency.forEach((character, frequency) ->
            System.out.println("'" + character + "' -> " + frequency));


   }
}
