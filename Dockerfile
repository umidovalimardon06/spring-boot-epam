FROM maven:3.9.14-eclipse-temurin-21 AS builder

WORKDIR /build/

COPY pom.xml /build/
COPY src /build/src/

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre-jammy

WORKDIR /app/

COPY --from=builder /build/target/spring-boot-epam-0.0.1-SNAPSHOT.jar /app/application.jar

CMD ["java", "-jar", "/app/application.jar"]
