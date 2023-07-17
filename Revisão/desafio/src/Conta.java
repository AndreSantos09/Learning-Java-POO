public abstract class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.println("Seu saldo é: " + this.getSaldo());
    }

    public void depositar(double valor) {
        if (valor > 10000) {
            System.out.println("Limite de depósito é de [10.000$]");
        } else if (valor < 0 || valor == 0) {
            System.out.println("Impossivel sacar valores menores ou iguais a [0.000$]");
        } else {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!, seu saldo é: " + this.getSaldo());
        }
    }

    public void sacar(double valor) {
        if(valor > this.getSaldo()) {
            System.out.println("SALDO INSUFICIENTE!");
        }else{
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Saque realizado com sucesso!, seu saldo é: " + this.getSaldo());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
