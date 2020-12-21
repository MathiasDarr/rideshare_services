package org.mddarr.kafkaproducer.controllers;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {


    @PutMapping(value="produce")
    public String createKafkaMessage(){
        return "hello";
    }

}
