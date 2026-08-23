# Composition — Order / OrderItem / Product / Client

Exercício sobre **composição de objetos**: um `Order` (pedido) é formado por vários `OrderItem`, e cada item referencia um `Course`. Diferente de herança, aqui as classes não têm relação "é um", e sim "tem um" — um pedido *tem* um cliente, *tem* vários itens.

```mermaid
classDiagram
    class Client {
        -String name
        -String email
        -Date birthDate
        +toString() String
    }

    class Order {
        -Date moment
        -OrderStatus status
        -Client client
        -List~OrderItem~ items
        +addItem(item) void
        +removeItem(item) void
        +total() double
    }

    class OrderItem {
        -Integer quantity
        -Double price
        -Product product
        +subTotal() double
    }

    class Product {
        -String name
        -Double price
    }

    class OrderStatus {
        <<enumeration>>
        PROCESSING
        PENDING
        SHIPPED
        DELIVERED
    }

    Order "many" --> "1" Client : pertence a
    Order "1" *-- "many" OrderItem : contém
    OrderItem "many" --> "1" Product : referencia
    Order --> OrderStatus : tem
```

**Ponto-chave:** repare no `*--` entre `Order` e `OrderItem` — é composição forte: um `OrderItem` não faz sentido sem existir dentro de um `Order`. Já `OrderItem --> Product` é uma associação mais fraca: o mesmo `Course` pode estar em vários pedidos diferentes.

