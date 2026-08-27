public class TesteTipos {
    public static void main(String[] args) {
       /*
        *   int idade = 30;
        *   String valor = Integer.toString(idade); Metodo para converter um numero em string
        *   System.out.println(valor)
        */

        String valor = "30";
        int idade = Integer.parseInt(valor); // Metodo para converter String em numero inteiro
        System.out.println(idade);

        String peso = "80.6";
        float pesoFloat = Float.parseFloat(peso);
        System.out.printf("%.2f ", pesoFloat);
    }

}
