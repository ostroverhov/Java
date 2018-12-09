mkdir target
javac -d target -encoding utf8 -sourcepath src src/by/ostroverhov/lesson9/locales/Main.java
java -cp target -Djava.util.resource.properties.file=resource.properties by.ostroverhov.lesson9.locales.Main
pause