/**
 * Elevador
 */
public abstract class Elevador {

    protected int andarAtual;
    protected int totalAndares;
    protected int capacidadeElevador;


    public Elevador(int andarAtual, int totalAndares, int capacidadeElevador) {
        this.setAndarAtual(andarAtual);
        this.setTotalAndares(totalAndares);
        this.setCapacidadeElevador(capacidadeElevador);
    }
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getTotalAndares() {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }
    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }


    public void inicializa() {  
    }

    public void entra() {     
    }

    public void sai() {          
    }

    public void sobe() {
    }

    public void desce() { 

    }


}