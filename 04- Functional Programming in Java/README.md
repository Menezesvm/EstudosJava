# 04 - Functional Programming in Java - Learning Path

## Overview

This folder continues from [`03-Advanced Level`](../03-Advanced%20Level/README.md), moving from generics and collections into **functional programming**: lambda expressions, functional interfaces, and the **Streams API**. The focus shifts from "how to store and organize data" to "how to process and transform data declaratively" — a style of code that shows up constantly in Spring Boot services (query results, DTO mapping, filtering, aggregation).

Each subfolder is an independent mini-project (with its own `src/` folder), representing an exercise or small system that exercises a specific functional concept.

## What You'll Find

- **Lambda expressions**: replacing anonymous classes with concise inline implementations of a functional interface (e.g., `Comparator`)
- **Stream creation**: building streams from collections, values, and infinite generators (`Stream.of`, `Stream.iterate`)
- **Stream pipelines**: chaining `map`, `filter`, `reduce`, and `collect` to transform and aggregate data without explicit loops
- **Combined exercise**: reading data from a file and running a full pipeline (parse → aggregate → filter → sort → print) on it

## Folder Structure

| Project | Program concept | Description |
|---|---|---|
| [`Lambda`](Lambda) | **Lambda expression vs. functional interface implementation** | Sorts a `List<Product>` by name using an inline lambda (`list.sort((p1, p2) -> ...)`), alongside a `MyComparator` class implementing `Comparator<Product>` the traditional way — showing both approaches side by side. |
| [`Stream`](Stream) | **Stream creation** | Creates streams from a `List` (`.stream()`), from fixed values (`Stream.of`), and from a generator function (`Stream.iterate`), including an infinite stream that produces the Fibonacci sequence (`limit(10)`). |
| [`Pipeline`](Pipeline) | **Stream pipeline operations** | Chains `map` (multiply values), `reduce` (sum a list), and `filter` + `collect` (keep even numbers, collect to `List`) to show the three core stream operations in isolation. |
| [`Multiexercises function`](Multiexercises%20function) | **Full pipeline over file data** | Reads products (name, price) from a CSV-like file, computes the average price with `reduce`, then uses `filter` + `map` + `sorted` (with a reversed `Comparator`) + `collect` to list, in descending name order, every product priced below the average. |

## Suggested Learning Progression

1. **Lambda basics** — `Lambda`: see how a lambda expression replaces a full `Comparator` implementation, then compare both versions of the same sort side by side.
2. **Where streams come from** — `Stream`: practice the different ways a `Stream` can be created, including infinite streams paired with `limit()`.
3. **Composing operations** — `Pipeline`: chain `map`, `filter`, `reduce`, and `collect` on a simple list to build intuition for how each operation transforms the stream.
4. **Putting it together** — `Multiexercises function`: combine file reading with a full stream pipeline (aggregate, filter, sort, collect) — the same shape of code used to shape query results into a response in a real backend service.

## Key Concepts Covered

| Concept | Where it appears |
|---|---|
| **Lambda expression (`(p1, p2) -> ...`)** | `Lambda` |
| **Functional interface implementation (`Comparator<T>`)** | `Lambda` |
| **Stream creation (`.stream()`, `Stream.of`, `Stream.iterate`)** | `Stream` |
| **Infinite stream + `limit()`** | `Stream` |
| **`map`** | `Pipeline`, `Multiexercises function` |
| **`reduce`** | `Pipeline`, `Multiexercises function` |
| **`filter`** | `Pipeline`, `Multiexercises function` |
| **`collect(Collectors.toList())`** | `Pipeline`, `Multiexercises function` |
| **`sorted(Comparator.reversed())`** | `Multiexercises function` |
| **File reading (`BufferedReader`, `FileReader`)** | `Multiexercises function` |

## How to Run the Projects

Each project has its own `src/` folder. To compile and run manually:

```bash
cd "ProjectName"
javac -d bin $(find src -name "*.java")
java -cp bin Program   # or application.Program, depending on the project's package
```

Or open the folder directly in your IDE (IntelliJ IDEA, VS Code with the Java extension, Eclipse) and run the class containing the `main` method.

> Note: `Multiexercises function` reads a file path from standard input at runtime (`Enter full file path:`), so have a CSV-like file ready (each line as `productName,price`) before running it.

## Next Steps

After finishing this folder, the natural next topics to continue the learning path are:

- `Optional` and null-safe functional pipelines
- `Collectors.groupingBy` / `partitioningBy` for more advanced aggregations
- Method references (`Class::method`) as a shorthand for simple lambdas
- Spring Boot fundamentals — the next phase of the study roadmap

---

**Repository:** [Menezesvm/EstudosJava](https://github.com/Menezesvm/EstudosJava)
**Language:** Java
**Level:** Functional Programming (Lambdas & Streams)
