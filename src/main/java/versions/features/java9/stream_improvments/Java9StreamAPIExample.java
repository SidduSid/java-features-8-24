/*
 * Copyright (c) 2025.  All rights are reserved
 */

package versions.features.java9.stream_improvments;

import java.util.stream.Stream;

public class Java9StreamAPIExample {
  public static void main(String[] args) {
    // 1. Stream takeWhile(Predicate Interface)
    Stream.of("a", "b", "c", "", "e", "f").takeWhile(s -> !s.isEmpty())
          .forEach(System.out::print);

    System.out.println();

    Stream.of("a", "", "c", "", "e", "f").takeWhile(s -> !s.isEmpty())
          .forEach(System.out::println);

    //2. Stream dropWhile(Predicate Interface) method
    Stream.of("a", "", "b", "c", "e", "f")
          .dropWhile(s -> !s.isEmpty()).forEach(System.out::print); //prints bcef

    System.out.println();
    Stream.of("a", "b", "c", "", "e", "", "f")
          .dropWhile(s -> !s.isEmpty()).forEach(System.out::print); //prints ef
  }
}
