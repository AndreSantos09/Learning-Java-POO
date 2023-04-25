public final class Bolsista extends Aluno {
    private int bolsa;

    public void RenovarBolsa() {
        System.out.println("bolsa renovada");
    }

    public void PagarMensalidade() {
        System.out.println("Mensalidade paga - bolsista");
    }

    public int getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

}
