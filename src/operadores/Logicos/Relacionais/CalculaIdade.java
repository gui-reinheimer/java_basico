package operadores.Logicos.Relacionais;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int ano = input.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - ano;
        String situacao = (idade >= 18)?"Maior de idade":"Menor de idade";
        System.out.println("Sua idade é: " + idade);
        System.out.print("Você é " + situacao);
    }
}
