# 01 - Basic Level - Java Learning Path

## Overview

This folder contains the foundational Java programming studies and exercises, designed to build a solid understanding of core concepts in Java development. The content progresses from basic syntax and control structures to simple object-oriented principles and practical system implementations.

## What You'll Learn

This learning path covers:

- **Basic Java Syntax**: Variables, data types, input/output operations
- **Operators**: Arithmetic, logical, and comparison operators
- **Control Structures**: Conditional statements (if/else, switch/case) and repetitive loops
- **String Manipulation**: Working with strings and their methods
- **Functions and Methods**: Structuring code with reusable methods
- **Practical Applications**: Building real-world systems with menus and state management

## Folder Structure

### 📁 **primeiro-projeto** (First Project)
**Purpose**: Introduction to Java fundamentals and basic programming concepts

Contains practical exercises covering:
- Input/Output operations
- Arithmetic and logical operators
- Conditional structures (if/else)
- Switch/case statements
- Repetitive structures (loops)
- String operations
- Basic method implementation

**Best for**: Complete beginners learning Java syntax and logic flow

**📖 [View primeiro-projeto README](primeiro-projeto/README.md)**

---

### 📁 **Piloto** (Pilot Project)
**Purpose**: Implementing a library management system using core concepts

This project demonstrates:
- State management using static variables
- Menu-driven user interface implementation
- Method organization and modularity
- Data persistence during program execution
- Practical business logic implementation

**Best for**: Understanding how to structure a simple application with multiple features

**📖 [View Piloto README](Piloto/README.md)**

---

### 📁 **SistemaCaixaEletronico** (ATM System)
**Purpose**: Building an ATM (Automated Teller Machine) simulator

This project implements:
- Balance management and account operations
- User authentication with password handling
- Multiple transaction types (deposit, withdrawal, transfer)
- Statement and transaction tracking
- User-friendly menu interface
- Input validation and error handling

**Best for**: Learning practical banking system concepts and advanced state management

**📖 [View SistemaCaixaEletronico README](./SistemaCaixaEletronico/README.md)**

---

## Learning Progression

1. **Start with `primeiro-projeto`**
   - Learn the fundamentals of Java syntax
   - Practice with basic operators and control flow
   - Get comfortable with input/output operations

2. **Move to `Piloto`**
   - Apply fundamentals to build a complete system
   - Learn about managing application state
   - Understand how to structure larger programs

3. **Advance to `SistemaCaixaEletronico`**
   - Build more complex features
   - Implement proper transaction handling
   - Master user authentication and data validation

## Key Concepts Covered

| Concept | Description |
|---------|-------------|
| **Variables & Types** | Declaring and using different data types in Java |
| **Input/Output** | Reading user input and displaying output |
| **Operators** | Using arithmetic, logical, and comparison operators |
| **Control Flow** | if/else statements, switch/case, loops |
| **Methods** | Creating and calling methods, parameter passing |
| **State Management** | Using static variables to maintain program state |
| **User Interface** | Creating menu-driven applications |
| **Error Handling** | Validating input and handling edge cases |

## How to Run

Each project folder contains Java source files in the `src/` directory:

1. **Compile**:
   ```bash
   javac src/*.java -d bin/
   ```

2. **Run** (replace ClassName with the main class):
   ```bash
   java -cp bin/ ClassName
   ```

Or use your preferred IDE (IntelliJ IDEA, VS Code with Java extensions, Eclipse, etc.)

## Code Quality Standards

- Clear variable naming conventions
- Comprehensive comments explaining logic
- Proper method organization
- Input validation and error handling
- Structured menu systems for better UX

## Quick Project Comparison

| Feature | primeiro-projeto | Piloto | SistemaCaixaEletronico |
|---------|------------------|--------|----------------------|
| **Focus** | Fundamentals | Application Structure | Complex State Management |
| **Difficulty** | ⭐ Beginner | ⭐⭐ Intermediate | ⭐⭐⭐ Intermediate |
| **Files** | 9 Java classes | 1 Java class | 1 Java class |
| **Lines of Code** | ~200 per file | ~200 | ~200 |
| **Topics** | 8 concepts | State & Menus | Transactions & Validation |
| **Time** | 1-2 weeks | 1-2 weeks | 2-3 weeks |

## Next Steps

After completing all projects in this folder:
- Move to intermediate-level Java concepts (Object-Oriented Programming)
- Learn about classes, inheritance, and polymorphism
- Explore collections and data structures
- Study exception handling in depth
- Begin working with larger project architectures

## Resources & Tips

- **Practice Regularly**: Dedicate time each day to coding
- **Experiment**: Modify the code and see what happens
- **Read Documentation**: Use Java docs for method references
- **Challenge Yourself**: Create your own variations of projects
- **Debug**: Learn to use your IDE's debugger
- **Collaborate**: Share and discuss code with others

## Best Practices to Remember

✅ Use meaningful variable and method names  
✅ Write comments for complex logic  
✅ Validate user input before processing  
✅ Test edge cases and error scenarios  
✅ Keep methods focused on single responsibility  
✅ Close resources (Scanner, files, etc.)  
✅ Follow consistent code formatting  
✅ Build incrementally and test frequently  

## Troubleshooting

**Issue**: Programs won't compile
- **Solution**: Check for syntax errors, missing semicolons, or incorrect class names

**Issue**: Scanner doesn't read input correctly
- **Solution**: Remember to call `nextLine()` after `nextInt()` to consume the newline

**Issue**: Infinite loops or programs hang
- **Solution**: Check loop conditions and ensure they will eventually become false

**Issue**: Null pointer exceptions
- **Solution**: Initialize all variables before using them

---

**Repository**: Menezesvm/Estudos  
**Language**: Java 100%  
**Status**: ✅ Complete with exercises and projects  
**Created**: For structured Java learning  
**Last Updated**: 2026

Start with [primeiro-projeto](primeiro-projeto/README.md) and progress through each project at your own pace! 🚀
