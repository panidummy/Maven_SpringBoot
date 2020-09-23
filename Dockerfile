FROM openjdk:8-jdk-alpine
EXPOSE 8081
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN echo "docker image is in progress.."
ENTRYPOINT ["java", "-jar", "app.jar"]
MAINTAINER "panikumar1001@gmail.com"