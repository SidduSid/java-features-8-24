/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class FindMaxAndMinMethodsStream {
  public static void main(String[] args) {
    List<Product> productsList = new ArrayList<Product>();
    // Adding Products
    // productsList.add(new Product(1, "HP Laptop", 25000f));
    productsList.add(new Product(2, "Dell Laptop", 30000f));
    productsList.add(new Product(3, "Lenevo Laptop", 28000f));
    productsList.add(new Product(4, "Sony Laptop", 28000f));
    productsList.add(new Product(5, "Apple Laptop", 90000f));

    Product max =
        productsList.stream()
            .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1)
            .get();
    System.out.println("Max Price:" + max.getPrice());
    Product min =
        productsList.stream()
            .min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1)
            .get();
    System.out.println("Min Price:" + min.getPrice());
  }
}
