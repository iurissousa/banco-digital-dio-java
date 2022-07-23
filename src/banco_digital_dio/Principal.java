package banco_digital_dio;

public class Principal {
    
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();        
        Conta poupanca = new ContaPoupanca();
        Cliente cliente1 = new Cliente("Joao", 3);
        Banco bancoLegal = new Banco("Banco Legal", 100);
        ClienteEspecial cliente2 = new ClienteEspecial("Maria", 5, 123456789);
        
        
        cliente1.imprimirDadosDoCliente();
        cliente2.imprimirDadosDoCliente();
        bancoLegal.imprimirDadosDoBanco();
        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
