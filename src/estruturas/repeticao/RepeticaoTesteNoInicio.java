package estruturas.repeticao;

public class RepeticaoTesteNoInicio {
    public static void main(String[] args) {
        int cc = 0;
         while(cc<10) {
             cc++;
             if (cc == 5 || cc == 7) {
                 continue;
             }
             if (cc == 8) {
                 break;
             }
             System.out.println("Cambalhota " + cc);
         }
    }
}
