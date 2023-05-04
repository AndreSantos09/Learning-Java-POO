public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;


    public ContaBancaria(String cliente, int numConta) {
        this.setCliente(cliente);
        this.setNumConta(numConta);
        this.setSaldo(0);
    }


    public void sacar(double valor ){
        if(valor > this.getSaldo()){
            System.out.println("Saldo insuficiente");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Impossível sacar este valor, a conta não pode ficar com saldo negativo");
        }
        else{
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
        }
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso");
    }


    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    @Override
    public String toString() {
        return
            "========================" + "\n" +
        "    " +  "cliente = " + getCliente()   + "\n" +
        "    " +  "numConta = " + getNumConta() + "\n" +
        "    " +  "saldo = " + getSaldo() + "\n" +
            "========================";
    }
    
    
}
