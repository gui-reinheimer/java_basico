package estruturas.repeticao;

public class Fatorial {
    public static void main(String[] args) {
        int numero = 8;
        int c = 1;
        int n = numero;
        System.out.print(n + "! = ");
        while (numero >= 1) {
            System.out.print(numero);
            if (numero > 1) {
                System.out.print(" * ");
            }
            c *= numero;
            numero--;
        }
        System.out.print(" = " + c);
    }
}
