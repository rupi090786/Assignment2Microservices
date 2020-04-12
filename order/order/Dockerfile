FROM openjdk:8-jdk-alpine

EXPOSE 9091

ADD target/order.jar order.jar
ENTRYPOINT [ "java", "-jar", "/order.jar" ]