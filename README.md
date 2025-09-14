# 🚗 Car Builder Pattern in Java

## 1. Introduction
This project demonstrates the **Builder Design Pattern** in Java using a `Car` as the product.  
The Builder Pattern allows constructing objects step by step.  

---

## 2. Product: `Car`
The `Car` class has three attributes:
- `model` (e.g., "Sports Car", "Family Car")
- `engine` (e.g., "V8", "Hybrid")
- `seats` (e.g., 2, 5)

The constructor is **private**, so only the `Builder` can create `Car` objects.

---

## 3. Builder Implementation
Example usage:

```java
Car sportsCar = new Car.Builder()
        .setModel("Sports Car")
        .setEngine("V8")
        .setSeats(2)
        .build();

Car familyCar = new Car.Builder()
        .setModel("Family Car")
        .setEngine("Hybrid")
        .setSeats(5)
        .build();
4. Clean Code Principles Applied
Meaningful Names → setModel(), setEngine(), setSeats().

Small Functions → each method does one thing only.

Immutability → once built, a Car object cannot be changed.

Readable Fluent Interface → chainable methods read like sentences.

5. Example Output
css

Car [Model='Sports Car', Engine='V8', Seats=2]
Car [Model='Family Car', Engine='Hybrid', Seats=5]
6. Conclusion
The Builder Pattern makes object creation simpler, more readable, and maintainable.
This implementation applies Clean Code principles to ensure clarity and flexibility.
