/**
 * Created by ma.diaz.a on 11/01/2017.
 */
import oficinaPolimorfismo.Desarrollador;
import oficinaPolimorfismo.Operador;
import persona.Persona;
import deportes.Futbolista;

public class Main {

    public static void main(String[] args) {

        Desarrollador d = new Desarrollador("Juliancini", "de la rosa",24,123456,1.0f);
        Operador o = new Operador("Juliancini2", "de la lili",40,654321,2.0f);

        System.out.println("Primero");
        d.trabajar();
        System.out.println("Y después");
        d.transporteTorta();

        System.out.println("Primero");
        o.trabajar();
        System.out.println("Y después");
        o.transporteTorta();

        /*Persona p = new Persona("Mario/Díaz");
        p.hablar();
        System.out.println(p);
        Futbolista f = new Futbolista("Julio", "Durán", 30, "Delantero", 22);
        f.hablar();
        System.out.println(f);*/

        /*Persona p = new Persona("Oswell/Spencer");
        p.setEdad(83);
        Persona p2 = new Persona("Mario", "Díaz", 26);
        System.out.println("Nombre: " + p.getNombre() + "; Apellido: " + p.getApellido() + "; Edad" + p.getEdad());
        System.out.println("Nombre: " + p2.getNombre() + "; Apellido: " + p2.getApellido() + "; Edad" + p2.getEdad());*/
    }

}
