package springboot01kafkabase.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

    @KafkaListener(topics = {"hello"},groupId = "hello-group2")
    private void listenerEvent(String event){
        System.out.printf("读取到的事件："+event);
    }

}
