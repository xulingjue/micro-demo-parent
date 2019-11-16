FROM java:8-jdk-alpine

COPY ./target/gateway-svc-1.0-SNAPSHOT.jar /usr/app/app.jar

WORKDIR /usr/app

RUN sh -c 'touch app.jar'

ENTRYPOINT ["java", "-jar", "app.jar"]