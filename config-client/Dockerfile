FROM maven:3.6.0-jdk-8-alpine AS build 
WORKDIR /app
COPY src /app  
COPY pom.xml /app
RUN cd /app && mvn clean package

FROM openjdk:8-jdk-alpine AS final
RUN adduser -D configclient
USER configclient
ADD target/config-client-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]