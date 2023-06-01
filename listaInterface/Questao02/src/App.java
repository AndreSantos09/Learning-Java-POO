public class App {
    public static void main(String[] args) throws Exception {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = new Retangulo(6, 4);
        formas[1] = new Circulo(2);
        formas[2] = new Triangulo(2,6,5);

        for(FormaGeometrica forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perimetros: " + forma.calcularPerimetro());
            System.out.println();
        };

    }
}
