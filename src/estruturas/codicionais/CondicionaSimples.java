package estruturas.codicionais;

import java.util.Scanner;

public class CondicionaSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1° nota: ");
        float n1 = teclado.nextInt();
        System.out.println("2° nota: ");
        float n2 = teclado.nextInt();
        float m = (n1 + n2) / 2;
        System.out.println(m);
        if (m >= 7) {
            System.out.println("Aprovado");
        }
    }
}
