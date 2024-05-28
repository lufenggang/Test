package springboot01kafkabase;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import springboot01kafkabase.producer.EventProducer;

import javax.annotation.Resource;

@SpringBootTest
class KafkaBaseApplicationTests {

    @Resource
    private EventProducer eventProducer;

    @Test
    void contextLoads() {
        eventProducer.sendEvent();
    }

}
