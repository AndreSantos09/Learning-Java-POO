import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CadastroColegio {

    private String nome_aluno;
    private String matricula_aluno;
    private String data_nascimento_aluno;
    private String cpf_aluno;
    private int idade_alluno;

    public CadastroColegio() {

    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getMatricula_aluno() {
        return matricula_aluno;
    }

    public void setMatricula_aluno(String matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }

    public String getData_nascimento_aluno() {
        return data_nascimento_aluno;
    }

    public void setData_nascimento_aluno(String data_nascimento_aluno) {
        this.data_nascimento_aluno = data_nascimento_aluno;
    }

    public String getCpf_aluno() {
        return cpf_aluno;
    }

    public void setCpf_aluno(String cpf_aluno) {
        this.cpf_aluno = cpf_aluno;
    }

    public int getIdade_alluno() {
        return idade_alluno;
    }

    public void setIdade_alluno(int idade_alluno) {
        this.idade_alluno = idade_alluno;
    }

    public int idade_aluno(String dataNasc) {

        LocalDate nascimento = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(nascimento, hoje);
        int id = periodo.getYears();

        return id;
    }


    @Override
    public String toString() {
        return "{" +
            " nome_aluno='" + getNome_aluno() + "'" +
            ", matricula_aluno='" + getMatricula_aluno() + "'" +
            ", data_nascimento_aluno='" + getData_nascimento_aluno() + "'" +
            ", cpf_aluno='" + getCpf_aluno() + "'" +
            ", idade_alluno='" + getIdade_alluno() + "'" +
            "}";
    }



}
