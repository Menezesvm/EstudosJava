# Piloto (Pilot Project) - Library Management System

## Overview

The **Piloto** project is a practical application that brings together fundamental Java concepts learned in `primeiro-projeto` to build a functioning **Library Management System**. This system demonstrates how to structure a real-world application with features like data management, state tracking, and a user-friendly menu interface.

## Project Purpose

This project demonstrates:
- ✅ How to organize code using static variables
- ✅ How to structure a menu-driven application
- ✅ How to implement business logic (library operations)
- ✅ How to manage application state during execution
- ✅ How to build a scalable application structure

## System Features

### 📚 **Core Functionality**

The Library Management System allows users to:

1. **Cadastrar Livro** (Register a Book)
   - Input book title, author, and publication year
   - Store information in the system
   - Only one book can be registered at a time

2. **Emprestar Livro** (Borrow/Lend a Book)
   - Lend a registered book to a user
   - Mark the book as unavailable
   - Prevent lending an already-lent book

3. **Devolver Livro** (Return a Book)
   - Mark the book as available again
   - Confirm successful return
   - Prevent returning a book that's not lent

4. **Mostrar Informações** (Show Book Information)
   - Display the title, author, and year of registered book
   - Show current availability status
   - Confirm if a book is registered

5. **Limpar Cadastro** (Clear Registry)
   - Remove all book information
   - Reset availability status
   - Start fresh with a new book

6. **Sair** (Exit)
   - Gracefully close the application
   - Release system resources

## Technical Implementation

### Program Structure

```
SistemaBiblioteca
├── Static Variables (Book State)
│   ├── titulo (String)
│   ├── autor (String)
│   ├── ano (int)
│   ├── livroCadastrado (boolean)
│   └── livroEmprestado (boolean)
│
└── Methods
    ├── main() - Program entry point
    ├── mostraMenu() - Display options
    ├── cadastrarLivro() - Register book
    ├── emprestarLivro() - Lend book
    ├── devolverLivro() - Return book
    ├── mostrarDados() - Show info
    ├── obterSituacao() - Get status
    └── limparCadastro() - Clear data
```

### Key Concepts Demonstrated

| Concept | Usage |
|---------|-------|
| **Static Variables** | Store book information and status |
| **Scanner Input** | Read user choices and data |
| **String Variables** | Store book title and author |
| **Boolean Flags** | Track book registration and loan status |
| **if/else Statements** | Validate operations |
| **switch/case** | Handle menu options |
| **while Loop** | Keep menu running until exit |
| **String Methods** | Manipulate book information |
| **Method Organization** | Separate concerns (UI, logic, data) |

### Application Flow

```
Start
  ↓
[Loop until option 5]
  ├─→ Display Menu
  ├─→ Get User Choice
  ├─→ Process Option (1-6)
  └─→ Return to Menu
  ↓
Close Scanner & Exit
```

## How to Run

### Using an IDE (Recommended)
1. Open the project in your IDE
2. Locate `SistemaBiblioteca.java` in the `src` folder
3. Click the "Run" button

### Using Terminal
```bash
# Compile
javac -d bin/ src/SistemaBiblioteca.java

# Run
java -cp bin/ SistemaBiblioteca
```

## Sample Usage

```
====== SISTEMA DE BIBLIOTECA ======
1 - Cadastrar livro
2 - Emprestar livro
3 - Devolver livro
4 - Mostrar informações do livro
5 - Sair
6 - Limpar cadastro

Escolha uma opção: 1

--- CADASTRAR LIVRO ---
Título: Clean Code
Autor: Robert C. Martin
Ano: 2008
Livro cadastrado com sucesso!

[Menu appears again...]

Escolha uma opção: 4

=== DADOS DO LIVRO ===
Título: Clean Code
Autor: Robert C. Martin
Ano: 2008
Situação: Disponível
```

## Learning Outcomes

