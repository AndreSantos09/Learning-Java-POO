public class Contas {
    public static void main(String[] args) throws Exception {

        ContaPoupanca conta = new ContaPoupanca("André",123456);
        conta.depositar(1000);
        conta.sacar(30);
        conta.calcularNovoSaldo(3);
        ContaEspecial conta2 = new ContaEspecial("João",123456);

        conta2.depositar(1000);
        conta2.sacar(2000);

        System.out.println(conta.toString());

        System.out.println(conta2.toString());

    }
}
