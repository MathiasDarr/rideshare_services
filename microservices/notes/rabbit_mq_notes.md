### RabbitMQ Notes ###


- List all rabbitmq queues
curl -u guest:guest -XGET http://localhost:15672/api/queues


curl -u guest:guest -i -H "content-type:application/json" -X POST http://127.0.0.1:15672/api/spring-boot/%2F/foo/get -d'{"count":5,"ack_mode"="ack_requeue_true","encoding":"auto","truncate":50000}' 

curl -u guest:guest -i -H "content-type:application/json" -X POST http://127.0.0.1:15672/api/spring/%2F/foo/get -d'{"count":5,"ack_requeue_true":true,"encoding":"auto","truncate":50000}' 

curl -u guest:guest -i -H "content-type:application/json" http://127.0.0.1:15672/api/exchanges


spring Advanced Message Queuing Protocol

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;