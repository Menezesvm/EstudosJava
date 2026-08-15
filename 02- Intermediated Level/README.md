# 02 - Intermediate Level - Java Learning Path

## Overview

This folder gathers the **Object-Oriented Programming (OOP) in Java** studies, continuing from [`01-Basic Level`](../01-Basic%20Level/README.md). While the basic stage focused on syntax, control structures, and programming logic, the focus here shifts to **how to organize and structure object-oriented code**: classes, encapsulation, inheritance, abstract classes, composition, enums, collections, and date handling with the modern `java.time` API.

Each subfolder is an independent mini-project (with its own `src/` folder), representing an exercise or small system that exercises a specific OOP concept.

## What You'll Find

- **Encapsulation and entity modeling**: classes with private fields, getters/setters, and data validation
- **Inheritance and polymorphism**: class hierarchies using `extends`, `super`, and method overriding (`@Override`)
- **Abstract classes**: contracts that force subclasses to provide their own implementation of a method
- **Composition**: "has-a" relationships between objects (e.g., an order that contains items, which contain products)
- **Enums**: representing fixed states (e.g., an order's status)
- **Collections**: using `ArrayList`/`List` to manage groups of objects
- **Date handling**: comparing the legacy API (`Date`/`SimpleDateFormat`) with the modern API (`java.time`)
- **Arrays of objects**: entity arrays and aggregate calculations (sum, average)
- **Simple menu systems**: small console applications with register/query features

## Folder Structure

| Project | Main concept | Description |
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
| [`Inheritance`](Inheritance) | **Inheritance** + `@Override` | `Account` → `BusinessAccount` (with credit limit and withdrawal fee) and `SavingsAccount` (savings account with interest rate) hierarchy. |
| [`Inheritance1`](Inheritance1) | **Inheritance** + Polymorphism | `Product` → `ImportedProduct` (with customs fee) and `UsedProduct` (with manufacture date) hierarchy, each overriding `priceTag()`. |
| [`Inheritance2`](Inheritance2) | **Abstract class** + Polymorphism | `TaxPrayer` (abstract) → `Individual` and `Company` hierarchy, each calculating tax (`tax()`) with its own rule; uses `List<TaxPrayer>` to sum the total collected. |
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
7. **Composition** — `Composition`: build complex objects out of other objects (order → items → product) and use an `enum` to represent states.
8. **Dates and times** — `DateTime`: compare the legacy API (`Date`) used in `Composition` with the modern API (`java.time`) used in `DateTime` and `Inheritance1`.
9. **Complete systems** — `Primeiroprojeto` → `SistemaBiblioteca`: compare the same application solved procedurally and then in an object-oriented way.

## Key Concepts Covered

| Concept | Where it appears |
|---|---|
| **Encapsulation** (private fields + getters/setters) | Almost every project |
| **Constructor overloading** | `AccountBank` |
| **Inheritance (`extends`, `super`)** | `Inheritance`, `Inheritance1`, `Inheritance2` |
| **Abstract class (`abstract class`, `abstract` method)** | `Inheritance2` |
| **Polymorphism / `@Override`** | `Inheritance`, `Inheritance1`, `Inheritance2`, `Composition` (`toString`) |
| **Object composition** | `Composition` |
| **Enums** | `Composition` (`OrderStatus`) |
| **Collections (`ArrayList`, `List`)** | `Employees`, `SistemaBiblioteca` |
| **Streams / lambda expressions** | `Employees` |
| **Arrays of objects** | `Estudo vetores`, `Rent` |
| **Static methods and fields** | `Dolar`, `Primeiroprojeto` |
| **Date handling (legacy and modern)** | `Composition` (`Date`), `DateTime` and `Inheritance1` (`java.time`) |
| **Input validation and business rules** | `Cinema`, `SistemaBiblioteca`, `Livro` |

## How to Run the Projects

Each project has its own `src/` folder. To compile and run manually:

```bash
# Generic example (adjust packages/paths per project)
cd "ProjectName"
javac -d bin $(find src -name "*.java")
java -cp bin application.Program   # or the main class name (Main.java)
```

Or open the folder directly in your IDE (IntelliJ IDEA, VS Code with the Java extension, Eclipse) and run the class containing the `main` method — usually located at `src/application/Program.java` or `src/application/Main.java` (some older projects use `Application` with an uppercase "A").

## Next Steps

After finishing this folder, the natural next topics to continue the learning path are:

- Interfaces (building on what `Inheritance2` started with abstract classes)
- Exception handling (`try/catch`, custom exceptions)
- Generics
- More advanced collections (`Map`, `Set`) and sorting (`Comparable`/`Comparator`)
- Unit testing (JUnit)
- Data persistence (files, databases, JDBC)

---

**Repository:** [Menezesvm/EstudosJava](https://github.com/Menezesvm/EstudosJava)
**Language:** Java
**Level:** Intermediate (OOP)
