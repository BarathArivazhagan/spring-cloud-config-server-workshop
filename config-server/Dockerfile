FROM openjdk:8-jdk-alpine
RUN adduser -D configserver
USER configserver
ADD target/config-server-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]