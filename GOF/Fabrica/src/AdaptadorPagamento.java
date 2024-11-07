public class AdaptadorPagamento implements IPagamento {

    private ServicoPagamentoExterno servicoPagamentoExterno;

    //Construtor
    public AdaptadorPagamento(ServicoPagamentoExterno servicoPagamentoExterno) {
        this.servicoPagamentoExterno = servicoPagamentoExterno;
    }

    //Implementado o pagamento, adaptando o servico de pagamento externo
    @Override
    public void efetuarPagamento(String usuario, double valor) {
        System.out.println("Usuario que chegou: "+usuario+ " | Multa que chegou: "+valor);
        servicoPagamentoExterno.pagarFatura(usuario, valor);
    }
}
