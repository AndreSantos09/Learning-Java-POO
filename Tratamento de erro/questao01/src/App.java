public class App {
    public static void main(String[] args) throws Exception {
        
        Banco conta = new Banco(1000);
        
        try{
            conta.sacar(500); // Tentativa de saque bem-sucedida
            conta.sacar(700); // Tentativa de saque com saldo insuficiente
            conta.sacar(200); // Tentativa de saque com erro na transação
        }
        catch(SaldoInsuficienteException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
        catch(TransacaoException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
    }
}
