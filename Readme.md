    


    JAVA 8
    
1. Java 8 Main Features
    - Java 8 Lambda Expressions
    - Java 8 Functional Interfaces
    - Java 8 Method References
    - Java 8 Stream API
    - Java 8 Optional Class
    - Java 8 Collectors Class
    - Java 8 StringJoiner Class
    - Java 8 Static and Default Methods in Interface
2. Java 8 Predefined Functional Interfaces
    1. Function Interface
        - The Function is a functional interface introduced in Java 8; it takes an argument (object of type T) and returns an object (object of type R). The argument and output can be a different type.
        - java.util.function.Function is a functional interface whose functional method (single abstract method) is R apply(T t). The Function interface represents an operation that takes single argument T and returns a result R.
    2. Java 8 Predicate interface
        - java.util.function.Predicate is a functional interface that can be used as an assignment target for a lambda expression. The Predicate interface represents an operation that takes a single input and returns a boolean value.
    3. Java 8 Consumer Interface
        - java.util.function.Consumer is a functional interface whose functional method (single abstract method) is accept(T t). The Consumer interface represents an operation that takes single argument T and returns no result:

# Java 8 Lambda Expressions
  - Summary - key points about lambda expressions
    1. Syntax Simplicity: The syntax of a lambda expression is much more concise than using anonymous inner classes.

    2. Functional Interfaces: They are used primarily to define the implementation of an abstract method defined in a functional interface (an interface with exactly one abstract method).

    3. Parameters and Body: The structure of a lambda consists of a set of parameters, an arrow ->, and the body of the lambda.

    4. Type Inference: Java's type inference mechanism can often determine the type of the parameters, allowing you to skip declaring them.

    5. Return Type: If the body of the lambda consists of a single expression, the return type will be inferred, and the return keyword is not needed.

    6. No Access Modifiers: Lambda expressions do not have access modifiers or a throws clause.

    7. Local Variable Access: Lambdas can access final or effectively final local variables of the enclosing scope.

    8. Parallel Execution Support: They can be used to facilitate parallel processing, like in streams.

    9. Enhanced Iteration: They can be used with new iteration methods provided by the Iterable interface to make iterations over collections more concise.

    10. Functional Programming Paradigm: Lambda expressions bring elements of functional programming into Java and enable functional programming techniques and styles.

    11. Immutable: The variables used inside lambda expressions must be final or effectively final, making them immutable.

    12. Interoperability with SAM Interfaces: Lambda expressions can be used wherever a Single Abstract Method (SAM) interface is expected.

    13. Target Typing: The target type of a lambda expression is determined by the context in which the lambda is used.

    14. Performance: Lambda expressions are often more performant than anonymous classes since they are not compiled into separate classes.

    15. Functional Method References: They can be used in combination with method references to further simplify code where a method already exists to perform an operation.

    16. No, this Reference: Inside a lambda expression, this keyword refers to the enclosing instance, not the lambda itself.

# Java 8 Functional Interfaces
   - Key points about the functional interface:
      1. An Interface thatOptionalBasicExample contains exactly one abstract method is known as a functional interface.
      2. It can have any number of default, static methods but can contain only one abstract method. It can also declare the methods of the object class.
      3. Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. It is a new feature in Java 8, which helps to achieve a functional  programming approach.
      4. A functional interface can extend another interface only when it does not have any abstract method.
      5. The Java  API has many one-method interfaces such as Runnable, Callable, Comparator, ActionListener, and others. They can be implemented and instantiated using anonymous class syntax.

# Java 8 Stream API
   - Java 8 introduced the Stream API, which provides a functional approach to processing sequences of elements. Streams support operations like filtering, mapping, reducing, and collecting, making it easier to perform complex data manipulations on collections in a concise, readable, and efficient way. Streams can work with collections like List, Set, and even arrays.
# Java 8 Optional Class
   - Java introduced a new class Optional in  JDK 8. It is a public final class and is used to deal with NullPointerException in Java  applications. You must import java.util package to use this class. It provides methods that are used to check the presence of a value for the particular variable.
     The purpose of the class is to provide a type-level solution for representing optional values instead of using null references.
   - Advantages of Java 8 Optional
     Null checks are not required.
     No more NullPointerException at run-time.
     We can develop clean and neat APIs.
     No more Boilerplate code 
# Java 8 Collectors Class
   - The Collectors class in Java 8 is part of the java.util.stream package and provides various utility methods to collect the results of stream operations. It's primarily used with the Stream.collect() method to convert a stream into a different form, such as a List, Set, Map, or even a concatenated String. Collectors simplify tasks like grouping, partitioning, and reducing data from streams.