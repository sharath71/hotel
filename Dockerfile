# Use the official Tomcat image from Docker Hub
FROM tomcat:9.0.50-jdk11-adoptopenjdk-hotspot

# Remove the default ROOT application
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy your WAR file to the Tomcat webapps directory and rename it to ROOT.war
COPY target/hotel-management-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080 (default Tomcat port)
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
