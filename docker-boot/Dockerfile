FROM openjdk:17-alpine
ARG JAR_FILE=target/docker-boot.jar
COPY ${JAR_FILE} docker-boot.jar
EXPOSE 8880
ENTRYPOINT ["java","-jar","/docker-boot.jar"]