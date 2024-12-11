/*
 * Copyright (c) 2024.  All rights are reserved
 */

package versions.features.java8.lamdas;

public class LambdaExampleRunnable {
  public static void main(String[] args) {
    Runnable withoutLambda =
        new Runnable() {
          @Override
          public void run() {
            System.out.println("Runnable withoutLamda");
          }
        };
    Thread thread1 = new Thread(withoutLambda);
    thread1.start();

    Runnable withLambda = () -> System.out.println("Runnable withLamda");
    Thread thread2 = new Thread(withLambda);
    thread2.start();
  }
}
