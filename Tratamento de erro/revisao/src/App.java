import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) 
    throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("insira um número inteiro: ");
            int num = scanner.nextInt();
        }

        catch(ArithmeticException exception){
            System.out.println("número inválido");
        }

        catch(InputMismatchException exception){
                    System.out.println("número inválido!, pfvr insira apenas numeros inteiros...");
                }

        catch(Exception exception){
            System.out.println("número inválido!, pfvr insira apenas numeros inteiros...");
        }
        
        scanner.close();
    }
}
