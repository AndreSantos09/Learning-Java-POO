import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 1 a 7 representando um dia da semana: ");
        int numeroDia = scanner.nextInt();

        // Verifica se o número fornecido pelo usuário está dentro do intervalo válido (de 1 a 7)
        if (numeroDia >= 1 && numeroDia <= 7) {
            // Acessa o elemento correspondente na enumeração DiasSemana
            DiasSemana diaSelecionado = DiasSemana.values()[numeroDia - 1];

            // Verifica se o dia selecionado é um dia útil (SEGUNDA a SEXTA) ou um dia não útil (SÁBADO e DOMINGO)
            if (diaSelecionado == DiasSemana.SABADO || diaSelecionado == DiasSemana.DOMINGO) {
                System.out.println("O dia selecionado (" + diaSelecionado + ") não é um dia útil.");
            } else {
                System.out.println("O dia selecionado (" + diaSelecionado + ") é um dia útil.");
            }
        } else {
            System.out.println("Número de dia inválido!");
        }

        scanner.close();
    }
}

