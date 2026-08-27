package operadoresAritmeticos;

public class Maths {
    public static void main(String[] args) {
        int numero = 25;
        float quadrada = (float) Math.sqrt(numero); // Raiz Quadrada
        float Exponente = (float) Math.pow(quadrada, 2); // Exponenciação
        float cubica = (float) Math.cbrt(numero); //Raiz cubica
        System.out.println("Raiz quadrada: " + quadrada);
        System.out.println("Exponente: " + Exponente);
        System.out.println("Raiz cubica: " + cubica);

        /* ARREDONDAMENTOS */
        float vlAbsoluto = (float) Math.abs(-10);
        float arrBaixo = (float) Math.floor(10.9);
        float arrCima = (float) Math.ceil(10.2);
        float arrAritmetico = (float) Math.round(8.7);
        System.out.println("Valor Absoluto: " + vlAbsoluto);
        System.out.println("Valor arredondado para Baixo: " + arrBaixo);
        System.out.println("Valor arredondado para Cima: " + arrCima);
        System.out.println("Valor arredondado Aritimeticamente: " + arrAritmetico);

        /*RAMDOM*/

        double ale = Math.random();
        int n = (int) (1 + ale * (100-1));
        System.out.println("Numero Aleatorio: " + ale);
        System.out.println("Numero Aleatorio: " + n);
    }
}
