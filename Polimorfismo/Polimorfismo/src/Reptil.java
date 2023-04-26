public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void alimentar() {
        System.out.println("comendo insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }

    @Override

    public void locomover() {
        System.out.println("rastejando");
    }

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {

        return "Reptil{" + "corEscama=" + corEscama + '}';
    }
}


