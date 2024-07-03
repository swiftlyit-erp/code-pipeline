FROM maven:3.8.8 AS build
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:reslove
COPY . /app
RUN mvn clean
RUN maven package -DskipTests -X

FROM openjdk
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]