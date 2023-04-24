public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
// constructor

    public Carro(String marca, String modelo, int ano, String cor) {
    this.setAno(ano);
    this.setMarca(marca); 
    this.setModelo(modelo);
    this.setCor(cor);
    } 
    public Carro(String marca, String modelo) {
    this.setAno(0);
    this.setMarca(marca); 
    this.setModelo(modelo);
    this.setCor("Preto");
    } 
    
//methods

public void exibirCarro(){
    System.out.println("================================================");
    System.out.println("Marca: " + this.getMarca());
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ano: " + this.getAno());
    System.out.println("Cor: " + this.getCor());
    System.out.println("================================================"); 
}


// getter and setter    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
