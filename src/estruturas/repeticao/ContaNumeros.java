package estruturas.repeticao;

import java.util.Scanner;

public class ContaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numDigitado, totalNum = 0, numPar=0, numImpar=0, numAcimaDeCem = 0;

        do {
            System.out.print("Digite um numero (ou 0 para sair): ");
            numDigitado = input.nextInt();
            if (numDigitado != 0) {
                totalNum++;

                if (numDigitado % 2 == 0) {
                    numPar++;
                } else {
                    numImpar++;
                }
                if (numDigitado > 100) {
                    numAcimaDeCem++;
                }
            }


        } while (numDigitado != 0);
        System.out.println("Você digitou 0. Encerrando...");
        System.out.println("Total de numeros: " + totalNum);
        System.out.println("Total de pars: " + numPar);
        System.out.println("Total de impar: " + numImpar);
        System.out.println("Acima de 100: " + numAcimaDeCem);
    }
}
