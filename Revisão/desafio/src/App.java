public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente("André","072.434.223-06","Crateús-CE" );

        ContaPoupanca CP1 = new ContaPoupanca(cliente1, 0);
        CP1.depositar(100);
        CP1.sacar(100);
    }
}
