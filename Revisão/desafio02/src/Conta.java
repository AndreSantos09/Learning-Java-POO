public class Conta extends Nubank {
    private String name;
    private String cpf;
    private int numCartao;

    
    public Conta(String name, String cpf, int numCartao) {
        this.setName(name);
        this.setCpf(cpf);
        this.setNumCartao(numCartao);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void modDinheiroInfinit() {
        super.modDinheiroInfinit();
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    @Override
    public String toString() {
        return "Nome: " + name +"\n"+
        "Cpf: " + cpf +"\n"+
        "NumCartao: " + numCartao +"\n"+
        "Saldo: " + this.getSaldo();
    }

    
}
