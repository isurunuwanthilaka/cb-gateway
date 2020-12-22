FROM openjdk:11.0.3-jre-slim-stretch
RUN echo "Asia/Colombo" > /etc/timezone
RUN useradd -ms /bin/bash millenniumitesp

RUN mkdir /var/log/app
RUN chown -R 1000:1000 /var/log/app

USER millenniumitesp
ADD target/api-gateway-*.jar app.jar
ADD src/main/resources/application.yaml application.yaml
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar","--spring.config.location=application.yaml"]