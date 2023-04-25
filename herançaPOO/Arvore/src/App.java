public class App {
  public static void main(String[] args) throws Exception {
    // Visitante p1 = new Visitante();
    // p1.setNome("andré");
    // p1.setSexo("M");
    // p1.setIdade(25);
    // System.out.println(p1.toString());

    Aluno a1 = new Aluno();
    a1.setNome("André");
    a1.setSexo("M");
    a1.setIdade(25);
    a1.setCurso("cc");
    a1.setMatricula(541960);
    a1.PagarMensalidade();
    Bolsista b1 = new Bolsista();
    b1.PagarMensalidade();
  }
}
