public class MotoristaCaminhao extends Motorista{

    private double cargaTransportada;
    
    public MotoristaCaminhao(String name, double salarioBase,double cargaTransportada) {
        super(name, salarioBase);
        this.setCargaTransportada(cargaTransportada); 
    }

    @Override
    public void calcularSalarioLiquido() {
        if (this.getCargaTransportada() > 1000){
            this.setSalarioBase(this.getSalarioBase() * 0.25 );
            System.out.println("O salário Liquido é: "+ this.getSalarioBase());
        }
    }

    public double getCargaTransportada() {
        return cargaTransportada;
    }

    public void setCargaTransportada(double cargaTransportada) {
        this.cargaTransportada = cargaTransportada;
    }


    
    
}
