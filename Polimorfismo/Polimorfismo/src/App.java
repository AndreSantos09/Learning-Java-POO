public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(22.5);
        m.setCorPelo("marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();


    }
}
