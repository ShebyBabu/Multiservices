FROM openjdk:11-jdk-stretch

WORKDIR /src/main/track-service

ADD ./target/userservice-0.0.1-SNAPSHOT.jar   /src/main/track-service/userservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","userservice-0.0.1-SNAPSHOT.jar"]