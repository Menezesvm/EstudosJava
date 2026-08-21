# 02 - Intermediate Level - Java Learning Path

## Overview

This folder gathers the **Object-Oriented Programming (OOP) in Java** studies, continuing from [`01-Basic Level`](../01-Basic%20Level/README.md). While the basic stage focused on syntax, control structures, and programming logic, the focus here shifts to **how to organize and structure object-oriented code**: classes, encapsulation, inheritance, abstract classes, composition, enums, collections, and date handling with the modern `java.time` API.

Each subfolder is an independent mini-project (with its own `src/` folder), representing an exercise or small system that exercises a specific OOP concept.

## What You'll Find

- **Encapsulation and entity modeling**: classes with private fields, getters/setters, and data validation
- **Inheritance and polymorphism**: class hierarchies using `extends`, `super`, and method overriding (`@Override`)
- **Abstract classes**: contracts that force subclasses to provide their own implementation of a method
- **Interfaces**: fully abstract contracts (`implements`) used to decouple business rules from their concrete implementations
- **Exception handling**: custom exceptions (`RuntimeException`) and `try/catch` blocks to handle business-rule violations
- **Composition**: "has-a" relationships between objects (e.g., an order that contains items, which contain products)
- **Enums**: representing fixed states (e.g., an order's status)
- **Collections**: using `ArrayList`/`List` to manage groups of objects
- **Date handling**: comparing the legacy API (`Date`/`SimpleDateFormat`) with the modern API (`java.time`)
- **Arrays of objects**: entity arrays and aggregate calculations (sum, average)
- **Simple menu systems**: small console applications with register/query features

## Folder Structure

<<<<<<< HEAD:02- Intermediated Level/README.md
| Project | application.application.application.Program concept | Description |
=======
| Project | Main concept | Description |
>>>>>>> 70368d2fe610044a68ced1b9944e8c29b976be23:02- Intermediated Level/README - 02-Intermediate Level (EN).md
|---|---|---|
| [`AccountBank`](AccountBank) | Encapsulation / Constructor overloading | Bank account with two constructors (with and without an initial deposit), deposit, and withdrawal with a fixed $5 fee. |
| [`Aluno`](Aluno) | Basic encapsulation | `Student` class that calculates the final grade (sum of 3 grades) and the points missing to reach a passing average of 60. |
| [`Cinema`](Cinema) | Encapsulation / Business rules | Box-office system (`Ticket`) that applies a discount by age (children/seniors) or by student card. |
| [`Composition`](Composition) | **Composition** + Enum | Order system: `Order` is composed of several `OrderItem`s, each linked to a `Product`; `Client` holds the buyer's data; `OrderStatus` is an enum (`PROCESSING`, `PENDING`, `SHIPPED`, `DELIVERED`). |
| [`DateTime`](DateTime) | `java.time` API | Exercise comparing `LocalDate`, `LocalDateTime`, and `Instant`, including parsing and formatting with `DateTimeFormatter`. |
| [`Dolar`](Dolar) | Static utility method | Dollar-to-real converter, applying a 6% IOF (financial tax) on the exchange rate. |
| [`Employee`](Employee) | Basic encapsulation | `Employee` class (`Salary` package) with net salary calculation and percentage-based raise. |
| [`Employees`](Employees) | **Collections** (`List`) + Streams | Registers several employees in a list, validates duplicate IDs, and applies a salary raise using a `Stream`. |
| [`Estudo vetores`](Estudo%20vetores) | Arrays of objects | Reads N products via `Scanner` and calculates the average price using an array of `Product`. |
| [`ExceptionHandling`](ExceptionHandling) | **Exception handling** | Bank account with a `withdraw` method that throws a custom exception (`BusinessExceptions`, extending `RuntimeException`) when the amount exceeds the withdrawal limit or the available balance; the error is handled with `try/catch` in `Program`. |
| [`Inheritance`](Inheritance) | **Inheritance** + `@Override` | `Account` → `BusinessAccount` (with credit limit and withdrawal fee) and `SavingsAccount` (savings account with interest rate) hierarchy. |
| [`Inheritance1`](Inheritance1) | **Inheritance** + Polymorphism | `Product` → `ImportedProduct` (with customs fee) and `UsedProduct` (with manufacture date) hierarchy, each overriding `priceTag()`. |
| [`Inheritance2`](Inheritance2) | **Abstract class** + Polymorphism | `TaxPrayer` (abstract) → `Individual` and `Company` hierarchy, each calculating tax (`tax()`) with its own rule; uses `List<TaxPrayer>` to sum the total collected. |
| [`Interfaces`](Interfaces) | **Interface** (`implements`) | Installment-contract system: the `OnlinePaymentService` interface defines `paymentFee()` and `interest()`, implemented by `PaypalService`; `ContractService` uses the interface to calculate a `Contract`'s `Installment`s without depending on a concrete implementation. |
| [`Primeiroprojeto`](Primeiroprojeto) | Menu system (procedural) | Simple library system using static variables to store the state of a single book (register, borrow, return). |
| [`Rent`](Rent) | Arrays of objects | Room-rental registration using an array of `Rent`, indexed by room number. |
| [`Retangulo`](Retangulo) | Basic encapsulation | `Retangulo` class with area, perimeter, and diagonal calculations. |
| [`SistemaBiblioteca`](SistemaBiblioteca) | **Applied OOP** (evolved version) | Evolution of the library system: now object-oriented, with `Livro` and `Biblioteca` classes (which manages an `ArrayList<Livro>`), allowing books to be registered, listed, and searched. |

> 💡 **Note:** `Primeiroprojeto` and `SistemaBiblioteca` solve the same problem (a library system) at two different learning stages — the first still procedural (using static methods and variables), the second already using real classes and objects (`Livro` and `Biblioteca`). It's a good example of the shift in reasoning from "procedural code" to "object-oriented code".

## Suggested Learning Progression

1. **Class fundamentals** — `Retangulo`, `Aluno`, `Employee`: practice creating simple classes with fields and calculation methods.
2. **Encapsulation with validation** — `Cinema`, `AccountBank`: add getters/setters with business rules and constructor overloading.
3. **Arrays of objects** — `Estudo vetores`, `Rent`: group multiple objects into arrays and process them in loops.
4. **Dynamic collections** — `Employees`: move from fixed arrays to `ArrayList`, including using a `Stream` for lookups.
5. **Inheritance and polymorphism** — `Inheritance`, `Inheritance1`: create specialized subclasses and override behavior with `@Override`.
6. **Abstract classes** — `Inheritance2`: go a step further than "plain" inheritance by defining an `abstract` method (`tax()`) that forces each subclass (`Individual`, `Company`) to provide its own implementation — an introduction to the contract/forced-polymorphism concept, which comes before studying interfaces.
7. **Interfaces** — `Interfaces`: go one step further than abstract classes by defining a fully abstract contract (`OnlinePaymentService`) implemented by `PaypalService`, allowing the payment method to be swapped without changing `ContractService`.
8. **Composition** — `Composition`: build complex objects out of other objects (order → items → product) and use an `enum` to represent states.
9. **Dates and times** — `DateTime`: compare the legacy API (`Date`) used in `Composition` with the modern API (`java.time`) used in `DateTime`, `Inheritance1`, and `Interfaces`.
10. **Exception handling** — `ExceptionHandling`: create a custom exception (`BusinessExceptions`) and use `try/catch` to handle business-rule violations (e.g., a withdrawal above the limit or balance).
11. **Complete systems** — `Primeiroprojeto` → `SistemaBiblioteca`: compare the same application solved procedurally and then in an object-oriented way.

## Key Concepts Covered

| Concept | Where it appears |
|---|---|
| **Encapsulation** (private fields + getters/setters) | Almost every project |
| **Constructor overloading** | `AccountBank` |
| **Inheritance (`extends`, `super`)** | `Inheritance`, `Inheritance1`, `Inheritance2` |
| **Abstract class (`abstract class`, `abstract` method)** | `Inheritance2` |
| **Interface (`interface`, `implements`)** | `Interfaces` |
| **Polymorphism / `@Override`** | `Inheritance`, `Inheritance1`, `Inheritance2`, `Interfaces`, `Composition` (`toString`) |
| **Object composition** | `Composition` |
| **Enums** | `Composition` (`OrderStatus`) |
| **Collections (`ArrayList`, `List`)** | `Employees`, `SistemaBiblioteca`, `Interfaces` (installment list) |
| **Streams / lambda expressions** | `Employees` |
| **Arrays of objects** | `Estudo vetores`, `Rent` |
| **Static methods and fields** | `Dolar`, `Primeiroprojeto` |
| **Date handling (legacy and modern)** | `Composition` (`Date`), `DateTime`, `Inheritance1`, and `Interfaces` (`java.time`) |
| **Custom exceptions (`extends RuntimeException`)** | `ExceptionHandling` |
| **Input validation and business rules** | `Cinema`, `SistemaBiblioteca`, `Livro`, `ExceptionHandling` |

## How to Run the Projects

Each project has its own `src/` folder. To compile and run manually:

```bash
# Generic example (adjust packages/paths per project)
cd "ProjectName"
javac -d bin $(find src -name "*.java")
<<<<<<< HEAD:02- Intermediated Level/README.md
java -cp bin application.application.application.application.Program   # or the main class name (application.application.application.Program.java)
=======
java -cp bin application.Program   # or the main class name (Main.java)
>>>>>>> 70368d2fe610044a68ced1b9944e8c29b976be23:02- Intermediated Level/README - 02-Intermediate Level (EN).md
```

Or open the folder directly in your IDE (IntelliJ IDEA, VS Code with the Java extension, Eclipse) and run the class containing the `main` method — usually located at `src/application/Program.java` or `src/application/Main.java` (some older projects use `Application` with an uppercase "A").

## Next Steps

After finishing this folder, the natural next topics to continue the learning path are:

- Interfaces (building on what `Inheritance2` started with abstract classes — already covered in `Interfaces`)
- Generics
- More advanced collections (`Map`, `Set`) and sorting (`Comparable`/`Comparator`)
- Unit testing (JUnit)
- Data persistence (files, databases, JDBC)

---

**Repository:** [Menezesvm/EstudosJava](https://github.com/Menezesvm/EstudosJava)
**Language:** Java
**Level:** Intermediate (OOP)
