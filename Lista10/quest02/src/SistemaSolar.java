import java.util.Scanner;

public class SistemaSolar {
    
    enum Planetas {
        MERCURIO("Mercúrio", 0.38),
        VENUS("Vênus", 0.91),
        TERRA("Terra", 1.00),
        MARTE("Marte", 0.38),
        JUPITER("Júpiter", 2.53),
        SATURNO("Saturno", 1.07),
        URANO("Urano", 0.92),
        NETUNO("Netuno", 1.19);
        
        private String nome;
        private double gravidade;
        
        Planetas(String nome, double gravidade) {
            this.nome = nome;
            this.gravidade = gravidade;
        }
        
        public String getNome() {
            return nome;
        }
        
        public double getGravidade() {
            return gravidade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 8 para selecionar um planeta:");
        int numeroPlaneta = scanner.nextInt();
        
        if (numeroPlaneta >= 1 && numeroPlaneta <= 8) {
            Planetas planeta = Planetas.values()[numeroPlaneta - 1];
            System.out.println("Planeta selecionado: " + planeta.getNome());
            System.out.println("Gravidade: " + planeta.getGravidade());
        } else {
            System.out.println("Número de planeta inválido!");
        }
        scanner.close();
    }
}

