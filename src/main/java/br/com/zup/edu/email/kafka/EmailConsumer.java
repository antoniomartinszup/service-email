package br.com.zup.edu.email.kafka;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class EmailConsumer {


    //Mo properties, aí embaixo
    @KafkaListener(topics = "${spring.kafka.topic.transactions}",
            groupId = "${spring.kafka.consumer.group-id}",
            properties = {"spring.json.value.default.type=br.com.zup.edu.email.email.EmailRecord"})
    public void consumir(ConsumerRecord<String, br.com.zup.edu.email.email.EmailRecord> record)
    {
        System.out.println(record.value());;
    }

}
