package estruturas.codicionais;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Digite o numero de pernas: ");
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }

        System.out.println("Isso é um(a): " + tipo);
    }
}
