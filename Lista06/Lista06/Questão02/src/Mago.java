public class Mago extends Personagem {

    public Mago(String nome) {
        this.setNome(nome);
        this.setSaude(90);
        this.setForca(30);
        this.setInteligencia(100);
        this.setVelocidade(40);
        this.setAtaque_fisico(10);
        this.setAtaque_distancia(80);
    }

    @Override
    public String toString() {
        return

        "=============================================" + "\n" +
                "Atribudos do seu personagem mago 🏹" + "\n" +
                "=============================================" + "\n" +
                "     " + "nome 🪪 = " + getNome() + "\n" +
                "    " + " saude ❤️ = " + getSaude() + "\n" +
                "    " + " forca 💪 = " + getForca() + "\n" +
                "    " + " inteligencia 🧠 = " + getInteligencia() + "\n" +
                "    " + " velocidade 🏃 = " + getVelocidade() + "\n" +
                "    " + " ataque_fisico 🗡️ = " + getAtaque_fisico() + "\n" +
                "    " + " ataque_distancia 🔫 = " + getAtaque_distancia() + "\n" +
                "=============================================" + "\n" +
                "      "+"Habilidades do seu mago ✅" + "\n" +
                "=============================================" + "\n" + "    " + "Ataque_distancia 🔫 " + "e"
                + "  cura ❤️"+"\n"+"============================================="+"\n"+"\n";
    }
}
