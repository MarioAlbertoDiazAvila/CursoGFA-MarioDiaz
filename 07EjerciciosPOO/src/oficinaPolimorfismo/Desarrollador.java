package oficinaPolimorfismo;

/**
 * Created by ma.diaz.a on 11/01/2017.
 */
public class Desarrollador extends Empleado {

    public Desarrollador(String nombre, String apellido, int edad, int cveEmpleado, float salario){
        super(nombre, apellido, edad, cveEmpleado, salario);
    }

    @Override
    public void trabajar(){
        System.out.println("Codifica, Desarrolla, (sin seguir proceso)...");
    }

    @Override
    public void transporteTorta(){
        System.out.println("Trafica tortas en sobres amarillos...");
    }

}