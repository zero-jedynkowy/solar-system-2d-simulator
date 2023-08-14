javac solar_system/*.java
jar cfe solar_system.jar solar_system/Main solar_system/*.class
rm solar_system/*.class
java -jar solar_system.jar