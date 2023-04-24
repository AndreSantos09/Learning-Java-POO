public class RelogioMain {
    public static void main(String[] args) throws Exception {
        Relogio relogio = new Relogio(13, 06, 25);
        Relogio relogio2 = new Relogio(13, 06);
        Relogio relogio3 = new Relogio(13);

        relogio.exibirRelogio();
        relogio2.exibirRelogio();
        relogio3.exibirRelogio();

    }
}
