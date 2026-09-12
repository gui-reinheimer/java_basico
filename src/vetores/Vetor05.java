package vetores;

import java.util.Arrays;

public class Vetor05 {
    public static void main(String[] args) {
        int[] v = new int[20];
        Arrays.fill(v,5);
        for(int valor: v){
            System.out.print(valor+" ");
        }

        /* for (int i =0; i<v.length; i++){
            v[i] = 15;
            System.out.print(v[i]+" ");
        }
        */
    }
}
