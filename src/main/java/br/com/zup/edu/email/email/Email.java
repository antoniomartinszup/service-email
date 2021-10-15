package br.com.zup.edu.email.email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String assunto;
    private String mensagem;
    private String remetente;
    private LocalDateTime criandoEm = LocalDateTime.now();

    @Deprecated
    public Email() {
    }

    public Email(String assunto, String mensagem, String remetente) {
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.remetente = remetente;
    }
}
