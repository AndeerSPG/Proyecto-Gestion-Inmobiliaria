package packInmueble;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Clase que representa una gestión inmobiliaria.
 */
public class GestionInmobiliaria {
    private ArrayList<Inmueble> lista_inmueble;

    /**
     * Constructor de la clase GestionInmobiliaria. Inicializa el ArrayList.
     */
    public GestionInmobiliaria() {
        lista_inmueble = new ArrayList<Inmueble>();


    }

    /**
     * Añade un inmueble a la lista de inmuebles, si no está ya incluido.
     * @param pinmueble El inmueble a incluir.
     */
    public void incluirInmueble(Inmueble pinmueble) {
        if (!lista_inmueble.contains(pinmueble)) {
            lista_inmueble.add(pinmueble);
        }
    }

    /**
     * Elimina un inmueble de la lista de inmuebles, si está presente.
     * @param pinmueble El inmueble a eliminar.
     */
    public void removeInmueble(Inmueble pinmueble) {
        if (lista_inmueble.contains(pinmueble)) {
            lista_inmueble.remove(pinmueble);
        }
    }

    /**
     * Busca la referencia catastral de todos los inmuebles de un municipio y los devuelve en un ArrayList.
     * @param pmunicipio El municipio para el que se desea obtener las referencias catastrales.
     * @return Un ArrayList de las referencias catastrales de los inmuebles del municipio.
     */
    public ArrayList<String> catastroMunicipio(String pmunicipio) {
        ArrayList<String> lista_referencias = new ArrayList<>();
        for (int i = 0; i < lista_inmueble.size(); i++) {
            if (lista_inmueble.get(i).obtenerMunicipio().equals(pmunicipio)) {
                lista_referencias.add(lista_inmueble.get(i).getReferenciaCastral());
            }
        }
        return lista_referencias;
    }

    /**
     * Busca un inmueble por su referencia catastral y lo devuelve.
     * Si el inmueble no está en el catastro, devuelve null.
     * @param preferencia La referencia catastral del inmueble a buscar.
     * @return El inmueble correspondiente a la referencia catastral, o null si no se encuentra.
     */
    public Inmueble buscarInmueble(String preferencia) {
        Inmueble inmueble = null;
        int i = 0;
        boolean encontrado = false;
        while (i < lista_inmueble.size() && !encontrado) {
            if (lista_inmueble.get(i).getReferenciaCastral().equals(preferencia)) {
                encontrado = true;
                inmueble = lista_inmueble.get(i);
            }
            i++;
        }
        return inmueble;
    }

    /**
     * Obtiene la lista de inmuebles gestionados por la clase.
     * @return La lista de inmuebles.
     */
    public ArrayList<Inmueble> getListaInmueble() {
        return lista_inmueble;
    }
}
