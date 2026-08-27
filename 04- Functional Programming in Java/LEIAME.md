# 04 - Programação Funcional em Java - Trilha de Aprendizado

## Visão geral

Esta pasta dá continuidade ao [`03-Advanced Level`](../03-Advanced%20Level/LEIAME.md), saindo de generics e coleções para entrar em **programação funcional**: expressões lambda, interfaces funcionais e a **API de Streams**. O foco muda de "como armazenar e organizar dados" para "como processar e transformar dados de forma declarativa" — um estilo de código que aparece o tempo todo em serviços Spring Boot (resultados de consultas, mapeamento de DTOs, filtragem, agregação).

Cada subpasta é um mini-projeto independente (com sua própria pasta `src/`), representando um exercício que trabalha um conceito funcional específico.

## O que você vai encontrar

- **Expressões lambda**: substituir classes anônimas por implementações concisas e inline de uma interface funcional (ex: `Comparator`)
- **Criação de streams**: construir streams a partir de coleções, valores fixos e geradores infinitos (`Stream.of`, `Stream.iterate`)
- **Pipelines de stream**: encadear `map`, `filter`, `reduce` e `collect` para transformar e agregar dados sem loops explícitos
- **Exercício combinado**: ler dados de um arquivo e rodar um pipeline completo (parse → agregação → filtro → ordenação → impressão) sobre eles

## Estrutura da pasta

| Projeto | Conceito central | Descrição |
|---|---|---|
| [`Lambda`](Lambda) | **Expressão lambda vs. implementação de interface funcional** | Ordena uma `List<Product>` por nome usando uma lambda inline (`list.sort((p1, p2) -> ...)`), junto com uma classe `MyComparator` que implementa `Comparator<Product>` da forma tradicional — mostrando as duas abordagens lado a lado. |
| [`Stream`](Stream) | **Criação de streams** | Cria streams a partir de uma `List` (`.stream()`), de valores fixos (`Stream.of`) e de uma função geradora (`Stream.iterate`), incluindo uma stream infinita que produz a sequência de Fibonacci (`limit(10)`). |
| [`Pipeline`](Pipeline) | **Operações de pipeline de stream** | Encadeia `map` (multiplicar valores), `reduce` (somar uma lista) e `filter` + `collect` (manter números pares, coletar em `List`) para mostrar as três operações centrais de stream isoladamente. |
| [`Multiexercises function`](Multiexercises%20function) | **Pipeline completo sobre dados de arquivo** | Lê produtos (nome, preço) de um arquivo no formato CSV, calcula o preço médio com `reduce`, e então usa `filter` + `map` + `sorted` (com `Comparator` invertido) + `collect` para listar, em ordem decrescente de nome, todos os produtos com preço abaixo da média. |

## Progressão de aprendizado sugerida

1. **Fundamentos de lambda** — `Lambda`: veja como uma expressão lambda substitui uma implementação completa de `Comparator`, comparando as duas versões da mesma ordenação lado a lado.
2. **De onde vêm as streams** — `Stream`: pratique as diferentes formas de criar uma `Stream`, incluindo streams infinitas combinadas com `limit()`.
3. **Compondo operações** — `Pipeline`: encadeie `map`, `filter`, `reduce` e `collect` em uma lista simples para construir intuição sobre como cada operação transforma a stream.
4. **Juntando tudo** — `Multiexercises function`: combine leitura de arquivo com um pipeline de stream completo (agregação, filtro, ordenação, coleta) — o mesmo formato de código usado para moldar resultados de consultas em uma resposta, em um serviço backend real.

## Conceitos-chave abordados

| Conceito | Onde aparece |
|---|---|
| **Expressão lambda (`(p1, p2) -> ...`)** | `Lambda` |
| **Implementação de interface funcional (`Comparator<T>`)** | `Lambda` |
| **Criação de streams (`.stream()`, `Stream.of`, `Stream.iterate`)** | `Stream` |
| **Stream infinita + `limit()`** | `Stream` |
| **`map`** | `Pipeline`, `Multiexercises function` |
| **`reduce`** | `Pipeline`, `Multiexercises function` |
| **`filter`** | `Pipeline`, `Multiexercises function` |
| **`collect(Collectors.toList())`** | `Pipeline`, `Multiexercises function` |
| **`sorted(Comparator.reversed())`** | `Multiexercises function` |
| **Leitura de arquivo (`BufferedReader`, `FileReader`)** | `Multiexercises function` |

## Como executar os projetos

Cada projeto possui sua própria pasta `src/`. Para compilar e rodar manualmente:

```bash
cd "NomeDoProjeto"
javac -d bin $(find src -name "*.java")
java -cp bin Program   # ou application.Program, dependendo do pacote do projeto
```

Ou abra a pasta diretamente na sua IDE (IntelliJ IDEA, VS Code com a extensão Java, Eclipse) e execute a classe que contém o método `main`.

> Observação: o `Multiexercises function` pede o caminho de um arquivo pela entrada padrão em tempo de execução (`Enter full file path:`), então tenha um arquivo no formato CSV pronto (cada linha como `nomeDoProduto,preco`) antes de executar.

## Próximos passos

Depois de concluir esta pasta, os próximos tópicos naturais da trilha de estudos são:

- `Optional` e pipelines funcionais null-safe
- `Collectors.groupingBy` / `partitioningBy` para agregações mais avançadas
- Method references (`Classe::metodo`) como forma abreviada de lambdas simples
- Fundamentos de Spring Boot — a próxima fase do roteiro de estudos

---

**Repositório:** [Menezesvm/EstudosJava](https://github.com/Menezesvm/EstudosJava)
**Linguagem:** Java
**Nível:** Programação Funcional (Lambdas & Streams)
