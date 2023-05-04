public abstract class Personagem {
    private String nome;
    private int saude;
    private int forca;
    private int inteligencia;
    private int velocidade;
    private int ataque_fisico;
    private int ataque_distancia;

    public void corpo_a_corpo() {

    }

    public void ataque_distancia() {

    }

    public void cura() {

    }

    public void fuga() {

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaude() {
        return this.saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getForca() {
        return this.forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAtaque_fisico() {
        return this.ataque_fisico;
    }

    public void setAtaque_fisico(int ataque_fisico) {
        this.ataque_fisico = ataque_fisico;
    }

    public int getAtaque_distancia() {
        return this.ataque_distancia;
    }

    public void setAtaque_distancia(int ataque_distancia) {
        this.ataque_distancia = ataque_distancia;
    }

    @Override
    public String toString() {
        return " nome =" + getNome() +
                " saude =" + getSaude() +
                " forca =" + getForca() +
                " inteligencia =" + getInteligencia() +
                " velocidade =" + getVelocidade() +
                " ataque_fisico =" + getAtaque_fisico() +
                " ataque_distancia =" + getAtaque_distancia();
    }

}
