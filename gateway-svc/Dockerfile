FROM java:8-jdk-alpine

RUN echo "Asia/Shanghai" > /etc/timezone

COPY ./gateway-svc/target/gateway-svc-1.0-SNAPSHOT.jar /usr/app/app.jar
COPY ./skywalking /skywalking

WORKDIR /usr/app

RUN sh -c 'touch app.jar /skywalking/agent/skywalking-agent.jar'

#ENTRYPOINT exec java -javaagent:/skywalking/agent/skywalking-agent.jar -jar app.jar
ENTRYPOINT exec java  -jar app.jar