FROM eclipse-temurin:17

WORKDIR /app

COPY target/spring-docker-image-0.0.1-SNAPSHOT.jar /app/spring-docker.jar

ENTRYPOINT ["java", "-jar", "spring-docker.jar"]