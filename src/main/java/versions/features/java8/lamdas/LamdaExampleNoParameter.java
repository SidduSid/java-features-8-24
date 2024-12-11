/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.lamdas;

interface Sayable {
  public String say();
}

/*Java Lambda Expression Example: No Parameter*/
public class LamdaExampleNoParameter {
  public static void main(String[] args) {

    // without lamda expression
    Sayable withLamda =
        new Sayable() {
          @Override
          public String say() {
            return "without lamda expression";
          }
        };
    System.out.println(withLamda.say());

    // with lamdas
    Sayable withOutLamda = () -> "with lamda expression";
    System.out.println(withOutLamda.say());
  }
}
