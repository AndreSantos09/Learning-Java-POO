package Lista03;

public class Agenda {
    private Contato[] contatos;
    private int tamanho = 0;

    public Agenda(int capacidade) {
        this.contatos = new Contato[capacidade];
        this.setTamanho(0);
    }

    public void adicionarContato(Contato contato) {
        if (this.tamanho < this.contatos.length) {
            this.contatos[this.tamanho] = contato;
            this.tamanho++;
        } else {
            System.out.println("Agenda cheia!");
        }
    }

    public Contato buscarContato(String nome) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.contatos[i].getNome().equals(nome)) {
                System.out.println("achei o contato :" + this.contatos);
                return this.contatos[i];
            }
            System.out.println("Contato não encontrado!");
        }

        return null;
    }

    public void excluirContato(String nome) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.contatos[i].getNome().equals(nome)) {
                for (int j = i; j < this.tamanho - 1; j++) {
                    this.contatos[j] = this.contatos[j + 1];
                }
                this.tamanho--;
                break;
            }
        }
    }

    public void exibirContatos() {
        System.out.println("Contatos na agenda:");
        for (int i = 0; i < this.tamanho; i++) {
            Contato contato = this.contatos[i];
            System.out.println(contato.getNome() + " - " + contato.getEmail());
        }
    }

    public Contato[] getContatos() {
        return this.contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
