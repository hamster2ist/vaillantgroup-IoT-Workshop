FROM openjdk:8
MAINTAINER Jonas Eller
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Main.java
CMD ["java", "Main"]