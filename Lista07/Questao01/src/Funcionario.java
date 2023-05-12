public abstract class Funcionario {
    private String nome;
    private String idade;
    private double salario;

    public Funcionario(String nome, String idade) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario( 2200);
    }


    public abstract void calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
    }


}
