# Use uma imagem base do OpenJDK
FROM openjdk:11

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Copie o arquivo JAR da pasta 'target' para o contêiner
COPY target/di-motociclo-0.0.1-SNAPSHOT.jar /app/

# Comando para iniciar o aplicativo Java
CMD ["java", "-jar", "di-motociclo-0.0.1-SNAPSHOT.jar"]
