FROM openjdk:11-jdk-stretch

WORKDIR /src/main/track-config-server

ADD ./target/track-config-server-0.0.1-SNAPSHOT.jar   /src/main/track-config-server/track-config-server-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","track-config-server-0.0.1-SNAPSHOT.jar"]