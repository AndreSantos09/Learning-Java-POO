public class App {
    public static void main(String[] args) throws Exception {
        Livro l1 = new Livro("Narnia",120,"Forcu's");

        l1.calcularPreco();
        l1.imprimirDetalhes();

        DVD d1 = new DVD("Show dance",20,"sony");

        d1.calcularPreco();
        d1.imprimirDetalhes();
    }
}
