public abstract class Nubank {
    
    private double saldo = 0.0;

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Nubanks error!, deposite apenas valores acima de 0.0$");
        }else{
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Nubanks agradece!, valor depositado na conta");
        }
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("Nubanks error!, deposite apenas valores acima de 0.0$");
        }else if(valor > 10000){
            System.out.println("Nubanks error!, deposite apenas valores abaixo de [10MIL$]");
        }
        else{
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Nubanks agradece!, valor depositado na conta");
        }
    }

    public void modDinheiroInfinit(){
        this.setSaldo(this.getSaldo() + 999.999);
        System.out.println("Trapassa ativa!, seu saldo foi para:" + this.getSaldo()+"$");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

}
