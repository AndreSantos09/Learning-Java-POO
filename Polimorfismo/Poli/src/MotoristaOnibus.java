public class MotoristaOnibus extends Motorista {

    public MotoristaOnibus(String name, double salarioBase) {
        super(name, salarioBase);
    }

    @Override
    public void calcularSalarioLiquido() {
        System.out.println("Salario Liquido é: " + this.getSalarioBase());
    }

}
