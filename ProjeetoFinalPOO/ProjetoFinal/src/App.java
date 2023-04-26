public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[2];

        v[0] = new Video("projeto final 01");
        v[1] = new Video("projeto final 02");

        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("João", 20,"M","senha123");
        a[1] = new Aluno("Maria", 25,"F","senha123567");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());

        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
    }
}
