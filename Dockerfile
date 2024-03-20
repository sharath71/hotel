# Use the official Tomcat image from Docker Hub
FROM tomcat:9.0.50-jdk11-adoptopenjdk-hotspot

# Remove the default ROOT application
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy your .war file to the Tomcat webapps directory
COPY target/hotel-management-1.0-SNAPSHOT.jar /usr/local/tomcat/webapps/ROOT.jar

# Expose port 8080 (default Tomcat port)
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
