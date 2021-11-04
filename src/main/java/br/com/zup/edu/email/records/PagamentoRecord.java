package br.com.zup.edu.email.records;

import br.com.zup.edu.email.email.Email;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PagamentoRecord {

    private String codigoDeBarras;
    private LocalDate dataPagamento;
    private BigDecimal valorTotalPago;
    private String emailDestinatario;

    public PagamentoRecord() {
    }

    public PagamentoRecord(String codigoDeBarras, LocalDate dataPagamento, BigDecimal valorTotalPago, String emailDestinatario) {
        this.codigoDeBarras = codigoDeBarras;
        this.dataPagamento = dataPagamento;
        this.valorTotalPago = valorTotalPago;
        this.emailDestinatario = emailDestinatario;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public BigDecimal getValorTotalPago() {
        return valorTotalPago;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    @Override
    public String toString() {
        return "PagamentoRecord{" +
                "codigoDeBarras='" + codigoDeBarras + '\'' +
                ", dataPagamento=" + dataPagamento +
                ", valorTotalPago=" + valorTotalPago +
                ", emailDestinatario='" + emailDestinatario + '\'' +
                '}';
    }

    public Email toModel() {
        String mensagem = "O pagamento do boleto " + codigoDeBarras + " foi efetuado na data "
                + dataPagamento + " com o valor " + valorTotalPago;

        return new Email("Pagamento Efetuado", mensagem, emailDestinatario);
    }
}
