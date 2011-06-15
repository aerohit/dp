## Design Principles:

Practice code from the book Head First Design Principles.

### Chapter 1- The Strategy Pattern

* Identify the aspects of your application that vary and separate them from what stays the same.
* Program to an interface, not an implementation.
* Favor composition over inheritance (HAS-A can be better than IS-A).

### Chapter 2- The Observer Pattern

* Strive for loosely coupled designs between objects that interact.

### Chapter 3- The Decorator Pattern

* The open-closed principle: Classes should be open for extension, but closed for modification.

**Tip** - Inheritance isn't always used for code reuse, in this example CondimentDecorator extends Beverage just to do type matching.

### Chapter 4- The Factory Pattern (with Abstract Factory)

* Dependency Inversion Principle - Depend on abstractions. Do not depend on concrete classes.

Some guidelines to follow the DIP:

1. No variable should hold a reference to a concrete class.
2. No class should derive from a concrete class.
3. No method should override an implemented method of any of its base classes.

### Chapter 5- The Singleton Pattern

* Ensure a class only has one instance and provide a global point of access to it. Make sure it is thread safe.