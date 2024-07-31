# Use a imagem base do Maven para construir o projeto
FROM maven:3.9.7- openjdk-17 AS build
WORKDIR /app

# Copie o arquivo pom.xml e as dependências do Maven
COPY pom.xml .
RUN mvn dependency:go-offline

# Copie todo o código-fonte do projeto
COPY src ./src

# Construa o projeto
RUN mvn clean package

# Use uma imagem base do JDK para rodar o projeto
FROM openjdk:17
WORKDIR /app

# Copie o arquivo JAR do estágio de build
COPY --from=build /app/target/*.jar app.jar

# Comando para rodar o aplicativo
ENTRYPOINT ["java", "-jar", "app.jar"]
