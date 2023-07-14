package clasesinternas;

/**
 *
 * @author reych
 */
abstract class zoologico {

    abstract void hacersonido();
}

//Clase Interna
class Mascota{

    private String nombre;
    public Mascota(String nombre){
    this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}