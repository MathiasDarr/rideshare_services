package org.mddarr.kafkareceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class KafkaReceiverApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaReceiverApplication.class, args);
	}

	@Bean
	public Function<byte[], byte[]> handle(){
		return in -> new String(in).toUpperCase().getBytes();
	}
}
