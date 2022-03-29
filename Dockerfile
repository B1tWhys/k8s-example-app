FROM maven:3.8-adoptopenjdk-11 AS builder
WORKDIR /src
ADD pom.xml .
ADD src src
RUN mvn install

FROM eclipse-temurin:11-jre-alpine
USER guest
COPY --from=builder /src/target/*.jar /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]
