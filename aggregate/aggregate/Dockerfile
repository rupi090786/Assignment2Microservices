FROM openjdk:8-jdk-alpine

EXPOSE 9092

ADD target/aggregate.jar aggregate.jar
ENTRYPOINT [ "java", "-jar", "/aggregate.jar" ]