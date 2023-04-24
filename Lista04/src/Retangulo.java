public class Retangulo {
    private double base;
    private double altura;

    // constructor
    public Retangulo() {
        this.setAltura(0);
        this.setBase(0);
    }

    // methods
    public void exibirRetangulo() {
        System.out.println("Retangulo: ");
        System.out.println("Base: " + this.getBase());
        System.out.println("Altura: " + this.getAltura());
    }

    // getter and setter
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
