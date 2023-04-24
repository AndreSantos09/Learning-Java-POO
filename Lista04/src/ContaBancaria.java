public class ContaBancaria {
    private double saldo;
    private double limite;

    // constructor
    public ContaBancaria() {
        this.setLimite(2000);
        this.setSaldo(0);
    }

    // methods
    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido, impossível depositar");
        } else if (valor > limite) {
            System.out.println("Valor ultrapassa o limite de depositos");
        } else {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido, impossível sacar");
        } else if (valor > saldo) {
            System.out.println("Valor ultrapassa o saldo disponivel");
        } else if (valor > limite) {
            System.out.println("Impossivel sacar, valor ultrapassa o limite");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public void conta() {
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Limite: " + this.getLimite());
    }

    // getter and setter methods

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
