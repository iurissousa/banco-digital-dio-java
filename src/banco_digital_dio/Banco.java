package banco_digital_dio;

public class Banco {
    
    private String nome;
    private int quantidadeDeClientes;
    
    public Banco(String nome, int quantidadeDeClientes){
        this.nome = nome;
        this.quantidadeDeClientes = quantidadeDeClientes;
    }

    public int getQuantidadeDeClientes() {
        return quantidadeDeClientes;
    }

    public void setQuantidadeDeClientes(int quantidadeDeClientes) {
        this.quantidadeDeClientes = quantidadeDeClientes;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void imprimirDadosDoBanco(){
        System.out.printf("=== Dados do banco ===\nNome do banco: %s\n Quantidade de contas: %d\n", nome, quantidadeDeClientes);
    }
}