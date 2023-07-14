package clasesinternas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author reych
 */
public class clasesInternas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<zoologico> animalitos = new ArrayList<>();

        //Agragar objetos al vector
        animalitos.add(new perro());
        animalitos.add(new gato());

        for (zoologico animal : animalitos) {
            animal.hacersonido();
        }
        Mascota perrito = new Mascota("FIRULAIS");
        Mascota gatito = new Mascota("MICHI");
        JOptionPane.showMessageDialog(null, "Nombre del perito es: " + perrito.getNombre()
                + "Nombre del gatito: " + gatito.getNombre());
    }

}
    
