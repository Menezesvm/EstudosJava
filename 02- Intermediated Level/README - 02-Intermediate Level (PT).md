# 02 - Intermediate Level - Java Learning Path

## Visão geral

Esta pasta reúne os estudos de **Programação Orientada a Objetos (POO) em Java**, dando continuidade ao [`01-Basic Level`](../01-Basic%20Level/README.md). Enquanto a etapa básica focou em sintaxe, estruturas de controle e lógica de programação, aqui o foco passa a ser **como organizar e estruturar código orientado a objetos**: classes, encapsulamento, herança, composição, enums, coleções e manipulação de datas modernas com a API `java.time`.

Cada subpasta é um mini-projeto independente (com sua própria pasta `src/`), representando um exercício ou pequeno sistema que exercita um conceito específico de POO.

## O que você vai encontrar

- **Encapsulamento e modelagem de entidades**: classes com atributos privados, getters/setters e validação de dados
- **Herança e polimorfismo**: hierarquias de classes com `extends`, `super` e sobrescrita de métodos (`@Override`)
- **Classes abstratas**: métodos `abstract` que forçam subclasses a implementar seu próprio comportamento
- **Interfaces**: contratos 100% abstratos (`implements`) usados para desacoplar regras de negócio de suas implementações concretas
- **Tratamento de exceções**: exceções customizadas (`RuntimeException`) e blocos `try/catch` para tratar erros de regra de negócio
- **Composição**: relacionamento "tem-um" entre objetos (ex.: um pedido que contém itens, que contêm produtos)
- **Enums**: representação de estados fixos (ex.: status de um pedido)
- **Coleções**: uso de `ArrayList`/`List` para gerenciar grupos de objetos
- **Manipulação de datas**: comparação entre a API legada (`Date`/`SimpleDateFormat`) e a API moderna (`java.time`)
- **Vetores de objetos**: arrays de entidades e cálculos agregados (soma, média)
- **Sistemas de menu simples**: pequenas aplicações de console com cadastro/consulta de dados

## Estrutura da pasta

| Projeto | Conceito principal | Descrição |
|---|---|---|
| [`AccountBank`](AccountBank) | Encapsulamento / Sobrecarga de construtor | Conta bancária com dois construtores (com e sem depósito inicial), depósito e saque com taxa fixa de $5. |
| [`Aluno`](Aluno) | Encapsulamento básico | Classe `Student` que calcula a nota final (soma de 3 notas) e os pontos que faltam para atingir a média 60. |
| [`Cinema`](Cinema) | Encapsulamento / Regras de negócio | Sistema de bilheteria (`Ticket`) que aplica desconto por idade (crianças/idosos) ou por carteirinha de estudante. |
| [`Composition`](Composition) | **Composição** + Enum | Sistema de pedidos: `Order` é composto por vários `OrderItem`, cada um associado a um `Product`; `Client` guarda dados do comprador; `OrderStatus` é um enum (`PROCESSING`, `PENDING`, `SHIPPED`, `DELIVERED`). |
| [`DateTime`](DateTime) | API `java.time` | Exercício comparando `LocalDate`, `LocalDateTime` e `Instant`, incluindo parsing e formatação com `DateTimeFormatter`. |
| [`Dolar`](Dolar) | Método estático utilitário | Conversor de dólar para real, aplicando IOF (6%) sobre o câmbio. |
| [`Employee`](Employee) | Encapsulamento básico | Classe `Employee` (pacote `Salary`) com cálculo de salário líquido e reajuste percentual. |
| [`Employees`](Employees) | **Coleções** (`List`) + Streams | Cadastro de vários funcionários em uma lista, validação de ID duplicado e reajuste salarial usando `Stream`. |
| [`Estudo vetores`](Estudo%20vetores) | Vetores/Arrays de objetos | Leitura de N produtos via `Scanner` e cálculo da média de preços usando um array de `Product`. |
| [`ExceptionHandling`](ExceptionHandling) | **Tratamento de exceções** | Conta bancária com saque (`withdraw`) que lança uma exceção customizada (`BusinessExceptions`, que estende `RuntimeException`) quando o valor excede o limite de saque ou o saldo disponível; erro tratado com `try/catch` no `Program`. |
| [`Inheritance`](Inheritance) | **Herança** + `@Override` | Hierarquia `Account` → `BusinessAccount` (com limite de crédito e taxa de saque) e `SavingsAccount` (conta poupança com taxa de juros). |
| [`Inheritance1`](Inheritance1) | **Herança** + Polimorfismo | Hierarquia `Product` → `ImportedProduct` (com taxa de importação) e `UsedProduct` (com data de fabricação), cada um sobrescrevendo `priceTag()`. |
| [`Inheritance2`](Inheritance2) | **Classe abstrata** + Polimorfismo | Hierarquia `TaxPrayer` (abstrata) → `Individual` e `Company`, cada uma calculando o imposto (`tax()`) com sua própria regra; usa `List<TaxPrayer>` para somar o total arrecadado. |
| [`Interfaces`](Interfaces) | **Interface** (`implements`) | Sistema de contratos parcelados: a interface `OnlinePaymentService` define os métodos `paymentFee()` e `interest()`, implementados por `PaypalService`; `ContractService` usa a interface para calcular as parcelas (`Installment`) de um `Contract`, sem depender de uma implementação concreta. |
| [`Primeiroprojeto`](Primeiroprojeto) | Sistema de menu (procedural) | Sistema de biblioteca simples usando variáveis estáticas para armazenar o estado de um único livro (cadastrar, emprestar, devolver). |
| [`Rent`](Rent) | Vetores de objetos | Cadastro de aluguel de quartos usando um array de `Rent`, indexado pelo número do quarto. |
| [`Retangulo`](Retangulo) | Encapsulamento básico | Classe `Retangulo` com cálculo de área, perímetro e diagonal. |
| [`SistemaBiblioteca`](SistemaBiblioteca) | **POO aplicada** (versão evoluída) | Evolução do sistema de biblioteca: agora orientado a objetos, com as classes `Livro` e `Biblioteca` (que gerencia uma `ArrayList<Livro>`), permitindo cadastrar, listar e buscar livros. |

