FROM openjdk:17
EXPOSE 8080
ADD target/calculator_integration.jar calculator_integration.jar
ENTRYPOINT ["java", "-jar", "/calculator_integration.jar"]