public class App {
    public static void main(String[] args) throws Exception {
        Conta a1 = new Conta("Allyn Careca","466.070.934-69",1234);
        a1.depositar(500);
        
        a1.modDinheiroInfinit();
        System.out.println(a1.toString());
    }
}
