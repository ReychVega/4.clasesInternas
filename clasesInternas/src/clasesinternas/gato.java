package clasesinternas;

/**
 *
 * @author reych
 */
import javax.swing.JOptionPane;

public class gato extends zoologico {

    @Override
    void hacersonido() {
        JOptionPane.showMessageDialog(null, "Miaaaauuu");
    }

}
