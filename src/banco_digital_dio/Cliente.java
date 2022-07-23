package banco_digital_dio;

public class Cliente {
    protected String nome;
    protected int quantidadeDeContas;
    
    public Cliente(String nome, int quantidadeDeContas){
        this.nome = nome;
        this.quantidadeDeContas = quantidadeDeContas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeContas() {
        return quantidadeDeContas;
    }

    public void setQuantidadeDeContas(int quantidadeDeContas) {
        this.quantidadeDeContas = quantidadeDeContas;
    }
    
    public void imprimirDadosDoCliente(){
        System.out.printf("=== Dados do cliente ===\nNome: %s\nQuantidade de contas: %d\n", nome, quantidadeDeContas);
    }
}
