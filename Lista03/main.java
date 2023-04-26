package Lista03;
public class main {
    public static void main (String[] args) throws Exception {

    Agenda p1 = new Agenda(10);

    Contato contato1 = new Contato("João", "joao@email");
    Contato contato2 = new Contato("Maria", "maria@email");
    Contato contato3 = new Contato("marcelo", "marcelo@email");
    p1.adicionarContato(contato3);
    p1.adicionarContato(contato1);
    p1.adicionarContato(contato2);   
    
    p1.exibirContatos();

    }
}
