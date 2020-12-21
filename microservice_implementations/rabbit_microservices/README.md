### RABBIT MICROSERVICE ###

This directory contains the microservices implemented w/ Cassandra & RabbitMQ as a message queue. 


### Reproduction Steps ###
* Compile & Package
    * mvn clean package
* Run the RabbitMQ Consumser
    * java -jar driver-dispatch-service/target/driver-dispatch-service-0.0.1-SNAPSHOT.jar 
* Run the RabbitMQ Producer (in a different terminal window)
    * java -jar rideservice/target/rideservice-0.0.1-SNAPSHOT.jar
    * Make a request to the server 
     ```bat
    curl --header "Content-Type: application/json"   --request PUT   --data '{
          "time": "2020-12-20T10:37:24.200+0000",
          "riders":2,
          "location_lat":23.1,
          "location_lng": 19.0,
          "destination_lat":12.0,
          "destination_lng":11.1
     }'   http://localhost:8080/rides/requests
    ```
    * In the terminal running the rabbit receiver a message should be printed