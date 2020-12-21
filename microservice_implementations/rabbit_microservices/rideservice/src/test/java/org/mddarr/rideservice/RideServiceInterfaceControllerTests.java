package org.mddarr.rideservice;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RideServiceInterfaceControllerTests {

    /*
    @SpringBootTest annotation tells Spring Boot to look for main configuration class @SpringBootApplication and to use that to start a Spring application context.
     */

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads(){

    }

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/rides", String.class)).contains("Ride");
    }

}
