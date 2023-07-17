public class Empresa {
    public static double calcularFolhaPagamento(Funcionario[] funcionarios) {
        double total = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }
    
}
