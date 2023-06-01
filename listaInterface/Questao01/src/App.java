public class App {
    public static void main(String[] args) throws Exception {
        Livro[] l1 = new Livro[3]; 
        l1[0] = new Romance();
        l1[1] = new Biografia();
        l1[2] = new LivroInfantil();

        for(Livro livro : l1){
            livro.exibirDetalhes();
        }

    }
}
