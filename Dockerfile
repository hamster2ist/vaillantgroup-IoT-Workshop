FROM openjdk:12-alpine
MAINTAINER Jonas Eller
ADD ./target/*.jar /application.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/application.jar"]