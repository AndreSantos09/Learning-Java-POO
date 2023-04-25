public class Peixe extends Animal {

    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe não emite som");
    }

    @Override
    public void locomover() {
        System.out.println("nadando");
    }
    
    public void soltarBolha(){
        System.out.println("soltou uma bolha");
    }

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Peixe{" + "corEscama=" + corEscama + '}';
    }

}
