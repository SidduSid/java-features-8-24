/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.optional;

import java.util.Optional;

public class OptionalBasicExample {
  public static void main(String[] args) {
    isPresentOptionalAPI();
    createEmptyOptionalObject();
    createEmptyOptionalObjectWithStaticAPI();
    ifPresentOptionalAPI();
    orElseOptionalAPI();
    orElseOptionalAPI();
    orElseGetOptionalAPI();
    orElseThrowOptionalAPI();
    getOptionalAPI();
  }

  // Returns an Optional with the specified present non-null value.
  private static void isPresentOptionalAPI() {
    Optional<String> opt = Optional.of("Ramesh");
    System.out.println(opt.isPresent());
  }

  // Returns an Optional with the specified present non-null value.
  private static void createEmptyOptionalObject() {
    Optional<String> empty = Optional.empty();
    System.out.println(empty.isPresent());

    // Optional object with the static of API:
    String name = "Ramesh";
    Optional.of(name);
  }

  private static void createEmptyOptionalObjectWithStaticAPI() {
    String name = "Sidd";
    Optional.of(name);
  }

  // If a value is present, invoke the specified consumer with the value, otherwise do
  // nothing.
  private static void ifPresentOptionalAPI() {
    // The ifPresent API enables us to run some code on the wrapped value if it is
    // found to be non-null.
    // Before Optional, we would do something like this:
    String name = "Sidd";
    if (name != null) {
      System.out.println(name.length());
    }

    Optional<String> opt = Optional.of("Sidd");
    opt.ifPresent(str -> System.out.println(str.length()));
  }

  // If a value is present, invoke the specified consumer with the value, otherwise do
  // nothing.
  private static void orElseOptionalAPI() {
    // With orElse, the wrapped value is returned if it is present and the argument
    // given to
    // orElse is returned if the wrapped value is absent
    String nullName = null;

    // If a value is present, invoke the specified consumer with the value, otherwise
    // do nothing.
    //
    String name = Optional.ofNullable(nullName).orElse("Sidd");
    System.out.println(name);
  }

  private static void orElseGetOptionalAPI() {
    String nullName = null;
    String name = Optional.ofNullable(nullName).orElseGet(() -> "Sidd");
    System.out.println(name);
  }

  private static void orElseThrowOptionalAPI() {

    // This will throw exception
    String nullName = null;
    String name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
    System.out.println(name);
  }

  private static void getOptionalAPI() {
    Optional<String> opt = Optional.of("Sidd");
    String name = opt.get();
    System.out.println(name);
  }
}
