public class Mamifero extends Animal {
    private String corPelo;


    @Override
    public void alimentar() {
        System.out.println("comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");  
    }

    @Override
    public void locomover() {
        System.out.println("correndo");
    }



    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }


    @Override
    public String toString() {
        return "{" +
            " corPelo='" + getCorPelo() + "'" +
            "}";
    }


}
