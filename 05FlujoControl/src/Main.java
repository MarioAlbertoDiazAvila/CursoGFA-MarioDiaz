/**
 * Created by ma.diaz.a on 10/01/2017.
 * Arreglo de 5 strings
 *
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5]; String chain = "";
        for(int z = 0; z < array.length; z++){
            System.out.print("Ingresa el nombre " + (z + 1) + ": ");
            array[z] = sc.nextLine();
        }
        System.out.println("Arreglo con los 5 nombres:");
        for(int x = 0; x < array.length; x++){
            System.out.println("Nombre " + (x + 1) + ": " + array[x]);
            chain += array[x] + " ";
        }
        System.out.println("Arreglote: " + chain);
    }

}
