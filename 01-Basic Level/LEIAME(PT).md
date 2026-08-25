# 01 - Nível Básico - Trilha de Aprendizado em Java

## Visão geral

Esta pasta reúne os estudos fundamentais de programação em Java, criados para construir uma base sólida nos conceitos essenciais do desenvolvimento em Java. O conteúdo evolui de sintaxe básica e estruturas de controle até princípios simples de orientação a objetos, arrays/matrizes e implementações práticas de sistemas.

## O que você vai aprender

Esta trilha de aprendizado cobre:

- **Sintaxe básica de Java**: Variáveis, tipos de dados, operações de entrada/saída
- **Operadores**: Aritméticos, lógicos e de comparação
- **Estruturas de controle**: Estruturas condicionais (if/else, switch/case) e laços de repetição
- **Manipulação de strings**: Trabalhando com strings e seus métodos
- **Funções e métodos**: Estruturando o código com métodos reutilizáveis
- **Arrays e matrizes**: Trabalhando com arrays unidimensionais e bidimensionais
- **Aplicações práticas**: Construindo sistemas reais com menus e gerenciamento de estado

## Estrutura da pasta

### 📁 **primeiro-projeto** (Primeiro Projeto)
**Objetivo**: Introdução aos fundamentos do Java e conceitos básicos de programação

Contém exercícios práticos cobrindo:
- Operações de entrada/saída
- Operadores aritméticos e lógicos
- Estruturas condicionais (if/else)
- Instruções switch/case
- Estruturas de repetição (laços)
- Operações com strings
- Implementação básica de métodos

**Indicado para**: Iniciantes completos aprendendo a sintaxe e a lógica do Java

**📖 [Ver README do primeiro-projeto](primeiro-projeto/README.md)**

---

### 📁 **Piloto** (Projeto Piloto)
**Objetivo**: Implementar um sistema de gerenciamento de biblioteca usando conceitos fundamentais

Este projeto demonstra:
- Gerenciamento de estado usando variáveis estáticas
- Implementação de interface orientada a menu
- Organização e modularidade de métodos
- Persistência de dados durante a execução do programa
- Implementação prática de regras de negócio

**Indicado para**: Entender como estruturar uma aplicação simples com múltiplas funcionalidades

**📖 [Ver README do Piloto](Piloto/README.md)**

---

### 📁 **SistemaCaixaEletronico** (Sistema de Caixa Eletrônico)
**Objetivo**: Construir um simulador de caixa eletrônico (ATM)

Este projeto implementa:
- Gerenciamento de saldo e operações de conta
- Autenticação de usuário com tratamento de senha
- Múltiplos tipos de transação (depósito, saque, transferência)
- Extrato e rastreamento de transações
- Interface de menu amigável
- Validação de entrada e tratamento de erros

**Indicado para**: Aprender conceitos práticos de sistemas bancários e gerenciamento de estado mais avançado

**📖 [Ver README do SistemaCaixaEletronico](./SistemaCaixaEletronico/README.md)**

---

### 📁 **Matriz** (Matriz)
**Objetivo**: Praticar arrays bidimensionais (matrizes)

Este exercício cobre:
- Declaração e preenchimento de uma matriz `n x n` a partir da entrada do usuário (`Scanner`)
- Laços aninhados para percorrer linhas e colunas
- Extração da diagonal principal de uma matriz quadrada
- Contagem de elementos que satisfazem uma condição (números negativos)

**Indicado para**: Ganhar familiaridade com arrays 2D e lógica de laços aninhados antes de avançar para coleções

**📖 Arquivo: [`Matriz/src/application/Main.java`](Matriz/src/application/Main.java)**

---

## Progressão de aprendizado

1. **Comece com `primeiro-projeto`**
   - Aprenda os fundamentos da sintaxe Java
   - Pratique com operadores básicos e fluxo de controle
   - Familiarize-se com operações de entrada/saída

2. **Avance para `Piloto`**
   - Aplique os fundamentos para construir um sistema completo
   - Aprenda a gerenciar o estado da aplicação
   - Entenda como estruturar programas maiores

3. **Progrida para `SistemaCaixaEletronico`**
   - Construa funcionalidades mais complexas
   - Implemente o tratamento adequado de transações
   - Domine a autenticação de usuário e a validação de dados

4. **Pratique com `Matriz`**
   - Trabalhe com arrays bidimensionais
   - Fortaleça a lógica de laços aninhados
   - Prepare-se para arrays de objetos, vistos mais adiante em `02-Intermediate Level`

## Conceitos-chave abordados

