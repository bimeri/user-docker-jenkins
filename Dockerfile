FROM openjdk11
COPY src/main/resources/application.properties application.properties
COPY target/*.jar docker-jenkins.jar
ENTRYPOINT ["java","-jar","docker-jenkins.jar"]
