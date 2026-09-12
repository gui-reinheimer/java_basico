package vetores;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int[] vet = {5,6,2,7,1,8};
        for(int valor: vet){
            System.out.print(valor+" ");
        }
        System.out.println();
        int i = Arrays.binarySearch(vet, 3);
        System.out.println("Encontrado valor na posição "+i);
    }
}
