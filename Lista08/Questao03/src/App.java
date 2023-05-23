import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            ElevadorComercial elevaComercial = new ElevadorComercial(0, 30, 5);
            
            System.out.println("\t***Elevador comercial***\n");
            System.out.println("[1] - inicializa\n[2] - entra\n[3] - sai\n[4] - sobe\n[5] - desce\nEscolha uma das opcoes : ");
            int escolha = scan.nextInt();

            if (escolha == 1) {
                elevaComercial.inicializa(0, 0);
            }
            else if (escolha == 2) {
                System.out.println("Digite quantas pessoas deseja entrar : ");
                int pessoasEntrar = scan.nextInt();
                elevaComercial.entra(pessoasEntrar);
            }
            else if (escolha == 3) {
                System.out.println("Digite quantas pessoas desejam sair : ");
                int sairPessoa = scan.nextInt();
                elevaComercial.sai(sairPessoa);
            }
            else if (escolha == 4) {
                System.out.println("Digite para qual andar deseja subir : ");
                int sobe = scan.nextInt();
                elevaComercial.sobe(sobe, elevaComercial.getAndarAtual());
                
            }
            else if (escolha == 5) {
                System.out.println("Digite o andar que deseja subir");
                int desce = scan.nextInt();
                elevaComercial.desce(desce);
                
            }
        }

        
    }
}
