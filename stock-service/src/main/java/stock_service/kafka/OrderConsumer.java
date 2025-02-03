package stock_service.kafka;

import basedomain.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(OrderEvent orderEvent){
        LOGGER.info((String.format("Order Event Received in Stock Service => %s",orderEvent.toString())));

        //save the order event into database


    }

}
