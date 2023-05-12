public abstract class Produto {
    private String Titulo;
    private double preço;

    
    public Produto(String titulo, double preço) {
        this.setTitulo(titulo);
        this.setPreço(preço);
    }

    public abstract void calcularPreco();

    public void imprimirDetalhes(){
        
    }


    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }

}
