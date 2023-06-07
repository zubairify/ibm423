FROM openjdk:17-alpine
ARG JAR_FILE=target/team-app.jar
COPY ${JAR_FILE} team-app.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","/team-app.jar"]