> 💡 **Observação:** `Primeiroprojeto` e `SistemaBiblioteca` resolvem o mesmo problema (um sistema de biblioteca) em dois estágios diferentes de aprendizado — o primeiro ainda de forma procedural (com métodos e variáveis estáticas), o segundo já usando classes e objetos de verdade (`Livro` e `Biblioteca`). É um bom exemplo de evolução de raciocínio de "código procedural" para "código orientado a objetos".

## Progressão de aprendizado sugerida

1. **Fundamentos de classes** — `Retangulo`, `Aluno`, `Employee`: praticar a criação de classes simples com atributos e métodos de cálculo.
2. **Encapsulamento com validação** — `Cinema`, `AccountBank`: adicionar getters/setters com regras de negócio e sobrecarga de construtores.
3. **Vetores de objetos** — `Estudo vetores`, `Rent`: agrupar múltiplos objetos em arrays e processá-los em laços.
4. **Coleções dinâmicas** — `Employees`: migrar de arrays fixos para `ArrayList`, incluindo uso de `Stream` para busca.
5. **Herança e polimorfismo** — `Inheritance`, `Inheritance1`: criar subclasses especializadas e sobrescrever comportamentos com `@Override`.
6. **Classes abstratas** — `Inheritance2`: dar um passo além da herança "comum", definindo um método `abstract` (`tax()`) que obriga cada subclasse (`Individual`, `Company`) a fornecer sua própria implementação — uma introdução ao conceito de contrato/polimorfismo forçado, que antecede o estudo de interfaces.
7. **Interfaces** — `Interfaces`: dar mais um passo além das classes abstratas, definindo um contrato 100% abstrato (`OnlinePaymentService`) implementado por `PaypalService`, permitindo trocar a forma de pagamento sem alterar `ContractService`.
8. **Composição** — `Composition`: montar objetos complexos a partir de outros objetos (pedido → itens → produto) e usar `enum` para representar estados.
9. **Datas e horários** — `DateTime`: comparar a API antiga (`Date`) usada em `Composition` com a API moderna (`java.time`) usada em `DateTime`, `Inheritance1` e `Interfaces`.
10. **Tratamento de exceções** — `ExceptionHandling`: criar uma exceção customizada (`BusinessExceptions`) e usar `try/catch` para lidar com violações de regras de negócio (ex.: saque acima do limite ou do saldo).
11. **Sistemas completos** — `Primeiroprojeto` → `SistemaBiblioteca`: comparar a mesma aplicação resolvida de forma procedural e depois orientada a objetos.

## Conceitos-chave abordados

| Conceito | Onde aparece |
|---|---|
| **Encapsulamento** (atributos privados + getters/setters) | Quase todos os projetos |
| **Sobrecarga de construtores** | `AccountBank` |
| **Herança (`extends`, `super`)** | `Inheritance`, `Inheritance1`, `Inheritance2` |
| **Classe abstrata (`abstract class`, método `abstract`)** | `Inheritance2` |
| **Interface (`interface`, `implements`)** | `Interfaces` |
| **Polimorfismo / `@Override`** | `Inheritance`, `Inheritance1`, `Inheritance2`, `Interfaces`, `Composition` (`toString`) |
| **Composição de objetos** | `Composition` |
| **Enums** | `Composition` (`OrderStatus`) |
| **Coleções (`ArrayList`, `List`)** | `Employees`, `SistemaBiblioteca`, `Interfaces` (lista de parcelas) |
| **Streams / expressões lambda** | `Employees` |
| **Arrays de objetos** | `Estudo vetores`, `Rent` |
| **Métodos e atributos estáticos** | `Dolar`, `Primeiroprojeto` |
| **Manipulação de datas (legada e moderna)** | `Composition` (`Date`), `DateTime`, `Inheritance1` e `Interfaces` (`java.time`) |
| **Exceções customizadas (`extends RuntimeException`)** | `ExceptionHandling` |
| **Validação de entrada e regras de negócio** | `Cinema`, `SistemaBiblioteca`, `Livro`, `ExceptionHandling` |

## Como executar os projetos

Cada projeto possui sua própria pasta `src/`. Para compilar e rodar manualmente:

```bash
# Exemplo genérico (ajuste os pacotes/caminhos conforme o projeto)
cd "NomeDoProjeto"
javac -d bin $(find src -name "*.java")
java -cp bin application.Program   # ou o nome da classe principal (application.Program.java)
```

Ou abra a pasta diretamente na sua IDE (IntelliJ IDEA, VS Code com extensão Java, Eclipse) e execute a classe que contém o método `main` — geralmente localizada em `src/application/Program.java` ou `src/application/Main.java` (alguns projetos mais antigos usam `Application` com "A" maiúsculo).

## Próximos passos

Depois de concluir esta pasta, os próximos temas naturais para continuar a trilha de estudos são:

- Interfaces (aprofundando o que `Inheritance2` começou com classes abstratas — já vista em `Interfaces`)
- Generics
- Coleções mais avançadas (`Map`, `Set`) e ordenação (`Comparable`/`Comparator`)
- Testes unitários (JUnit)
- Persistência de dados (arquivos, banco de dados, JDBC)

---

**Repositório:** [Menezesvm/EstudosJava](https://github.com/Menezesvm/EstudosJava)
**Linguagem:** Java
**Nível:** Intermediário (POO)
