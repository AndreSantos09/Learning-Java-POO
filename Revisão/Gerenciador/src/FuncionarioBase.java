public abstract class FuncionarioBase implements Funcionario{

    private String nome;
    private int Idade;
    private double salarioBase;


    public FuncionarioBase(String nome, int idade, double salarioBase) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalarioBase(salarioBase);
    }


    @Override
    public double calcularSalario() {
        
        return 0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
}
