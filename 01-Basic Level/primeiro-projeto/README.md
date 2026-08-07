# primeiro-projeto (First Project)

## Overview

This is your first hands-on Java project, designed to teach fundamental programming concepts through practical exercises. Each Java file focuses on a specific concept and includes working examples that you can run and modify.

## Project Goals

- Understand Java syntax basics
- Learn how to work with variables and data types
- Master operators (arithmetic, logical, comparison)
- Practice control flow structures
- Develop skills in string manipulation
- Write simple methods and functions

## Activities & Source Files

### 📄 **EntradaSaidadeDados.java**
**Topic**: Input and Output Operations

This file demonstrates:
- Using the `Scanner` class for reading user input
- Printing output to the console
- Reading different data types (integers, strings, decimals)

**Key Concepts**:
```java
Scanner entrada = new Scanner(System.in);
int numero = entrada.nextInt();
String texto = entrada.nextLine();
System.out.println("Output example");
```

---

### 📄 **ExpressoesComparativas.java**
**Topic**: Comparison Operators and Expressions

This file covers:
- Comparison operators: `==`, `!=`, `<`, `>`, `<=`, `>=`
- Creating boolean expressions
- Understanding how to compare different data types

**Key Concepts**:
- Equality and inequality checks
- Numeric comparisons
- Boolean results from comparisons

---

### 📄 **OperadoresAritmeticos.java**
**Topic**: Arithmetic Operations and Calculations

This file teaches:
- Basic arithmetic operators: `+`, `-`, `*`, `/`, `%`
- Order of operations (PEMDAS)
- Integer vs. floating-point division
- The modulo operator for remainders

**Key Concepts**:
```java
int resultado = 5 + 3 * 2;  // 11 (not 16)
int resto = 10 % 3;          // 1
double divisao = 10.0 / 3;   // 3.333...
```

---

### 📄 **OperadoresLogicos.java**
**Topic**: Logical Operators

This file demonstrates:
- The AND operator (`&&`)
- The OR operator (`||`)
- The NOT operator (`!`)
- Combining multiple conditions

**Key Concepts**:
```java
if (idade >= 18 && temCNH) { /* adult with driver's license */ }
if (fimDeSemana || ehFeriado) { /* can relax */ }
if (!chovendo) { /* can go out */ }
```

---

### 📄 **EstruturaIfElse.java**
**Topic**: Conditional Statements (if/else)

This file covers:
- Simple `if` statements
- `if/else` structure
- Nested conditions
- Multiple `else if` branches
- Boolean logic in conditions

**Key Concepts**:
```java
if (condicao) {
    // executes if true
} else if (outraCondicao) {
    // executes if first is false and this is true
} else {
    // executes if all above are false
}
```

---

### 📄 **SwitchCase.java**
**Topic**: Switch Statements for Multiple Conditions

This file demonstrates:
- Using `switch` for multiple cases
- The `break` statement to prevent fall-through
- Default case handling
- When to use `switch` vs. `if/else`

**Key Concepts**:
```java
switch (opcao) {
    case 1:
        // code for option 1
        break;
    case 2:
        // code for option 2
        break;
    default:
        // code if no case matches
}
```

---

### 📄 **EstruturasRepetitivas.java**
**Topic**: Loops and Repetitive Structures

This file covers:
- `while` loops - repeat while condition is true
- `do-while` loops - execute at least once, then check condition
- `for` loops - count-controlled repetition
- Loop control with `break` and `continue`

**Key Concepts**:
```java
for (int i = 0; i < 10; i++) { /* repeat 10 times */ }
while (condicao) { /* repeat until false */ }
do { /* execute first, then check */ } while (condicao);
```

---

### 📄 **TrabalhandoComStrings.java**
**Topic**: String Manipulation and Operations

This file demonstrates:
- String declaration and initialization
- String concatenation
- Common string methods: `length()`, `toUpperCase()`, `toLowerCase()`
- String comparison and searching
- Extracting parts of strings

**Key Concepts**:
```java
String nome = "João";
String cumprimento = "Olá, " + nome;
int tamanho = cumprimento.length();
String maiusculo = cumprimento.toUpperCase();
boolean contem = cumprimento.contains("João");
```

---

### 📄 **application.Main.java**
**Topic**: Program Entry Point and Program Structure

This is the main entry point that may:
- Call and execute examples from other classes
- Serve as a test runner
- Demonstrate how to organize multiple files in a project

**Purpose**: Show how a complete Java program is structured and executed

---

## How to Use This Project

### For Learning

1. **Read the comments** in each file to understand what's happening
2. **Study the examples** to see how concepts are applied
3. **Run each file** individually to see outputs
4. **Modify the code** and experiment with changes
5. **Try exercises** - implement similar logic with different data

### For Practice

1. Open a file focusing on a concept you want to learn
2. Read the code carefully
3. Run it and see the output
4. Modify values or conditions and run again
5. Create your own examples using the same concept

### To Run

**Option 1: Using an IDE (Recommended)**
- Open the project in IntelliJ IDEA, VS Code, or Eclipse
- Click "Run" on the main class

**Option 2: Using Terminal**
```bash
# Compile all files
javac src/*.java -d bin/

# Run a specific class
java -cp bin/ application.Main

# Or run any class with a main method
java -cp bin/ OperadoresAritmeticos
```

## Topics in Order of Difficulty

**Beginner**
1. EntradaSaidadeDados - Learn I/O basics
2. ExpressoesComparativas - Understand comparisons
3. OperadoresAritmeticos - Work with math

**Intermediate**
4. OperadoresLogicos - Combine conditions
5. EstruturaIfElse - Make decisions in code
6. SwitchCase - Handle multiple options

**Intermediate-Advanced**
7. EstruturasRepetitivas - Repeat code efficiently
8. TrabalhandoComStrings - Manipulate text

## Common Mistakes to Avoid

- ❌ Forgetting to import `Scanner`
- ❌ Using `=` instead of `==` for comparison
- ❌ Integer division when you need decimal results
- ❌ Forgetting `break` statements in switch cases
- ❌ Infinite loops (loop condition never becomes false)
- ❌ Assuming empty string `""` and `null` are the same

## Next Steps

After mastering this project:

1. ✅ Combine concepts to create small programs
2. ✅ Solve programming challenges and exercises
3. ✅ Move to `Piloto` project for application design
4. ✅ Explore Object-Oriented Programming (OOP) concepts
5. ✅ Learn about classes, objects, and methods
6. ✅ Study more complex data structures

## Resources for Learning

- Use Java documentation for method references
- Practice on coding challenge websites
- Create variations of the examples
- Try to teach these concepts to someone else
- Document your understanding with comments

---

**Difficulty**: ⭐ Beginner  
**Time to Complete**: 1-2 weeks of regular practice  
**Topics Covered**: 8 fundamental concepts  
**Status**: ✅ Ready to learn and practice
