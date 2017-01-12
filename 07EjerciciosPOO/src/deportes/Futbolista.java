package deportes;
import persona.Persona;

/**
 * Created by ma.diaz.a on 11/01/2017.
 */
public class Futbolista extends Persona {
    private String posicion;
    private int dorsal;

    public Futbolista(String nombre, String apellido, int edad, String posicion, int dorsal){
        super(nombre, apellido, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    @Override
    public void hablar(){
        System.out.println("Ganamos!!!");
    }

    @Override
    public void comer(){
        System.out.println("mmmmmmmmmm lico!!!");
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "; Apellido: " + getApellido() + "; Edad: " + getEdad() + "; Posicion: " + posicion
                + "; Dorsal: " + dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(short dorsal) {
        this.dorsal = dorsal;
    }
}
