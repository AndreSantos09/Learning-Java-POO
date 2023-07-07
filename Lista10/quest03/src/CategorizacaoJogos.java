import java.util.Scanner;

public class CategorizacaoJogos {
    
    enum Jogos {
        AVENTURA("Aventura", 1, "PC, Xbox, PlayStation"),
        ESTRATEGIA("Estratégia", 2, "PC"),
        RPG("RPG", 4, "PC, Xbox, PlayStation, Nintendo Switch"),
        CORRIDA("Corrida", 2, "PC, Xbox, PlayStation"),
        FPS("FPS", 16, "PC, Xbox, PlayStation");
        
        private String nome;
        private int maxJogadores;
        private String plataformas;
        
        Jogos(String nome, int maxJogadores, String plataformas) {
            this.nome = nome;
            this.maxJogadores = maxJogadores;
            this.plataformas = plataformas;
        }
        
        public String getNome() {
            return nome;
        }
        
        public int getMaxJogadores() {
            return maxJogadores;
        }
        
        public String getPlataformas() {
            return plataformas;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Categorias de jogos disponíveis:");
        for (Jogos jogo : Jogos.values()) {
            System.out.println(jogo.getNome());
        }
        
        System.out.println("Digite o nome de uma categoria de jogo:");
        String nomeCategoria = scanner.nextLine().toUpperCase();
        
        try {
            Jogos categoriaJogo = Jogos.valueOf(nomeCategoria);
            System.out.println("Categoria selecionada: " + categoriaJogo.getNome());
            System.out.println("Número máximo de jogadores: " + categoriaJogo.getMaxJogadores());
            System.out.println("Plataformas suportadas: " + categoriaJogo.getPlataformas());
        } catch (IllegalArgumentException e) {
            System.out.println("Categoria de jogo inválida!");
        }
        
        scanner.close();
    }
}
