import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         *int n1 = 3;
         *int n2 = 5;
         *float media = (n1 + n2)/2;
         *System.out.println("media = " + media);
        */
        System.out.print("Numerador: ");
        int n1 = input.nextInt();
        System.out.print("Denominador: ");
        int n2 = input.nextInt();
        float divisor = (n1 / n2);
        float resto = n1 % n2;

        System.out.println("Divisão:" + divisor);
        System.out.println("Resto:" + resto);
    }
}
