import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = input.nextInt();

        System.out.printf("%d + %d = %d", num1, num2, num1+num2);
    }
}
