FROM adoptopenjdk:11-jdk
RUN useradd -ms /bin/bash user
ARG JAR_PATH=target/*.jar
ADD $JAR_PATH /app.jar
USER user:user
ENTRYPOINT ["java", "-jar", "/app.jar"]
