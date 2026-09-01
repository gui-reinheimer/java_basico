package estruturas.codicionais;

import java.time.LocalDate;
import java.util.Scanner;

public class CondicionalComposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - nasc;
        System.out.printf("Sua idade é %d anos.\n", idade);
        if (idade >=18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
