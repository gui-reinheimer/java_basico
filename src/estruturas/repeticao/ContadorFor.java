package estruturas.repeticao;

import java.util.Scanner;

public class ContadorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Digite -1 para encerrar");

            System.out.print("Inicio: ");
            int inicio = input.nextInt();
            if (inicio == -1) {
                System.out.println("Encerrando...");
                break;
            }

            System.out.print("Fim: ");
            int fim = input.nextInt();
            System.out.print("Passo: ");
            int passo = input.nextInt();

            if (passo == 0 || inicio>fim) {
                System.out.println("O passo tem que ser MAIOR que 0");
                System.out.println("E inicio não pode ser maior que o fim");
                continue;
            }
            for(int i = inicio; i <= fim; i+=passo){
                System.out.println(i);
            }

        }
    }
}
