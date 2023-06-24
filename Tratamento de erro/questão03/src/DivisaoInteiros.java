import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número inteiro: ");
                int numero2 = scanner.nextInt();

                int resultado = divideNumeros(numero1, numero2);
                System.out.println("O resultado da divisão é: " + resultado);

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de digitar apenas números inteiros.");
                scanner.nextLine(); // Limpa o buffer do scanner
            } catch (ArithmeticException e) {
                System.out.println("Erro: divisão por zero não é permitida!");
            } catch (Throwable e){
                System.out.println("Erro: parece que algo deu errado!");
            }
            scanner.close();
        }
    public static int divideNumeros(int numero1, int numero2) {
        return  numero1 / numero2;
    }
}


