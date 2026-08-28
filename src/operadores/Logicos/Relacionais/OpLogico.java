package operadores.Logicos.Relacionais;

public class OpLogico {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r, r2, r3;
        r =  (x<y && y<z)?true:false; // se lê como (E)
        r2 = (x<y || y<z)?true:false; // se lê como (ou)
        r3 = (x<y ^ y<z)?true:false;  // se lê como (ou exclusivo)
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
    }
}
