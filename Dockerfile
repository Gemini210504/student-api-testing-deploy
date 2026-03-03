# Use Java 17 from Eclipse Temurin
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy Spring Boot jar (make sure jar exists in target/)
COPY target/Students-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java","-jar","app.jar"]