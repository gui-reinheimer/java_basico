package operadores.Logicos.Relacionais;

import java.time.LocalDate;
import java.util.Scanner;

public class ObrigacaoVotar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int ano = input.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - ano;
        String obrigatorio =
        ((idade>=16 && idade<18) || (idade > 70))
            ?"Voto não obrigatório":"Voto Obrigatório";
        System.out.println("Idade: " + idade);
        System.out.println(obrigatorio);
    }

}
