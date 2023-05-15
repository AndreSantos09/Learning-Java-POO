

public class Livro {
    //atributos
    private int quantidade=0;
    private String autor;
    private String titulo;
    private String editora;
    private String genero;
    private int ano;
    private boolean disponivel;

     // construtor
    public Livro(String autor, String titulo, String editora, String genero, int ano) {
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.genero = genero;
        this.ano = ano;
    }

    // methods

    public void adicionarLivros() {
        this.setQuantidade(this.getQuantidade()+1);
        System.out.println("Seu livro foi adicionado ao sitema!");
        this.setDisponivel(true);
    }

    public void removerLivros() {
        this.setQuantidade(this.getQuantidade()-1);
        System.out.println("Seu livro foi removido do sitema!");
    }

    public void pesquisarLivros(String titulo, String autor, String genero) {
        
        for (int i = 0; i <getQuantidade();i++) {
            if ((titulo == null || this.getTitulo().equalsIgnoreCase(titulo)) && (autor == null || this.getAutor().equalsIgnoreCase(autor)) && (genero == null || this.getGenero().equalsIgnoreCase(genero))) {
                System.out.println("Livro encontrado!"+ toString());
            }
        }
    }

    // getter/setter
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public boolean getDisponivel() {
        return this.disponivel;
    }



    @Override
    public String toString() {
        return  
            "==========================" + "\n" +
            " - quantidade=" +" " + getQuantidade() + "\n" +
            " - autor ="+" " + getAutor() + "\n" +
            " - titulo ="+" " + getTitulo() + "\n" +
            " - editora =" +" "+ getEditora() + "\n" +
            " - genero ="+" " + getGenero() + "\n" +
            " - ano ="+" " + getAno() + "\n" +
            " - disponivel = " + getDisponivel() +"\n" +
            "==========================";
            
    }


}
