FROM openjdk:11-jdk-stretch

WORKDIR /src/main/user-service

ADD ./target/testdemo-0.0.1-SNAPSHOT.jar   /src/main/user-service/testdemo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","testdemo-0.0.1-SNAPSHOT.jar"]