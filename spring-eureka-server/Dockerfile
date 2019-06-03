FROM openjdk:11-jdk-stretch

WORKDIR /src/main/eureka-server

COPY ./target/spring-eureka-server-0.0.1-SNAPSHOT.jar  /src/main/eureka-server/spring-eureka-server-0.0.1-SNAPSHOT.jar

RUN ls -la

ENTRYPOINT ["java","-jar","spring-eureka-server-0.0.1-SNAPSHOT.jar"]