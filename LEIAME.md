# Estudos

Bem-vindo — este repositório contém projetos e exercícios em Java selecionados para demonstrar minhas habilidades técnicas, minha abordagem de resolução de problemas e minha prontidão para atuar profissionalmente no desenvolvimento de software. O código-fonte prioriza a qualidade e a manutenibilidade, utilizando ferramentas práticas comuns no desenvolvimento *backend* moderno.

## O que recrutadores devem saber

- Foco na linguagem: Java (conceitos fundamentais, POO, generics, tratamento de exceções)
- Abordagem de profundidade em vez de velocidade: cada tópico é estudado em detalhe, incluindo READMEs próprios com diagramas UML/de classes para os exercícios conceitualmente mais ricos
- Atualmente avançando em direção a Spring Boot, seguindo um roteiro de estudos estruturado

## Estrutura do repositório

O repositório é organizado por nível de aprendizado:

| Pasta | Foco |
|---|---|
| [`01-Basic Level`](01-Basic%20Level) | Fundamentos: sintaxe, controle de fluxo, POO básica, exercícios procedurais pequenos |
| [`02- Intermediated Level`](02-%20Intermediated%20Level) | Encapsulamento, herança, composição, interfaces, tratamento de exceções, coleções |
| [`03-Advanced Level`](03-Advanced%20Level) | Generics, tipos delimitados (*bounded types*) |

## Projetos em destaque

Esses exercícios aprofundam um único conceito de POO e possuem um README próprio com diagrama de classes em Mermaid:

- [`Interfaces`](02-%20Intermediated%20Level/Interfaces) — Injeção de dependência via interface (`OnlinePaymentService` / `PaypalService` / `ContractService`)
- [`Composition`](02-%20Intermediated%20Level/Composition) — Composição de objetos (`Order`, `OrderItem`, `Product`, `Client`)
- [`Inheritance2`](02-%20Intermediated%20Level/Inheritance2) — Classes abstratas e polimorfismo (`TaxPrayer`, `Individual`, `Company`)
- [`ExceptionHandling`](02-%20Intermediated%20Level/ExceptionHandling) — Exceções customizadas estendendo `RuntimeException`

Cada pasta de projeto possui um README com instruções de configuração e execução; veja `02- Intermediated Level/README - 02-Intermediate Level (PT).md` para a lista completa de exercícios com descrições.

## Como avaliar meu trabalho rapidamente

1. Leia o README de cada projeto para entender o objetivo e a configuração.
2. Analise o código em busca de convenções de nomenclatura consistentes, métodos pequenos e focados, e separação de responsabilidades.
3. Confira os projetos em destaque acima para ver exercícios com diagramas que mostram o raciocínio sobre relação entre classes, não só código funcionando.

## Como executar (padrão)

- Pré-requisitos: JDK 17+ (ou versão específica do projeto)
- Comandos comuns (`javac`/`java` puro, já que são projetos de exercício sem ferramenta de build):
  ```bash
  cd "NomeDoProjeto"
  javac -d bin $(find src -name "*.java")
  java -cp bin application.Program   # ou o nome da classe principal
  ```
- Ou abra a pasta diretamente na sua IDE (IntelliJ IDEA, VS Code, Eclipse) e execute a classe que contém o `main`.

## O que busco

Busco oportunidades em desenvolvimento *backend* Java — estágios, vagas de nível júnior ou projetos colaborativos — onde eu possa construir softwares *server-side* confiáveis e bem testados.

## Contato

- GitHub: https://github.com/Menezesvm
- E-mail: vinicius.menezes2@ufrpe.br
- LinkedIn: https://www.linkedin.com/in/viniciusmenezes2

---

Obrigado por conferir meus estudos — sinta-se à vontade para explorar qualquer projeto, abrir uma *issue* ou entrar em contato para obter mais detalhes ou propor uma colaboração.
