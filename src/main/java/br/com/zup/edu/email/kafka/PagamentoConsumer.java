package br.com.zup.edu.email.kafka;

import br.com.zup.edu.email.email.Email;
import br.com.zup.edu.email.email.EmailRepository;
import br.com.zup.edu.email.records.PagamentoRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoConsumer {

    private static final Logger logger = LoggerFactory.getLogger(PagamentoConsumer.class);

    @Autowired
    private EmailRepository emailRepository;

    @KafkaListener(topics = "${spring.kafka.topic.pagamento}",
            groupId = "${spring.kafka.consumer.group-id}",
            properties = {"spring.json.value.default.type=br.com.zup.edu.email.records.PagamentoRecord"})
    public void consumir(ConsumerRecord<String, PagamentoRecord> record) {
        Email email = emailRepository.save(record.value().toModel());
        logger.info("Email enviado para " + email.getDestinatario());
    }

}
