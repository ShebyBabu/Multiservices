FROM openjdk:11-jdk-stretch

WORKDIR /src/main/zuul-api-gateway

ADD ./target/zuul-api-gateway-0.0.1-SNAPSHOT.jar   /src/main/zuul-api-gateway/zuul-api-gateway-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","zuul-api-gateway-0.0.1-SNAPSHOT.jar"]