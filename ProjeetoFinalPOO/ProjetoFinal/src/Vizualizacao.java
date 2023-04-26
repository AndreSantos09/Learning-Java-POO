public class Vizualizacao {
    private Aluno espectador;
    private Video filme;



    
    public Vizualizacao(Aluno espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
    }



    public Aluno getEspectador() {
        return espectador;
    }
    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }


   

}
