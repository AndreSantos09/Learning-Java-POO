public class Aviao {
    public static int quantidadeAvioes;
    public static int somaPassageiros;




    public static void adicionarAviao(int quantpassageiros){
        Aviao.setQuantidadeAvioes(getQuantidadeAvioes() + 1);
        Aviao.setSomaPassageiros(Aviao.somaPassageiros += quantpassageiros);        
        System.out.println("Aviao adiconado com sucesso!");
        System.out.println("quantidade de avioes: " + Aviao.getQuantidadeAvioes());
    }

    public static int calcularMediaPassageiros(){
        if (Aviao.getQuantidadeAvioes() != 0){
            System.out.println("A média de passageiros é: " +(double) + Aviao.getSomaPassageiros() / Aviao.getQuantidadeAvioes());
            return 1;
        } else {
            return 0;
        }
    }


    public static int getQuantidadeAvioes() {
        return quantidadeAvioes;
    }
    public static void setQuantidadeAvioes(int quantidadeAvioes) {
        Aviao.quantidadeAvioes = quantidadeAvioes;
    }
    public static int getSomaPassageiros() {
        return somaPassageiros;
    }
    public static void setSomaPassageiros(int somaPassageiros) {
        Aviao.somaPassageiros = somaPassageiros;
    }

    
}
