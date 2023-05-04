public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        this.setNome(nome);
        this.setSaude(120);
        this.setForca(90);
        this.setInteligencia(30);
        this.setVelocidade(30);
        this.setAtaque_fisico(100);
        this.setAtaque_distancia(10);
    }

    @Override
    public String toString() {
        return

        "=============================================" + "\n" +
                "Atribudos do seu personagem guerreiro ⚔️" + "\n" +
                "=============================================" + "\n" +
                "     " + "nome 🪪 = " + getNome() + "\n" +
                "    " + " saude ❤️ = " + getSaude() + "\n" +
                "    " + " forca 💪 = " + getForca() + "\n" +
                "    " + " inteligencia 🧠 = " + getInteligencia() + "\n" +
                "    " + " velocidade 🏃 = " + getVelocidade() + "\n" +
                "    " + " ataque_fisico 🗡️ = " + getAtaque_fisico() + "\n" +
                "    " + " ataque_distancia 🔫 = " + getAtaque_distancia() + "\n" +
                "=============================================" + "\n" +
                "      "+"Habilidades do seu guerreiro ✅" + "\n" +
                "=============================================" + "\n" + "    " + "corpo_a_corpo 🗡️"+"\n"+"============================================="+"\n"+"\n";
    }


}
