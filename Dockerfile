FROM lancelotzhu/openjdk17-hotspot:1.0.0-slim

MAINTAINER riteship.com

COPY target/wise-ship-mysql-student-crud-api-0.0.1-SNAPSHOT.jar wise-ship-student-crud-api.jar

ENTRYPOINT ["java","-jar","wise-ship-student-crud-api.jar"]