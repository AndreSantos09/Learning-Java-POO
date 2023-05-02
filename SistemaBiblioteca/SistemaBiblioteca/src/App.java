public class App {
    public static void main(String[] args) throws Exception {
        Livro l1 = new Livro("André","DAWN","Saraiva","thriller",2023);
        Livro l2 = new Livro("Geovana","As Aventuras do Mozin","Morderna","Romance",2023);
        l1.adicionarLivros();
        
        l2.adicionarLivros();
        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
}
