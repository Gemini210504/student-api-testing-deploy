# Use Eclipse Temurin JDK
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Build the jar inside Docker
RUN ./mvnw clean package -DskipTests || mvn clean package -DskipTests

# Copy the jar created by Maven
COPY target/Students-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]