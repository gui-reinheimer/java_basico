package estruturas.codicionais;

import java.time.LocalDate;
import java.util.Scanner;

public class CondicionalCompostaEncadeada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - nasc;
        System.out.printf("Sua idade é %d anos.\n", idade);

        if (idade < 16) {
            System.out.println("Proibido votar.");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
            System.out.println("Voto opcional.");
        } else {
            System.out.println("Voto obrigatorio");
        }
    }
}
