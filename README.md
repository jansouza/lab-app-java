# lab-app-java
Basic Java SpringBoot app in Docker which prints the hostname and IP of the container


Build Status
----------


Run application
----------
./mvnw spring-boot:run


Build application
----------

Build the Docker image manually by cloning the Git repo.
  ```
  $ git clone https://github.com/jansouza/lab-app-java.git
  $ docker build -t lab-app-java .
  ```

Maven
  ```
  ./mvnw clean install
  
  # Package
  ./mvnw clean package
  ```

Run the container
----------
Create a container from the image.

  ```
  $ docker run --name lab-app-java -d -p 8080:8080 lab-app-java
  ```

Test
----------

Docker
  ```
  docker build -t lab-app-java . --target test
  ```

Maven
  ```
  mvn clean test jacoco:report
  ```

URLs
----------
https://localhost:9080/api/call
https://localhost:9080/api/erro500