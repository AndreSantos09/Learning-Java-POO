public class App {
    public static void main(String[] args) throws Exception {
            Pix pix = new Pix(10000);
            try{
            pix.Transferencia(11000);
            }catch(Transacaoexception e){
                System.out.println(e.getMessage());
            }
    }
}
