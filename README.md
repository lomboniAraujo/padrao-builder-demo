Sobre o Projeto
Este repositório exemplifica o uso prático do padrão Builder simulando a modelagem e construção de um Prédio.

A solução resolve o problema de criação de objetos estruturados sem poluir os construtores da classe principal. O PredioBuilder centraliza a lógica de montagem e orquestra a execução de sub-builders (ConstrucaoPortariaBuilder, ConstrucaoAndarBuilder, ConstrucaoCoberturaBuilder), populando dinamicamente a lista interna de elementos (ArrayList<Construcao>) conforme a configuração informada.

O Padrão Builder
O Builder é um padrão de projeto criacional da Gang of Four (GoF) que permite construir objetos complexos passo a passo.

Problemas Solucionados
Evita Construtores Telescópicos: Elimina a necessidade de múltiplos construtores com combinações de argumentos do mesmo tipo.

Orquestração de Componentes: Permite criar hierarquias e listas de sub-elementos durante o processo de build.

Leitura Clara (Fluent Interface): Proporciona uma sintaxe fluida, onde o nome dos métodos explicita o papel de cada parâmetro.

Arquitetura & Estrutura
O código está estruturado segundo boas práticas de modularização em pacotes:

Plaintext
.
├── .gitignore
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── exemplo
    │               └── builder
    │                   ├── ExemploBuilder.java          # Classe principal (Entry point)
    │                   ├── builder
    │                   │   ├── ConstrucaoAndarBuilder.java
    │                   │   ├── ConstrucaoBuilder.java       # Classe abstrata base
    │                   │   ├── ConstrucaoCoberturaBuilder.java
    │                   │   ├── ConstrucaoPortariaBuilder.java
    │                   │   └── PredioBuilder.java          # Builder orquestrador
    │                   └── model
    │                       ├── Construcao.java
    │                       ├── Predio.java
    │                       └── TipoConstrucao.java      # Enum de tipos
    └── test
        └── java
            └── com
                └── exemplo
                    └── builder
                        └── PredioBuilderTest.java       # Suíte de testes unitários
 Tecnologias Utilizadas
Java 17: Uso de sintaxe moderna e fortemente tipada.

Apache Maven: Gerenciamento de dependências e ciclo de vida do projeto.

JUnit 5 (Jupiter): Execução e validação de testes de unidade automatizados.

 Como Executar
Pré-requisitos
JDK 17 ou superior configurado no ambiente.

Git instalado.

Passo a passo
Clone este repositório:

Bash
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO
Compile a aplicação:

Bash
mvn clean compile
Execute a classe principal:

Bash
mvn exec:java -Dexec.mainClass="com.exemplo.builder.ExemploBuilder"
 Executando os Testes
A suíte de testes cobre a validação da montagem do prédio, garantindo a quantidade exata de andares e a presença/ausência da cobertura e portaria.

Para rodar os testes via terminal:

Bash
mvn test
Exemplo de Uso
Java
// Instanciação fluida utilizando o PredioBuilder
Predio predio = new PredioBuilder()
        .setEndereco("Rua das Marrecas, 1313")
        .setAndaresComuns(7)
        .setCobertura(true)
        .getResultado();

System.out.println("Endereço: " + predio.endereco);
System.out.println("Total de estruturas criadas: " + predio.andares.size());
Licença
Este projeto é distribuído sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
