FROM openjdk:12-alpine
MAINTAINER Jonas Eller
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Main.java
CMD ["java", "Main"]