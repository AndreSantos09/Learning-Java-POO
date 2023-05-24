public class Biblioteca {
    public static void main(String[] args) throws Exception {

        Book l1 = new Book();

        l1.adicionarLivros(11);
        l1.exibirTotal();
        Book.emprestarLivros(4);
        l1.exibirTotal();
        Book.emprestarLivros(8);
        Book.devolverLivros(7);
        l1.exibirTotal();
    }
}
