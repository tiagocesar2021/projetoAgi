
# Projeto de Automação de Testes

Este repositório contém um projeto de automação de testes que utiliza **Selenium** para testes de interface de usuário (UI).

## Índice

- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Como Executar os Testes](#como-executar-os-testes)
- [Configurações](#configurações)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- [Java JDK 17](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- [Maven 3.9.7](https://maven.apache.org/)
- [Git](https://git-scm.com/)

## Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/tiagocesar2021/projetoAgi
   cd automacaoTestAgi
   ```

2. Instale as dependências do projeto utilizando o Maven:

   ```bash
   mvn clean install
   ```

## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte maneira:

```
.
├── src
│   ├── main
│   │   └── java
│   │       └──enums          
│   ├── test
│   │   └── java
│   │       ├──pages
│   │       ├──runners
│   │       ├──stepDefinition    
│   │       ├──util
│   │       └── resources
│   │           └── features
├── .gitignore
├── Dockerfile
├── LICENSE
├── pom.xml
└── README.md
```

- **src/main/java**: Contém o código principal (se necessário).
- **src/test/java/ui/tests**: Contém os testes de interface de usuário usando Selenium.
- **src/test/java/api/tests**: Contém os testes de API usando Rest Assured.
- **pom.xml**: Arquivo de configuração do Maven.

## Como Executar os Testes

### Testes de UI (Selenium)

Para executar os testes de UI, utilize o seguinte comando Maven:

```bash
mvn -Dtest=runner.RunnerCucumber test
```

## Configurações

As configurações específicas do projeto, como URLs de endpoints e credenciais, podem ser encontradas no arquivo `config.properties` (ou um arquivo equivalente) no diretório `src/test/resources`.

## Contribuindo

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-feature`).
3. Commit suas alterações (`git commit -m 'Adiciona nova feature'`).
4. Faça um push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
