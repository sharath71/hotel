# Use the official OpenJDK 11 image from Docker Hub
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/hotel-management-1.0.0.jar /app/app.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
