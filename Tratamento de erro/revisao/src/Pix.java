public class Pix {
    double valor;

    public Pix(double valor) {
        this.setValor(valor);
    }

    public void Transferencia(double valtransference) throws Transacaoexception {
        if(valtransference == 0) {
            throw new Transacaoexception("Error!: Apenas valores acima de 0$, tente novamente.");
        }
        else if(valtransference > 10000){
            throw new Transacaoexception("Error!: Limite de transferencia de [10000].");
        }
        else if(valor < valtransference){
            throw new Transacaoexception("Error!: Saldo insuficiente!");
        }
        else {
            this.setValor(this.getValor() - valtransference);
            System.out.println("Transferencia realizada com sucesso!");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
