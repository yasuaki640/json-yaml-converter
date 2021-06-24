# Dockerfile
FROM maven:3.8.1-openjdk-11 as builder

WORKDIR /usr/src/
# pom.xmlだけCOPYし、先に依存解決
COPY ./pom.xml /usr/src/
RUN mvn -B dependency:resolve dependency:resolve-plugins

# ビルドで必要となるファイルのみCOPY
COPY ./src/ /usr/src/src/
RUN mvn -B package

FROM openjdk:11-alpine

COPY --from=builder /usr/src/target/example-1.0.0.jar /
ENV CLASSPATH /example-1.0.0.jar

ENTRYPOINT []
CMD ["java", "-jar", "Example"]