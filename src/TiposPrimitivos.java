import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Usado para importar o Scanner para podemos coletar dados do usuario

        System.out.print("Digite o nome do aluno: ");
        String nome  = teclado.nextLine(); // Salvando o dado digitado

        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); // Salvando o dado digitado

        System.out.println("A nota é: " + nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        // Saida formatada do dado com duas casas decimais.
        // Podemos substituir printf por format e para ter o mesmo resultado
    }
}
