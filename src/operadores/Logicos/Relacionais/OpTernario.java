package operadores.Logicos.Relacionais;

public class OpTernario {
    public static void main(String[] args) {
        int n1, n2, r, r2;
        n1 = 14;
        n2 = 8;
        r = (n1>n2)?n1:n2;
        r2 = (n1 > n2) ? n1 + n2 : n1 - n2;
        System.out.println(r);
        System.out.println(r2);
    }
}
