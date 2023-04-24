public class Cliente {
    private String nomeCompleto;

    // setter method
    // O método público setNomeCompleto é responsável por definir o valor do
    // atributo nomeCompleto. Antes de atribuir o valor, ele verifica se o nome
    // completo possui mais de 80 caracteres (sem espaços) utilizando o método
    // replaceAll para remover todos os espaços e a propriedade length para contar o
    // número de caracteres.
    public void setNomeCompleto(String nomeCompleto) {
        if (nomeCompleto.replaceAll(" ", "").length() > 80) {
            System.out.println("O nome deve ter no máximo 80 caracteres");
        }
        this.nomeCompleto = nomeCompleto;
    }

    public void mostrarNomeCompleto() {
        System.out.println(this.getNomeCompleto());

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
