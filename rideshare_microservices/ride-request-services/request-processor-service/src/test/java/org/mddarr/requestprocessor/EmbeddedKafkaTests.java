package org.mddarr.requestprocessor;


import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EmbeddedKafkaTests {

    private static final String INPUT_TOPIC = "uppercase-in";
    private static final String OUTPUT_TOPIC = "echo";
    private static final String GROUP_NAME = "embeddedKafkaApplication";

}
