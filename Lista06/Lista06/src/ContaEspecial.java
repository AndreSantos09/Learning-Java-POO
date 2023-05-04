public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(String cliente, int numConta) {
        super(cliente, numConta);
        this.setLimite(2000);
    }

    @Override
    public void depositar(double valor) {

        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor > (this.getSaldo() + limite)) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + this.getSaldo());
        }
    }


    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
