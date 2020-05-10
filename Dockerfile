FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8888
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} e2ecicd.jar
RUN echo "Creating docker image for spring boot application"
MAINTAINER "kavikarthic8@gmail.com"
ENTRYPOINT ["java", "-jar", "e2ecicd.jar"]