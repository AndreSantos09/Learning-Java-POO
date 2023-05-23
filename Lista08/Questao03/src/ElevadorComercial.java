public class ElevadorComercial extends Elevador{

    public ElevadorComercial(int andarAtual, int totalAndares, int capacidadeElevador) {
        super(andarAtual, totalAndares, capacidadeElevador);
    }

    public void desce(int descer) {
        if (this.andarAtual == 0 ) {
            System.out.println("Elevador no terreo, nao da pra descer");
        }
        else if ((descer - this.andarAtual) >= 0) {
            System.out.println("Descendo");
            
        }
        
    }

    public void entra(int pessoas_entrar) {
        System.out.println("***Entrando pessoas***\n");
        if (pessoas_entrar <= this.capacidadeElevador) {
            System.out.println("Entre");
            
        }
        else{

            System.out.println("Nao há espaço suficiente");
        }
    
    }

  
    public void inicializa(int capacidade_elevador, int total_andares) {
        System.out.println("***Iniciando elevador***\n");
        if (capacidade_elevador == 0 && total_andares == 0) {
            System.out.println("Inicializado");
        }
        else{
            System.out.println("Elevador nao pode ser inicializado");
        }
    }

   
    public void sai(int saiPessoa) {
        System.out.println("***Sair pessoa***");
        if (saiPessoa > 0 && saiPessoa <= this.capacidadeElevador) {
            System.out.println("Elevador abrindo para saida");
            
        }
        else{
            System.out.printf("\nNao há possibilidade de tirar %d pessoa(s)", saiPessoa);
        }
     
    }

    public void sobe(int subir, int andarAtual) {
        System.out.println("***Subir***");
        if (andarAtual <= 30) {
            if (subir + andarAtual <= 30) {
                System.out.println("Subindo");
                
            }
            
        }
            
        }
      
    }

    



    


    

