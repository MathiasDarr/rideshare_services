package org.mddarr.rideservice.mock;

import org.mddarr.rideservice.Constants;

import io.confluent.kafka.schemaregistry.client.MockSchemaRegistryClient;
import io.confluent.kafka.schemaregistry.client.SchemaRegistryClient;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.avro.Schema;
import org.mddarr.payments.event.dto.Event1;
import org.mddarr.payments.event.dto.Event2;
import org.mddarr.payments.event.dto.Event3;
import org.mddarr.payments.event.dto.Event4;

/**
 * This code is not thread safe and should not be used in production environment
 */
public class CustomKafkaAvroDeserializer extends KafkaAvroDeserializer {
    @Override
    public Object deserialize(String topic, byte[] bytes) {
        if (topic.equals(Constants.EVENT_1_TOPIC)) {
            this.schemaRegistry = getMockClient(Event1.SCHEMA$);
        }
        if (topic.equals(Constants.EVENT_2_TOPIC)) {
            this.schemaRegistry = getMockClient(Event2.SCHEMA$);
        }
        if (topic.equals(Constants.EVENT_3_TOPIC)) {
            this.schemaRegistry = getMockClient(Event3.SCHEMA$);
        }
        if (topic.equals(Constants.EVENT_4_TOPIC)) {
            this.schemaRegistry = getMockClient(Event4.SCHEMA$);
        }
        return super.deserialize(topic, bytes);
    }

    private static SchemaRegistryClient getMockClient(final Schema schema$) {
        return new MockSchemaRegistryClient() {
            @Override
            public synchronized Schema getById(int id) {
                return schema$;
            }
        };
    }
}
