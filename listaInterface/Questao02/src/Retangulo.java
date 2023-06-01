public class Retangulo implements FormaGeometrica{
    private double largura;
    private double altura;

    

    public Retangulo(double largura, double altura) {
        this.setLargura(largura);
        this.setAltura(altura);
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
}