By studying this project, you'll learn:

### Design Patterns
- ✅ Menu-Driven Architecture
- ✅ State Management Pattern
- ✅ Separation of Concerns

### Java Concepts
- ✅ Static variables and methods
- ✅ Control flow and loops
- ✅ Input/output operations
- ✅ Boolean logic

### Problem-Solving
- ✅ Handling multiple states
- ✅ Validating user input
- ✅ Organizing code logically
- ✅ Creating user-friendly interfaces

## Code Highlights

### Menu Loop Structure
```java
int opcao = 0;
while (opcao != 5) {
    mostraMenu();
    System.out.println("Escolha uma opção: ");
    opcao = entrada.nextInt();
    entrada.nextLine(); // Consume newline
    
    switch (opcao) {
        case 1: cadastrarLivro(); break;
        case 2: emprestarLivro(); break;
        // ... more cases
    }
}
```

### State Validation
```java
public static void emprestarLivro() {
    if (!livroCadastrado) {
        System.out.println("Nenhum livro cadastrado.");
        return;
    }
    
    if (livroEmprestado) {
        System.out.println("Livro já está emprestado.");
    } else {
        livroEmprestado = true;
        System.out.println("Livro emprestado com sucesso.");
    }
}
```

## Extensions & Improvements

After mastering this system, consider:

### Enhancement Ideas
1. **Multiple Books** - Store multiple books (needs Arrays or Collections)
2. **User Profiles** - Track who borrowed which book
3. **Due Dates** - Add return deadlines using `java.time`
4. **Book Search** - Search by title or author
5. **Persistent Storage** - Save data to files using File I/O
6. **Ratings** - Allow users to rate books

### Object-Oriented Upgrades
1. Create a `Book` class to encapsulate book data
2. Create a `Library` class to manage multiple books
3. Create a `User` class to track borrowers
4. Implement proper getters and setters
5. Use ArrayList for managing collections

## Common Modifications

### Variation 1: Multiple Books (Array)
```java
static String[] titulos = new String[10];
static int[] anos = new int[10];
static int totalLivros = 0;
```

### Variation 2: Add Due Date
```java
static String dataDevolucao;
// Track when book must be returned
```

### Variation 3: Add Fine System
```java
static double multa = 0;
// Charge fee for late returns
```

## Best Practices Demonstrated

- ✅ Clear method naming
- ✅ Single responsibility per method
- ✅ Defensive programming (input validation)
- ✅ User-friendly messages
- ✅ Proper resource cleanup (Scanner.close())
- ✅ Comments explaining logic

## Common Issues & Solutions

| Issue | Solution |
|-------|----------|
| Scanner not reading input after `nextInt()` | Call `nextLine()` to consume newline |
| Book info is lost when running again | This is expected (use files for persistence) |
| Menu doesn't appear after operation | Check that your while condition is correct |
| "NoSuchElementException" error | Ensure you're closing Scanner properly |

## Next Steps

### To Learn More
1. Study the Object-Oriented design principles
2. Learn about Classes and Objects
3. Explore Collections (ArrayList, HashMap)
4. Add File I/O for data persistence
5. Implement a database connection

### To Improve This Project
1. Refactor to use OOP principles
2. Add unit tests to verify functionality
3. Create a GUI using Swing
4. Export data to CSV files
5. Add a search feature

## Reflection Questions

After completing this project, ask yourself:

1. How would you add support for multiple books?
2. What data structure would you use?
3. How would you persist data between program runs?
4. Could you make the menu more dynamic?
5. How would you test this application?

---

**Difficulty Level**: ⭐⭐ Beginner to Intermediate  
**Project Type**: Console Application  
**Concepts**: Static variables, methods, control flow, state management  
**Time to Complete**: 1-2 weeks including modifications  
**Prerequisite**: Completion of `primeiro-projeto`  
**Status**: ✅ Complete and ready for study and enhancement
