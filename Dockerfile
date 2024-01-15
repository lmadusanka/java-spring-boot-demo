FROM amazoncorretto:21

COPY target/*.jar my-app.jar

ENTRYPOINT ["java","-jar","/my-app.jar"]