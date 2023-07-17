public class Cliente {
    private String name;
    private String cpf;
    private String endereço;

    public Cliente(String name, String cpf, String endereço) {
        this.setName(name);
        this.setCpf(cpf);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

}
