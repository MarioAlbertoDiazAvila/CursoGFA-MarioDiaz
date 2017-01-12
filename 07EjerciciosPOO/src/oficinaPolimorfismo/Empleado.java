package oficinaPolimorfismo;
import persona.Persona;

/**
 * Created by ma.diaz.a on 11/01/2017.
 * Clase abstracta, éstas no se pueden instanciar, pero las subclases pueden obtener los métodos
 * Las subclases deben implementar todos los métodos de la clase abstracta
 */
public abstract class Empleado extends Persona{

    private int cveEmp;
    private float salario;

    public Empleado(String nombre, String apellido, int edad, int cveEmp, float salario){
        super(nombre, apellido, edad);
        this.cveEmp = cveEmp;
        this.salario = salario;
    }

    public abstract void trabajar();

    public abstract  void transporteTorta();

}