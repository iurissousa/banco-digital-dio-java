package banco_digital_dio;

public class ClienteEspecial extends Cliente {
    
    int cartaoDeCredito;
    
    public ClienteEspecial(String nome, int quantidadeDeContas) {
        super(nome, quantidadeDeContas);
    }
    
    public ClienteEspecial(String nome, int quantidadeDeContas, int cartaoDeCredito){
        super(nome, quantidadeDeContas);
        this.cartaoDeCredito = cartaoDeCredito;
    }
    
    @Override
    public void imprimirDadosDoCliente(){
        System.out.printf("=== Dados do cliente ===\nNome: %s\nQuantidade de contas: %d\nCartão de crédito: %d\n", nome, quantidadeDeContas, cartaoDeCredito);
    }
}
