
public class Book {
    private static int totalLivros;
    private static int livrosEmprestados;


    public Book() {
        Book.setLivrosEmprestados(0);
        Book.setTotalLivros(0);
    }


    public void adicionarLivros(int livrosadicionados) {
        Book.setTotalLivros(Book.getTotalLivros() + livrosadicionados);
    }

    public static int emprestarLivros(int bookemprestados) {
        if (bookemprestados > Book.getTotalLivros()){
            System.out.println("Erro, livros insuficientes!");
        }
        else{
            Book.setLivrosEmprestados(Book.getLivrosEmprestados() + bookemprestados);
            Book.setTotalLivros(Book.getTotalLivros() - Book.getLivrosEmprestados());
            System.out.println("livros emprestados com sucesso!");
        }
        
        return 0;
    }

    public static int devolverLivros(int bookdevolvidos) {
        if (bookdevolvidos > Book.getLivrosEmprestados()){
            System.out.println("Erro, Você está devolvendo livros que não são da Biblioteca!");
        }
        else{
            Book.setLivrosEmprestados(Book.getLivrosEmprestados() - bookdevolvidos);
            Book.setTotalLivros(Book.getTotalLivros() + Book.getLivrosEmprestados());
            System.out.println("livros devolvidos com sucesso!");
        }
        return 0 ;
    }

    public void exibirTotal(){
        System.out.println("Total de Livros: " + Book.getTotalLivros());
        System.out.println("Total de Livros emprestados: " + Book.getLivrosEmprestados());
    }


    public static int getTotalLivros() {
        return totalLivros;
    }

    public static void setTotalLivros(int totalLivros) {
        Book.totalLivros = totalLivros;
    }

    public static int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public static void setLivrosEmprestados(int livrosEmprestados) {
        Book.livrosEmprestados = livrosEmprestados;
    }



    




}
