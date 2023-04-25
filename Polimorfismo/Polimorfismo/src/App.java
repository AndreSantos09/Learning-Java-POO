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

        r.setPeso(30);
        r.setCorEscama("vermelho");
        r.alimentar();
        r.locomover();
        r.emitirSom();

        p.setPeso(20);
        p.setCorEscama("preto");
        p.alimentar();
        p.locomover();
        p.emitirSom();

        a.setPeso(15);
        a.setCorPena("branco");
        a.alimentar();
        a.locomover();
        a.emitirSom();


    }
}
