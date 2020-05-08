FROM openjdk:8-alpine
COPY target/calculator-0.0.1-SNAPSHOT.jar /usr/local/calc
RUN mkdir /usr/local/calc
WORKDIR /usr/local/calc
CMD ["java","-jar","calculator-0.0.1-SNAPSHOT.jar"]
