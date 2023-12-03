FROM openjdk:17

LABEL maintainer="javadeveloper.vivek@gmail.com"

COPY /target/kafka-app-0.0.1-SNAPSHOT.jar /kafka-app-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "kafka-app-0.0.1-SNAPSHOT.jar"]