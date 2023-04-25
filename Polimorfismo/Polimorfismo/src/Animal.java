public abstract class Animal {
    private double peso;
    private int idade;
    private String membros;
    
    public void locomover(){

    }

    public void alimentar(){

    }   

    public void emitirSom(){

    }   

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return this.membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }
    
}
