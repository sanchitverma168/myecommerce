# syntax=docker/dockerfile:1

################################################################################

# Create a stage for resolving and downloading dependencies.
FROM maven:3.8.4-openjdk-17 AS builder

WORKDIR /home/springbootecomdb

COPY . /home/springbootecomdb/
# COPY .mvn/ .mvn/

RUN mvn dependency:go-offline -B -V

# COPY src/ src/

RUN mvn package -DskipTests

################################################################################

# Create a stage for running the application.
FROM openjdk:17 AS final

WORKDIR /home/springbootecomdb

RUN ls
COPY --from=builder /home/springbootecomdb/target/service_registry.jar service_registry.jar

EXPOSE 6200

CMD ["java", "-jar", "service_registry.jar"]
