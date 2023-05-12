public class SistemaDePagamento {
    private double TAXA_DE_JUROS_PADRAO = 0.02;


    public double calcularJuros(double valor){
        return valor * TAXA_DE_JUROS_PADRAO;
    }


    public void setTaxaDeJurosPadrao(double novataxa){
        TAXA_DE_JUROS_PADRAO = novataxa;
    }

    public final double calcularValorTotal(double ValorTransacao){
        return ValorTransacao + calcularJuros(ValorTransacao);
    }


}
