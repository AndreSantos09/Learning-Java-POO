public class Arquerio extends Personagem {

    public Arquerio(String nome) {
        this.setNome(nome);
        this.setSaude(60);
        this.setForca(10);
        this.setInteligencia(80);
        this.setVelocidade(60);
        this.setAtaque_fisico(10);
        this.setAtaque_distancia(100);
    }

    @Override
    public void ataque_distancia() {
        System.out.println("Usando abilidade ataque_distancia");
    }

    @Override
    public void fuga() {
        System.out.println("Usando abilidade fuga");
    }

    @Override
    public String toString() {
        return

        "=============================================" + "\n" +
                "Atribudos do seu personagem arqueiro 🏹" + "\n" +
                "=============================================" + "\n" +
                "     " + "nome 🪪 = " + getNome() + "\n" +
                "    " + " saude ❤️ = " + getSaude() + "\n" +
                "    " + " forca 💪 = " + getForca() + "\n" +
                "    " + " inteligencia 🧠 = " + getInteligencia() + "\n"+
                "    " + " velocidade 🏃 = " + getVelocidade() + "\n" +
                "    " + " ataque_fisico 🗡️ = " + getAtaque_fisico() + "\n" +
                "    " + " ataque_distancia 🔫 = " + getAtaque_distancia() + "\n" +
                "=============================================" + "\n" +
                "      "+"Habilidades do seu arqueiro ✅" + "\n" +
                "=============================================" + "\n" + "    " + "Ataque_distancia 🔫 "  + "e"
                + "  fuga 🏃"+"\n"+"============================================="+"\n"+"\n";
    }

}
