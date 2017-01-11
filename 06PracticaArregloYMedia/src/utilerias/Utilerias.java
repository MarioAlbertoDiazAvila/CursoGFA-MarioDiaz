package utilerias;
import java.util.Scanner;

/**
 * Created by ma.diaz.a on 10/01/2017.
 */
public class Utilerias {
    Scanner sc = new Scanner(System.in);

    public int[] array(){
        System.out.print("Definir el tamaño del arreglo (máximo 20): ");
        String cad = sc.nextLine();
        while(!validaNum(cad) || Integer.parseInt(cad) < 1 || Integer.parseInt(cad) > 20){
            System.out.print("Favor de ingresar un valor numérico positivo para definir el tamaño del arreglo (máximo 20): ");
            cad = sc.nextLine();
        }
        int tam = Integer.parseInt(cad);
        int[] array = new int[tam];
        for(int z = 0; z < array.length; z++){
            System.out.print("Definir el valor " + (z + 1) + ": ");
            cad = sc.nextLine();
            while(!validaNum(cad)){
                System.out.print("Favor de ingresar un valor numérico para el valor " + (z + 1) +": ");
                cad = sc.nextLine();
            }
            array[z] = Integer.parseInt(cad);
        }
        return array;
    }

    public static boolean validaNum(String i){
        try{
            int j = Integer.parseInt(i);
        }catch(Exception e){
            return false;
        }
        return true;
    }

    public void muestraOpciones(){
        System.out.println("\nSELECCIONA UNA DE LAS SIGUIENTES OPERACIONES:");
        System.out.println("1 - SUMAR los valores del arreglo.");
        System.out.println("2 - Obtener la MEDIA del arreglo.");
        System.out.println("3 - Obtener el número MAYOR en el arreglo.");
        System.out.println("4 - Elegir nuevos valores para el arreglo.");
        System.out.println("Cualquier otro número o valor para salir.");
    }

    public void ejecutaOpciones(int[] array){
        int opc;
        try {
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    int suma = sumaArreglo(array);
                    System.out.println("1 - La SUMA de los valores en el arreglo es: " + suma);
                    muestraOpciones(); ejecutaOpciones(array);
                    break;
                case 2:
                    float media = media(array);
                    System.out.println("2 - La MEDIA del arreglo es: " + media);
                    muestraOpciones(); ejecutaOpciones(array);
                    break;
                case 3:
                    int mayor = mayor(array);
                    System.out.println("3 - El número MAYOR en el arreglo es: " + mayor);
                    muestraOpciones(); ejecutaOpciones(array);
                    break;
                case 4:
                    array = array();
                    muestraOpciones(); ejecutaOpciones(array);
                    break;
            }
        }catch(Exception e){
            System.out.println("\nTerminando Ejecución, hasta pronto!");
        }
    }

    public int sumaArreglo(int[] array){
        int suma = 0;
        for(int a = 0; a < array.length; a ++){
            suma += array[a];
        }
        return suma;
    }

    public float media(int[] array){
        int suma = sumaArreglo(array);
        float media = 0;
        return media = suma / array.length;
    }

    public int mayor(int[] array){
        int mayor = array[0];
        for(int y = 0; y < array.length; y ++){
            if(array[y]>mayor){
                mayor = array[y];
            }
        }
        return mayor;
    }

}