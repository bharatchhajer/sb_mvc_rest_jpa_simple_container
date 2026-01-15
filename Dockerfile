# Use lightweight JDK
FROM eclipse-temurin:17-jdk-alpine

# Create app directory
WORKDIR /app

# Copy jar
COPY target/sb_mvc_rest_jpa_simple_container-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]
