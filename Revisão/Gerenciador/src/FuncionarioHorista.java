public class FuncionarioHorista extends FuncionarioBase {

    private int horasTrabalhadas;
    private double valorHoras;

    public FuncionarioHorista(String nome, int idade, double salarioBase) {
        super(nome, idade, salarioBase);
    }

    @Override
    public double calcularSalario() {
        
        return this.getValorHoras() * this.getHorasTrabalhadas();
    }



    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;}

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }



}
