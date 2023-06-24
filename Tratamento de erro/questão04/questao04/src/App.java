import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
        
        System.out.println("Insira seu usuario: ");
        String usuario = scanner.nextLine();

        System.out.println("Insira sua senha: ");
        String senha = scanner.nextLine();
        
        verificarAcesso(usuario, senha);
        
    } 
    catch(AcessoNegadoException exception){
        System.out.println(""+ exception.getMessage());
    } 
    scanner.close();
}
    public static void verificarAcesso(String usuario, String senha) throws AcessoNegadoException{
        if(usuario.equals("adimin") && senha.equals("12345")){
            System.out.println("Acesso Liberado!,bemvindo usuário: "+ usuario);
        }else{
            throw new AcessoNegadoException();
        }
    }
}
