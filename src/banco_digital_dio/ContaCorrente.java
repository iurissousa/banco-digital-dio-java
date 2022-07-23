
package banco_digital_dio;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }    
}