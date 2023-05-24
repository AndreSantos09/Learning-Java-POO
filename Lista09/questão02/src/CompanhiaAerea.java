public class CompanhiaAerea {
    public static void main(String[] args) throws Exception {

        Aviao a1 = new Aviao();
        Aviao.adicionarAviao(10);

        Aviao a2 = new Aviao();
        Aviao.adicionarAviao(13);

        Aviao a3 = new Aviao();
        Aviao.adicionarAviao(55);

        Aviao.calcularMediaPassageiros();

        System.out.println("Quantidade total de aviões: " + Aviao.getQuantidadeAvioes());
        

    }
}
