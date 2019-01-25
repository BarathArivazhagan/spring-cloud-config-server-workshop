FROM openjdk:8-jdk-alpine 
RUN adduser -D configclient
USER configclient
ADD target/config-client-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]