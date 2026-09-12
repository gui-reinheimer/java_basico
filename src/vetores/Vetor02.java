package vetores;

public class Vetor02 {
    public static void main(String[] args) {
        int anoAtual = 2025;
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] tot= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(anoAtual % 4 == 0) {
                tot[1] = tot[1] + 1;
            }

        for(int c=0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " ao todo");
        }
    }
}
