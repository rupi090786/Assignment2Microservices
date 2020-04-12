FROM openjdk:8-jdk-alpine

EXPOSE 9090

ADD target/user.jar user.jar
ENTRYPOINT [ "java", "-jar", "/user.jar" ]