# Studies (Estudos)

This repository contains curated Java projects and exercises that demonstrate my technical skills, problem-solving approach, and readiness for professional software development roles. The codebase focuses on clean, maintainable Java code and practical tools used in modern backend development.

If you're a recruiter or hiring manager: quick highlights are below so you can evaluate faster.

## Quick highlights

- Language focus: Java (core, OOP, generics, exception handling)
- Depth-over-speed approach: each topic is studied in detail, including custom README files with UML/class diagrams for the most conceptually rich exercises
- Currently progressing toward Spring Boot, backed by a structured study roadmap

## Repository structure

The repository is organized by learning level:

| Folder | Focus |
|---|---|
| [`01-Basic Level`](01-Basic%20Level) | Fundamentals: syntax, control flow, basic OOP, small procedural exercises |
| [`02- Intermediated Level`](02-%20Intermediated%20Level) | Encapsulation, inheritance, composition, interfaces, exception handling, collections |
| [`03-Advanced Level`](03-Advanced%20Level) | Generics, bounded types |

## Featured projects

These exercises go deeper into a single OOP concept and include a dedicated README with a Mermaid class diagram:

- [`Interfaces`](02-%20Intermediated%20Level/Interfaces) — Interface-based dependency injection (`OnlinePaymentService` / `PaypalService` / `ContractService`)
- [`Composition`](02-%20Intermediated%20Level/Composition) — Object composition (`Order`, `OrderItem`, `Product`, `Client`)
- [`Inheritance2`](02-%20Intermediated%20Level/Inheritance2) — Abstract classes and polymorphism (`TaxPrayer`, `Individual`, `Company`)
- [`ExceptionHandling`](02-%20Intermediated%20Level/ExceptionHandling) — Custom exceptions extending `RuntimeException`

Each project folder includes a README with setup and run instructions; see `02- Intermediated Level/README - 02-Intermediate Level (EN).md` for the full list of exercises with descriptions.

## How to evaluate quickly
1. Open the project README to see purpose and setup.
2. Inspect code for consistent naming, small focused methods, and separation of concerns.
3. Check the featured projects above for diagrammed exercises that show reasoning about class relationships, not just working code.

## How to run (typical)
- Prerequisites: JDK 17+ (or project-specific version)
- Common commands (plain `javac`/`java`, since these are exercise projects without a build tool):
  ```bash
  cd "ProjectName"
  javac -d bin $(find src -name "*.java")
  java -cp bin application.Program   # or the main class name
  ```
- Or open the folder directly in your IDE (IntelliJ IDEA, VS Code, Eclipse) and run the class containing `main`.

## What I'm looking for

I'm looking for backend Java opportunities — internships, junior-level roles, or collaborative projects — where I can build reliable, well-tested server-side software.

## Contact
- GitHub: https://github.com/Menezesvm
- Email: vinicius.menezes2@ufrpe.br
- LinkedIn: https://www.linkedin.com/in/viniciusmenezes2

---

For deeper details, open each level's folder and review the individual project READMEs.

