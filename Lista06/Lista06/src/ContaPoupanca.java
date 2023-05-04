public class ContaPoupanca extends ContaBancaria {

    private int diaDeRendimento;

    public ContaPoupanca(String cliente, int numConta) {
        super(cliente, numConta);
        this.setDiaDeRendimento(0);
    }

    public void calcularNovoSaldo(double taxa) {
        this.setSaldo(this.getSaldo() + taxa);
        System.out.println("Seu saldo com o acumulo de taxas diário:" + this.getSaldo());
    }

    public int getDiaDeRendimento() {
        return this.diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

}
