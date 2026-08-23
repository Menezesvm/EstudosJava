# 03 - Nível Avançado - Trilha de Aprendizado em Java

## Visão geral

Esta pasta dá continuidade ao [`02-Intermediate Level`](../02-%20Intermediated%20Level/README%20-%2002-Intermediate%20Level%20(PT).md), avançando para **generics** e o **Java Collections Framework** (`Set`, `Map`). O foco muda de "como os objetos se relacionam entre si" (herança, composição, interfaces) para "como escrever código reutilizável e type-safe" e "como organizar e consultar dados de forma eficiente".

Cada subpasta é um mini-projeto independente (com sua própria pasta `src/`), representando um exercício que trabalha um conceito avançado específico.

## O que você vai encontrar

- **Generics**: escrever classes e métodos que funcionam com qualquer tipo mantendo segurança de tipos em tempo de compilação
- **Tipos delimitados (bounded types)**: restringir um tipo genérico para aceitar apenas tipos que implementam uma determinada interface (ex: `Comparable`)
- **`Set`**: armazenar elementos únicos e combinar conjuntos (união) para responder "quantos itens distintos existem entre grupos?"
- **`Map`**: associar chaves a valores, acumular totais por chave e ler dados de um arquivo

## Estrutura da pasta

| Projeto | Conceito central | Descrição |
|---|---|---|
| [`Generics1`](Generics1) | **Classe genérica** | `Box<T>` — um container genérico com `guardar(T item)` e `pegar()`, instanciado como `Box<String>` e `Box<Integer>` para mostrar a mesma classe funcionando com tipos diferentes. |
| [`Generics2`](Generics2) | **Tipo delimitado** (`<T extends Comparable<T>>`) | `Util.major(List<T>)` — um método genérico que encontra o maior elemento de qualquer lista cujo tipo implemente `Comparable`. Testado com `List<Integer>` e `List<Product>` (`Product` implementa `Comparable<Product>`, comparando por preço). |
| [`InterfaceSet`](InterfaceSet) | **`Set`** (`HashSet`) | Lê os alunos matriculados em três cursos (A, B, C) e usa `Set<Integer>.addAll()` para calcular a união — o total de alunos *distintos* entre os três, sem duplicatas. |
| [`Map`](Map) | **`Map`** (`TreeMap`) | Lê um arquivo no formato CSV (nome do produto, quantidade vendida) linha a linha, acumula o total de vendas por produto em um `TreeMap<String, Integer>` (mantido ordenado por chave), e então informa o produto mais vendido e o total geral. |

## Progressão de aprendizado sugerida

1. **Fundamentos de generics** — `Generics1`: entenda como uma classe pode ser parametrizada com um tipo `T`, de forma que o mesmo `Box` funcione para `String`, `Integer` ou qualquer outro tipo sem necessidade de cast.
2. **Generics com tipo delimitado** — `Generics2`: vá um passo além restringindo `T` a tipos que implementam `Comparable<T>`, o que permite ao método genérico chamar `compareTo` com segurança — o mesmo padrão usado por `Collections.max()` no JDK.
3. **`Set`** — `InterfaceSet`: aplique generics indiretamente através de `Set<Integer>`, e pratique operações de `HashSet` (`add`, `addAll`) para resolver um problema de "contagem de distintos" — um exercício bem comum em entrevistas técnicas.
4. **`Map`** — `Map`: combine leitura de arquivo (`BufferedReader`) com `TreeMap` para agrupar e agregar dados por chave, um padrão que aparece constantemente em código backend real (agrupamento, contagem, relatórios).

## Conceitos-chave abordados

| Conceito | Onde aparece |
|---|---|
| **Classe genérica (`class Box<T>`)** | `Generics1` |
| **Método genérico (`static <T> T metodo(...)`)** | `Generics2` |
| **Tipo delimitado (`<T extends Comparable<T>>`)** | `Generics2` |
| **Implementação de `Comparable<T>`** | `Generics2` (`Product`) |
| **`Set` / `HashSet`** | `InterfaceSet` |
| **União de conjuntos (`addAll`)** | `InterfaceSet` |
| **`Map` / `TreeMap`** | `Map` |
| **Leitura de arquivo (`BufferedReader`, `FileReader`)** | `Map` |
| **Tratamento de exceções (`try-with-resources`, `IOException`)** | `Map` |

## Como executar os projetos

Cada projeto possui sua própria pasta `src/`. Para compilar e rodar manualmente:

```bash
cd "NomeDoProjeto"
javac -d bin $(find src -name "*.java")
java -cp bin application.Program
```

Ou abra a pasta diretamente na sua IDE (IntelliJ IDEA, VS Code com a extensão Java, Eclipse) e execute a classe que contém o método `main` — localizada em `src/application/Program.java` em todos os projetos desta pasta.

> Observação: o `Map` pede o caminho de um arquivo pela entrada padrão em tempo de execução (`Entre com o caminho:`), então tenha um arquivo no formato CSV pronto (cada linha como `nomeDoProduto,quantidade`) antes de executar.

## Próximos passos

Depois de concluir esta pasta, os próximos tópicos naturais da trilha de estudos são:

- `List`, `Set` e `Map` combinados (ex: agrupar objetos, não só primitivos/strings)
- `Comparator` e ordenação de coleções de objetos customizados de múltiplas formas
- API de Streams para filtrar, mapear e coletar dados
- Fundamentos de Spring Boot — a próxima fase do roteiro de estudos

---

**Repositório:** [Menezesvm/EstudosJava](https://github.com/Menezesvm/EstudosJava)
**Linguagem:** Java
**Nível:** Avançado (Generics & Coleções)
