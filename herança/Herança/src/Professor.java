public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    //method
    public void recebertAumento(double aum){
        this.setSalario(this.getSalario()+ aum);
    }


    // methods getter and setter

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
