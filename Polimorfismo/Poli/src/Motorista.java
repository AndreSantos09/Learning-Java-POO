public abstract class Motorista {
    private String name;
    private double salarioBase;

    public Motorista(String name, double salarioBase) {
        this.setName(name);
        this.setSalarioBase(salarioBase);
    }

    public abstract void calcularSalarioLiquido();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
