FROM openjdk:12-alpine

COPY target/calculator_devops-1.0-SNAPSHOT-jar-with-dependencies.jar /calc_devops.jar

CMD ["java","-jar","/calc_devops.jar"]
