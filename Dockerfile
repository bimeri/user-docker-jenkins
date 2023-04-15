FROM openjdk:11
EXPOSE 4001
#COPY src/main/resources/application.properties application.properties
#ADD src/main/resources/application.properties application.properties
ADD target/*.jar docker-jenkins.jar
ENTRYPOINT ["java","-jar","docker-jenkins.jar"]
