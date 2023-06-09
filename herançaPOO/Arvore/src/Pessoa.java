public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerNiver() {
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", idade='" + getIdade() + "'" +
                ", sexo='" + getSexo() + "'" +
                "}";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
