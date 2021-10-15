package br.com.zup.edu.email.kafka;

import br.com.zup.edu.email.email.EmailRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;

@Component
public class ListenerTransacao {

    private final Logger logger = LoggerFactory.getLogger(ListenerTransacao.class);

    @Autowired

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void escuta(EmailRecord emailRecord) {

        try {
            .save(transacao);
            logger.info("Transação com sucesso para o id {} ", transacaoForm.getId());

        } catch (Exception exception){
            logger.error("Falha com o status {} para a transaçao com id {} ", exception.getMessage(), transacaoForm.getId());
        }
    }
}
