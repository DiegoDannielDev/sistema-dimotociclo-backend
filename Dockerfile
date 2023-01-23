FROM maven:3.6.3 AS maven
LABEL MAINTAINER="sgwebfreelancer@gmail.com"

WORKDIR /usr/src/app
COPY . /usr/src/app
# Compile and package the application to an executable JAR
RUN mvn package

# For Java 11,
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=di-motociclo-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

# Copy the spring-boot-api-tutorial.jar from the maven stage to the /opt/app directory of the current stage.
COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "di-motociclo-0.0.1-SNAPSHOT.jar" ]