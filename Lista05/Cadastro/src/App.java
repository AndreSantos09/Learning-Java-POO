import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean sair = false;
        int escolha = 0;

        System.out.println("Digite quantos alunos voce deseja cadastrar : ");
        int tam = scan.nextInt();
        CadastroColegio[] cadastro = new CadastroColegio[tam];

        do {
            System.out.println("\tManu operações***\n");
            System.out.println("[1] - cadastrar alunos\n[2] - mostrar alunos\n[3] - sair\n");
            System.out.println("Digite sua escolha : ");
            escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("***Cadastrar alunos***");

                for (int i = 0; i < tam; i++) {
                    System.out.println("\n====================================================================\n");
                    CadastroColegio vetorCadastro = new CadastroColegio();
                    System.out.printf("Digite o nome do %dº aluno : ", i + 1);
                    String nome = scan.nextLine();
                    vetorCadastro.setNome_aluno(nome);
                    scan.nextLine();
                    System.out.printf("Digite a matricula do %dº aluno : ", i + 1);
                    String matricula = scan.next();
                    vetorCadastro.setCpf_aluno(matricula);
                    scan.nextLine();
                    System.out.printf("Digite a data de nascimento do %dº aluno : ", i + 1);
                    String dataNascimento = scan.next();
                    vetorCadastro.setData_nascimento_aluno(dataNascimento);
                    scan.nextLine();
                    System.out.printf("Digite o CPF do %dº aluno : ", i + 1);
                    String cpf = scan.next();
                    vetorCadastro.setCpf_aluno(cpf);
                    scan.nextLine();
                    int idade = vetorCadastro.idade_aluno(dataNascimento);
                    vetorCadastro.setIdade_alluno(idade);
                    scan.nextLine();
                    cadastro[i] = vetorCadastro;
                    System.out.println("\n====================================================================\n");

                }
            } else if (escolha == 2) {

                System.out.println("\t***Alunos Cadastrados***\n");
                for (int i = 0; i < tam; i++) {
                    System.out.println("\n====================================================================\n");
                    System.out.printf("Nome do %dº aluno : %s", i + 1, cadastro[i].getNome_aluno());
                    System.out.printf("\nMatricula do %dº aluno : %s", i + 1, cadastro[i].getCpf_aluno());
                    System.out.printf("\nData de nascimento do %dº aluno : %s", i + 1,
                            cadastro[i].getData_nascimento_aluno());
                    System.out.printf("\nCpf do %dº aluno : %s", i + 1, cadastro[i].getCpf_aluno());
                    System.out.printf("\nIdade do %dº aluno : %d", i + 1, cadastro[i].getIdade_alluno());
                    System.out.println("\n====================================================================\n");

                }

            } else if (escolha == 3) {
                System.out.println("***Buscar contato***");
                System.out.println("Digite o nome do aluno que deseja apresentar os dados : ");
                String nome = scan.nextLine();
                scan.nextLine();

            }

        } while (sair != true);

        p[0].toString();
        p[1].toString();
        p[2].toString();
        

        System.out.println();

    }

}
