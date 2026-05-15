FROM eclipse-temurin:17

WORKDIR /app

COPY . .

RUN ./mvnw clean package || mvn clean package

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]