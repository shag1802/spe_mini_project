FROM openjdk:11
COPY ./target/scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]