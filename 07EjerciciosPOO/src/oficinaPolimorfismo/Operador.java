package oficinaPolimorfismo;

/**
 * Created by ma.diaz.a on 11/01/2017.
 */
public class Operador extends Empleado {

    public Operador(String nombre, String apellido, int edad, int cveEmpleado, float salario){
        super(nombre, apellido, edad, cveEmpleado, salario);
    }

    @Override
    public void trabajar(){
        System.out.println("Conduce las unidades, hace liquidación...");
    }

    @Override
    public void transporteTorta(){
        System.out.println("Trafica tortas en sobres amarillos...");
    }

}