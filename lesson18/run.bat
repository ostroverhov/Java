call mvn clean package
call mvn flyway:migrate
java -jar target/lesson18-1.0-SNAPSHOT-jar-with-dependencies.jar
pause