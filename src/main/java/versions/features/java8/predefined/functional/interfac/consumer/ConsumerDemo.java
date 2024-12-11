/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.predefined.functional.interfac.consumer;

import java.util.Objects;
import java.util.function.Consumer;

public class ConsumerDemo {
   public static void main(String[] args){
      // example 1
      Consumer< String > consumer = (t) -> System.out.println(t);
      consumer.accept("Sidd");

      // example 2
      Consumer< String > consumer1 = (t) -> System.out.println("Hello"+ t);
      Consumer< String > consumer2 = (t) -> System.out.println("Hi"+ t);
      consumer1.andThen(consumer2).accept("Sidd");

    // The java.lang.Iterable.forEach() method internally uses Consumer interface. Here is the
    // forEach() method implementation:

      /*default void forEach(Consumer << ? super T > action) {
         Objects.requireNonNull(action);
         for (T t: this) {
            action.accept(t);
         }
      }*/
  }
}
