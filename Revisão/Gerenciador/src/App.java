public class App {
    public static void main(String[] args) throws Exception {
        FuncionarioBase[] fun = new FuncionarioBase[3];

        fun[0] = new FuncionarioHorista("André",20,3000.4);
        fun[1] = new FuncionarioMensalista("Geovana", 18, 2500, 30);
        fun[2] = new FuncionarioMensalista("André Santos", 21, 10000, 30);

        double result = Empresa.calcularFolhaPagamento(fun);
        System.out.println("o resultado é: " + result);
    }
}
