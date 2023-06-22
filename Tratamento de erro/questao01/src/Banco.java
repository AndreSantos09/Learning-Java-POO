
    public class Banco {
    private double saldo;

    public Banco(double saldoInicial) {
        this.setSaldo(saldoInicial);
    }

public void sacar(double valor) throws SaldoInsuficienteException, TransacaoException{

    if (valor > this.getSaldo()){
        throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque!");
    }
    else if(valor < 0){
        throw new TransacaoException("Erro durante a transação. Por favor, tente novamente.");
    }
    else{
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo restante: R$" + this.getSaldo());
    }

}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}

