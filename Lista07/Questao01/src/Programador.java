public final class Programador extends Funcionario {
    private double bonus;

    public Programador(String nome, String idade) {
        super(nome, idade);
        this.setBonus(bonus);
    }

    @Override
    public void calcularSalario() {
        this.setSalario(getSalario() * 0.1 + getBonus());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
