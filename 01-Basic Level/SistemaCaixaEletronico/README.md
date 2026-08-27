# SistemaCaixaEletronico (ATM System)

## Overview

A console-based ATM simulator. It models a single account with a starting balance and PIN, and lets the user consult the balance, deposit, withdraw, transfer, change the PIN, and view a statement — all through a looping text menu.

This exercise focuses on procedural fundamentals: `static` state shared across methods, `switch` on a menu option, input validation, and formatted output — the building blocks used before moving into OOP in the [`02- Intermediated Level`](../../02-%20Intermediated%20Level) folder.

## What It Does

- Displays a menu with 7 options and loops until the user chooses to exit
- **Consultar saldo**: prints the current balance
- **Depositar**: adds a positive amount to the balance; rejects zero/negative amounts
- **Sacar**: subtracts an amount from the balance; rejects invalid amounts and amounts greater than the balance
- **Transferir**: same validation as withdrawal, simulating an outgoing transfer
- **Alterar senha**: requires the current PIN before allowing it to be changed
- **Mostrar extrato**: prints the client name, current balance, and a count of how many deposits, withdrawals, and transfers have been made this session

## Key Concepts Covered

| Concept | Where it appears |
|---|---|
| `static` fields as shared, in-memory state | `saldo`, `senha`, counters |
| `while` loop driving a menu until exit | `main` |
| `switch` statement for menu routing | `main` |
| Input validation (`if`/`else if`/`else`) | `depositar`, `sacar`, `transferir` |
| Formatted output (`System.out.printf`, `%.2f`) | `consultaSaldo`, `sacar`, `transferir`, `mostrarExtrato` |
| `Scanner` for console input | throughout |

## How to Run

```bash
cd SistemaCaixaEletronico
javac -d bin src/CaixaEletronico.java
java -cp bin CaixaEletronico
```

Or open the folder in your IDE and run `CaixaEletronico.java` directly.

## Notes / Possible Improvements

- The starting balance (`1000.00`) and PIN (`1234`) are hardcoded — a natural next step is externalizing them or accepting them at startup
- `sacar` and `transferir` read the amount with `nextInt()`, so decimal withdrawal/transfer values aren't currently supported (`depositar` already uses `nextDouble()`)
- No persistence: state resets every time the program restarts

---

**Repository:** [Menezesvm/EstudosJava](https://github.com/Menezesvm/EstudosJava)
**Language:** Java
**Level:** Basic
