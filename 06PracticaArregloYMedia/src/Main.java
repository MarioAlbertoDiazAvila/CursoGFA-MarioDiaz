/**
 * Created by ma.diaz.a on 10/01/2017.
 */
import utilerias.Utilerias;

public class Main {

    public static void main(String[] args) {
        Utilerias ut = new Utilerias();
        int[] array = ut.array();
        ut.muestraOpciones();
        ut.ejecutaOpciones(array);
    }

}