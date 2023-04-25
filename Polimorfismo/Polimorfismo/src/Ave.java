public class Ave  extends Animal{

    private String corPena;

    public void fazerNinho() {
        System.out.println("fazendo ninho");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo larvas");
    }

    @Override
    public void emitirSom() {
        System.out.println("sons de passaros");
    }

    @Override
    public void locomover() {
        System.out.println("voando");
    }
    

    public String getCorPena() {
        return this.corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "{" +
            " corPena='" + getCorPena() + "'" +
            "}";
    }

}
