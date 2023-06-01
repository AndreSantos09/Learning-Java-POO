public class Circulo implements FormaGeometrica{
    private double raio;
    private final double PI = 3.14159;


    public Circulo(double raio) {
        this.setRaio(raio);
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPI() {
        return PI;
    }

    
    
}
