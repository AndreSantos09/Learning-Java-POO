public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    //methods 
    public void cancelarMatricula() {
        System.out.println("Matrucula será cancelada");
    }

    //methods getter/setter

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
