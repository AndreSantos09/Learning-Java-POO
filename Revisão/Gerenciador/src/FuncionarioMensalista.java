public class FuncionarioMensalista extends FuncionarioBase{

    private int diasTrabalhados;

    public FuncionarioMensalista(String nome, int idade, double salarioBase, int diasTrabalhados) {
        super(nome, idade, salarioBase);
        this.setDiasTrabalhados(diasTrabalhados);
    }

    @Override
    public double calcularSalario() {
        
        return this.getSalarioBase() / this.getDiasTrabalhados();
    }



    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

}
