public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    // constructors

    public Relogio(int hora, int minuto, int segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public Relogio(int hora, int minuto) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(01);
    }

    public Relogio(int hora) {
        this.setHora(hora);
        this.setMinuto(01);
        this.setSegundo(01);
    }

    // methods
    public void exibirRelogio() {
        System.out.print("[");
        System.out.print(this.getHora());
        System.out.print(":");
        System.out.print(this.getMinuto());
        System.out.print(":");   
        System.out.print(this.getSegundo());
        System.out.println("]");    
    }

    // getter and setter

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
