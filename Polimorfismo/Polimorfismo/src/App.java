public class App {
    public static void main(String[] args) throws Exception {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        PeixeDourado pd = new PeixeDourado();
        Arara ar = new Arara();

        m.alimentar();
        r.emitirSom();
        p.locomover();
        a.emitirSom();

        c.locomover();
        ca.emitirSom();
        co.emitirSom();
        t.locomover();
        pd.emitirSom();
        ar.emitirSom();
    }
}
