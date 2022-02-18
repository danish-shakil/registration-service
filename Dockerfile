FROM openjdk:11
ADD target/registration-service.jar registration-service.jar
ENTRYPOINT ["java", "-jar", "registration-service.jar"]
EXPOSE 8080