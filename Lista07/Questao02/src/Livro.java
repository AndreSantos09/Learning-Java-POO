public class Livro extends Produto {
    private String autor;
    private float precoBase;

    public Livro(String titulo, double preço,String autor) {
        super(titulo, preço);
        this.setAutor(autor);
        this.setPrecoBase(80);
    }

    @Override
    public void calcularPreco() {
        this.setPreço(this.getPrecoBase());
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Preço: " + this.getPreço());
        System.out.println("Titulo: " + this.getTitulo());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }
    

    
}

