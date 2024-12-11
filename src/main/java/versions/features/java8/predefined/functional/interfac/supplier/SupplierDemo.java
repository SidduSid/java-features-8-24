/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.predefined.functional.interfac.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) {
    Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
    System.out.println(supplier.get());
  }
}
