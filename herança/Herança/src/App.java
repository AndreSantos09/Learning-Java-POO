public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();   
        Funcionario p4 = new Funcionario();

        p1.setNome("ANDRE");    
        p2.setNome("geovana");
        p3.setNome("joao");
        p4.setNome("maria");    

        p2.setCurso("informatica");
        p3.setSalario(1800);
        p4.setSetor("estoque");

        p3.recebertAumento(330.20);
        p4.mudarTrabalho();
        p2.cancelarMatricula();

        p1.setSexo("M");        
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p1.setIdade(20);    
        p2.setIdade(19);
        p3.setIdade(20);
        p4.setIdade(19);
        

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());  

    }
}
