/**
 * Created by ma.diaz.a on 10/01/2017.
 */
import matematicas.Matematicas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Matematicas mat = new Matematicas();
        Scanner leer = new Scanner(System.in);
        float a, b;
        System.out.println("Introduce el 1er número:");
        a = leer.nextFloat();
        System.out.println("Introduce el 2do número:");
        b = leer.nextFloat();
        System.out.println("Suma: " + Matematicas.suma(a, b));
        System.out.println("Resta: " + mat.resta(a, b));
        System.out.println("Multiplicación: " + Matematicas.multiplicacion(a, b));
        System.out.println("División: " + mat.division(a, b));
    }

}