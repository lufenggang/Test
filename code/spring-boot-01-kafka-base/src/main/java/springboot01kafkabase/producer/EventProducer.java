package springboot01kafkabase.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class EventProducer {

    @Resource
    private KafkaTemplate kafkaTemplatel;

    public void sendEvent(){
        kafkaTemplatel.send("hello","good luck to you, lfg3");
    }

}
