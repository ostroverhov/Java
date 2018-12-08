mkdir target
javac -d target -sourcepath src src/by/ostroverhov/lesson6/calculator/Main.java
java -cp target -Djava.util.logging.config.file=logging.properties target.by.itacademy.lesson6.calculator.Main
pause