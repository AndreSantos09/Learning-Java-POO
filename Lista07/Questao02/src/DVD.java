public class DVD extends Produto {
    private float precoBase;
    private String marca;

    public DVD(String titulo, double preço, String marca) {
        super(titulo, preço);
        this.setPrecoBase(20);
        this.setMarca(marca);
    }

    @Override
    public void calcularPreco() {
        this.setPreço(this.getPrecoBase());
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Preço: " + this.getPreço());
        System.out.println("Titulo: " + this.getTitulo());
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