| Conceito | Descrição |
|---------|-------------|
| **Variáveis e Tipos** | Declarar e usar diferentes tipos de dados em Java |
| **Entrada/Saída** | Ler dados digitados pelo usuário e exibir resultados |
| **Operadores** | Uso de operadores aritméticos, lógicos e de comparação |
| **Fluxo de controle** | Instruções if/else, switch/case, laços |
| **Métodos** | Criação e chamada de métodos, passagem de parâmetros |
| **Gerenciamento de estado** | Uso de variáveis estáticas para manter o estado do programa |
| **Interface de usuário** | Criação de aplicações orientadas a menu |
| **Tratamento de erros** | Validação de entrada e tratamento de casos extremos |
| **Arrays / Matrizes** | Trabalho com arrays 1D e matrizes 2D, laços aninhados |

## Como executar

Cada pasta de projeto contém arquivos-fonte Java dentro do diretório `src/`:

1. **Compilar**:
   ```bash
   javac src/*.java -d bin/
   ```

2. **Executar** (substitua ClassName pela classe principal):
   ```bash
   java -cp bin/ ClassName
   ```

Ou use sua IDE preferida (IntelliJ IDEA, VS Code com extensões Java, Eclipse, etc.)

## Padrões de qualidade de código

- Convenções claras de nomenclatura de variáveis
- Comentários abrangentes explicando a lógica
- Organização adequada de métodos
- Validação de entrada e tratamento de erros
- Sistemas de menu estruturados para melhor experiência de uso

## Comparação rápida dos projetos

| Característica | primeiro-projeto | Piloto | SistemaCaixaEletronico | Matriz |
|---------|------------------|--------|----------------------|--------|
| **Foco** | Fundamentos | Estrutura de aplicação | Gerenciamento de estado complexo | Arrays / Matrizes |
| **Dificuldade** | ⭐ Iniciante | ⭐⭐ Intermediário | ⭐⭐⭐ Intermediário | ⭐⭐ Intermediário |
| **Arquivos** | 9 classes Java | 1 classe Java | 1 classe Java | 1 classe Java |
| **Linhas de código** | ~200 por arquivo | ~200 | ~200 | ~40 |
| **Tópicos** | 8 conceitos | Estado e Menus | Transações e Validação | Arrays 2D e Laços |
| **Tempo** | 1-2 semanas | 1-2 semanas | 2-3 semanas | Poucos dias |

## Próximos passos

Depois de concluir todos os projetos desta pasta:
- Avance para conceitos intermediários de Java (Programação Orientada a Objetos) — veja [`02-Intermediate Level`](../02-%20Intermediated%20Level/README%20-%2002-Intermediate%20Level%20(PT).md)
- Aprenda sobre classes, herança e polimorfismo
- Explore coleções e estruturas de dados
- Estude tratamento de exceções em profundidade
- Comece a trabalhar com arquiteturas de projetos maiores

## Recursos e dicas

- **Pratique regularmente**: Reserve um tempo todos os dias para programar
- **Experimente**: Modifique o código e veja o que acontece
- **Leia a documentação**: Use a documentação do Java como referência de métodos
- **Desafie-se**: Crie suas próprias variações dos projetos
- **Depure**: Aprenda a usar o depurador da sua IDE
- **Colabore**: Compartilhe e discuta código com outras pessoas

## Boas práticas a lembrar

✅ Use nomes significativos para variáveis e métodos
✅ Escreva comentários para lógica complexa
✅ Valide a entrada do usuário antes de processá-la
✅ Teste casos extremos e cenários de erro
✅ Mantenha os métodos focados em uma única responsabilidade
✅ Feche recursos (Scanner, arquivos, etc.)
✅ Siga uma formatação de código consistente
✅ Construa incrementalmente e teste com frequência

## Solução de problemas

**Problema**: Os programas não compilam
- **Solução**: Verifique erros de sintaxe, ponto e vírgula faltando ou nomes de classe incorretos

**Problema**: O Scanner não lê a entrada corretamente
- **Solução**: Lembre-se de chamar `nextLine()` após `nextInt()` para consumir a quebra de linha

**Problema**: Laços infinitos ou o programa trava
- **Solução**: Verifique as condições do laço e garanta que elas se tornarão falsas em algum momento

**Problema**: Exceções de ponteiro nulo (NullPointerException)
- **Solução**: Inicialize todas as variáveis antes de usá-las

---

**Repositório**: Menezesvm/EstudosJava
**Linguagem**: Java 100%
**Status**: ✅ Completo com exercícios e projetos
**Criado**: Para estudo estruturado de Java
**Última atualização**: 2026

Comece pelo [primeiro-projeto](primeiro-projeto/README.md) e avance por cada projeto no seu próprio ritmo! 🚀
