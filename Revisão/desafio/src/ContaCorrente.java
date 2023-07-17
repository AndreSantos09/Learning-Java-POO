public class ContaCorrente extends Conta{

    
    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void exibirSaldo() {
        
        super.exibirSaldo();
    }

    @Override
    public void depositar(double valor) {
        
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        
        super.sacar(valor * 0.05);
    }
    
    
}
