/**
 * Created by ma.diaz.a on 10/01/2017.
 */
public class Main {

    public static void main(String[] args) {
        int[] Entero = new int[10];
        int[] EnteroB = {1,2,3,4,5};
        String[] Cadena = new String[10];
        boolean[] B= new boolean[10];
        Entero[0] = 10;
        System.out.println(Entero[0]);
        System.out.println(Cadena[0]);
        System.out.println(B[0]);
        //Arreglos bidimensionales:
        int[][] EnteroBi = new int[2][3];
        int[][] EnteroBiB = {{1,2,3},{9,8,7}};
        System.out.println(EnteroBiB[1][1]);
        System.out.println(EnteroBiB[0][2]);
    }

}
