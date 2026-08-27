# 03 - Advanced Level - Java Learning Path

## Overview

This folder continues from [`02-Intermediate Level`](../02-%20Intermediated%20Level/README%20-%2002-Intermediate%20Level%20(EN).md), moving into **generics** and the **Java Collections Framework** (`Set`, `Map`). The focus shifts from "how objects relate to each other" (inheritance, composition, interfaces) to "how to write reusable, type-safe code" and "how to organize and look up data efficiently".

Each subfolder is an independent mini-project (with its own `src/` folder), representing an exercise or small system that exercises a specific advanced concept.

## What You'll Find

- **Generics**: writing classes and methods that work with any type while keeping compile-time type safety
- **Bounded types**: restricting a generic type to only accept types that implement a given interface (e.g., `Comparable`)
- **`Set`**: storing unique elements and combining sets (union) to answer "how many distinct items across groups?"
- **`Map`**: associating keys with values, accumulating totals per key, and reading data from a file

## Folder Structure

| Project | Program concept | Description |
|---|---|---|
| [`Generics1`](Generics1) | **Generic class** | `Box<T>` — a generic container with `guardar(T item)` (store) and `pegar()` (retrieve), instantiated as `Box<String>` and `Box<Integer>` to show the same class working with different types. |
| [`Generics2`](Generics2) | **Bounded type** (`<T extends Comparable<T>>`) | `Util.major(List<T>)` — a generic method that finds the largest element of any list whose type implements `Comparable`. Tested with `List<Integer>` and `List<Product>` (`Product` implements `Comparable<Product>`, comparing by price). |
| [`InterfaceSet`](InterfaceSet) | **`Set`** (`HashSet`) | Reads the students enrolled in three courses (A, B, C) and uses `Set<Integer>.addAll()` to compute the union — the total number of *distinct* students across all three, with no duplicates. |
| [`Map`](Map) | **`Map`** (`TreeMap`) | Reads a CSV-like file (product name, quantity sold) line by line, accumulates total sales per product in a `TreeMap<String, Integer>` (kept sorted by key), then reports the best-selling product and the grand total. |

## Suggested Learning Progression

1. **Generics fundamentals** — `Generics1`: understand how a class can be parameterized with a type `T`, so the same `Box` works for `String`, `Integer`, or any other type without casting.
2. **Bounded generics** — `Generics2`: go a step further by restricting `T` to types that implement `Comparable<T>`, which allows the generic method to safely call `compareTo` — the same pattern used by `Collections.max()` in the JDK.
3. **`Set`** — `InterfaceSet`: apply generics indirectly through `Set<Integer>`, and practice `HashSet` operations (`add`, `addAll`) to solve a "distinct count" problem — a very common interview-style exercise.
4. **`Map`** — `Map`: combine file reading (`BufferedReader`) with `TreeMap` to group and aggregate data by key, a pattern that shows up constantly in real backend code (grouping, counting, reporting).

## Key Concepts Covered

| Concept | Where it appears |
|---|---|
| **Generic class (`class Box<T>`)** | `Generics1` |
| **Generic method (`static <T> T method(...)`)** | `Generics2` |
| **Bounded type (`<T extends Comparable<T>>`)** | `Generics2` |
| **`Comparable<T>` implementation** | `Generics2` (`Product`) |
| **`Set` / `HashSet`** | `InterfaceSet` |
| **Set union (`addAll`)** | `InterfaceSet` |
| **`Map` / `TreeMap`** | `Map` |
| **File reading (`BufferedReader`, `FileReader`)** | `Map` |
| **Exception handling (`try-with-resources`, `IOException`)** | `Map` |

## How to Run the Projects

Each project has its own `src/` folder. To compile and run manually:

```bash
cd "ProjectName"
javac -d bin $(find src -name "*.java")
java -cp bin application.Program
```

Or open the folder directly in your IDE (IntelliJ IDEA, VS Code with the Java extension, Eclipse) and run the class containing the `main` method — located at `src/application/Program.java` in every project in this folder.

> Note: `Map` reads a file path from standard input at runtime (`Entre com o caminho:`), so have a CSV-like file ready (each line as `productName,quantity`) before running it.

## Next Steps

After finishing this folder, the natural next topics to continue the learning path are:

- `List`, `Set`, and `Map` in combination (e.g., grouping objects, not just primitives/strings)
- `Comparator` and sorting collections of custom objects in multiple ways
- Streams API for filtering, mapping, and collecting data
- Spring Boot fundamentals — the next phase of the study roadmap

---

**Repository:** [Menezesvm/EstudosJava](https://github.com/Menezesvm/EstudosJava)
**Language:** Java
**Level:** Advanced (Generics & Collections)
