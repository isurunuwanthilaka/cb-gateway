FROM openjdk:11.0.3-jre-slim-stretch
RUN echo "Asia/Colombo" > /etc/timezone
RUN useradd -ms /bin/bash isumalab

USER isumalab
ADD target/registry-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
