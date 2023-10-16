FROM eclipse-temurin:17
COPY target/DevopsTask.jar DevopsTask.jar
CMD ["java","-jar","DevopsTask.jar"]