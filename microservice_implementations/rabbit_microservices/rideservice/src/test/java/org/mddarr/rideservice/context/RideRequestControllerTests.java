package org.mddarr.rideservice.context;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
public class RideRequestControllerTests {
    /*
    RideRequestController tests that rely on full Spring TestContext framework to load configuration.  Strategy is to test behavior of controllers using
    Spring configuration.

    */

    @Test
    public void requestRide() throws Exception {

    }


//
//    @Configuration
//    static class TestConfig implements ApplicationListener<ContextRefreshedEvent>{
//        /*
//        Configuration class that un-registers MessageHandlers it finds in the ApplicationContexxt from the message channels they are subscribed to.
//        	* The intent is to reduce additional processing and additional messages not
//	        * related to the test.
//         */
//        @Autowired
//        private List<SubscribableChannel> channels;
//
//        @Autowired
//        private List<MessageHandler> handlers;
//
//
//        @Override
//        public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//            for (MessageHandler handler: handlers){
//                if(handler instanceof SimpAnnotationMethodMessageHandler){
//                    continue;
//                }
//                for(SubscribableChannel channel: channels){
//                    channel.unsubscribe(handler);
//                }
//
//            }
//        }
//    }





}
