package operadores.Logicos.Relacionais;

public class OpRelacionais {
    public static void main(String[] args) {
        String nome1 = "Guilherme";
        String nome2 = "Guilherme";
        String nome3 = new String("Guilherme");
        String res = nome1==nome3 ?"Igual":"Diferente";
        /*
        * Ao comparar o nome1==nome2 o resultado vai ser igual, pois
        * o java percebe que ambos possui o mesmo texto e guarda no mesmo
        * espaço da memória. Agora ao comparar nome1==nome3 ele retorna
        * diferente, pois como usou o new ele cria um objeto
        * Se quisermos comparar apenas o conteudo que esta dentro dos
        * objetos usamos o (.equals) */
        String res2 = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);
        System.out.println(res2);
    }
}
