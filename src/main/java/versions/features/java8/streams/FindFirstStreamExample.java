/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FindFirstStreamExample {
  public static void main(String[] args) {
     //The findFirst() method returns the first element of the stream or a default value if the stream is empty.
    List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Suresh");
    System.out.println(names.stream().findFirst().orElse("AAAA"));
  }
}
