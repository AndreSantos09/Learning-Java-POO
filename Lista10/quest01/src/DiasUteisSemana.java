import java.util.Scanner;

public class DiasUteisSemana {
    enum DiasSemana {
        DOMINGO,  SEGUNDA,TERCA, QUARTA, QUINTA, SEXTA, SABADO
    }

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7 para representar um dia da semana: ");
        int numeroDia = scanner.nextInt();

        if (numeroDia >= 1 && numeroDia <= 7) {
            DiasSemana diaSelecionado = DiasSemana.values()[numeroDia - 1];
            if (diaSelecionado == DiasSemana.SABADO || diaSelecionado == DiasSemana.DOMINGO) {
                System.out.println(diaSelecionado + " é um dia não útil.");
            } else {
                System.out.println(diaSelecionado + " é um dia útil.");
            }
        } else {
            System.out.println("Número de dia inválido!");
        }
        scanner.close();
    }
}

