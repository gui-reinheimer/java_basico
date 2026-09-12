package vetores;


import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        int[] num = {5,6,2,3,7,4,6};

        Arrays.sort(num);

        for(int valor: num){
            System.out.printf(valor + " ");
        }

    }
}
