package estruturas.repeticao;

public class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        int c = 8;
        int n = c;
        System.out.print(n + "! = ");
        while (c >= 1) {
            System.out.print(c);
            if (c > 1) {
                System.out.print(" * ");
            }
            fatorial *= c;
            c--;
        }
        System.out.print(" = " + fatorial);
    }
}
