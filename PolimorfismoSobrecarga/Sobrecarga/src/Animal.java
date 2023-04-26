public abstract class Animal {
    private float peso;
    private int idade;
    private int membros;

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal [peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
    }
    

}
