public class Aluno extends Pessoa{

    private String login;
    private int totAssistindo;



    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistindo(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }


    @Override
    public String toString() {
        return "{" +super.toString()+
            " login='" + getLogin() + "'" +
            ", totAssistindo='" + getTotAssistindo() + "'" +
            "}";
    }
    
    
}
