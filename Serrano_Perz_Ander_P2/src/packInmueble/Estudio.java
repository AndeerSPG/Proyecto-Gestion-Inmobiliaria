package packInmueble;

/**
 * Clase que representa un tipo de vivienda llamado "Estudio", que extiende la clase Viviendas
 * e implementa la interfaz "alquiler".
 */
public class Estudio extends Viviendas implements alquiler {
    private boolean ascensor;

    /**
     * Constructor de la clase Estudio.
     * @param referencia_castral La referencia catastral de la vivienda.
     * @param pmunicipio El municipio donde se encuentra la vivienda.
     * @param pbarrio El barrio donde se encuentra la vivienda.
     * @param pnum_habitaciones El número de habitaciones de la vivienda.
     * @param pnum_aseos El número de aseos de la vivienda.
     * @param pascensor Indica si la vivienda tiene ascensor (true) o no (false).
     */
    public Estudio(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos, boolean pascensor,int ptamaño) {
        super(referencia_castral, pmunicipio, pbarrio, pnum_habitaciones, pnum_aseos,ptamaño);
        ascensor = pascensor;
    }
    /**
     * Constructor de la clase Estudio.
     * @param referencia_castral La referencia catastral de la vivienda.
     * @param pmunicipio El municipio donde se encuentra la vivienda.
     * @param pbarrio El barrio donde se encuentra la vivienda.
     * @param pnum_habitaciones El número de habitaciones de la vivienda.
     * @param pnum_aseos El número de aseos de la vivienda.
     * @param pascensor Indica si la vivienda tiene ascensor (true) o no (false).
     * @param ppreciozona indica el precio de la zona.
     */
    public Estudio(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos, boolean pascensor,int ptamaño, int ppreciozona) {
        super(referencia_castral, pmunicipio, pbarrio, pnum_habitaciones, pnum_aseos,ptamaño,ppreciozona);
        ascensor = pascensor;
    }

    /**
     * Establece si la vivienda tiene ascensor o no.
     * @param p Indica si la vivienda tiene ascensor (true) o no (false).
     */
    public void setAscensor(boolean p) {
        ascensor = p;
    }

    /**
     * Obtiene si la vivienda tiene ascensor o no.
     * @return true si la vivienda tiene ascensor, false si no lo tiene.
     */
    public boolean getAscensor() {
        return ascensor;
    }

    /**
     * Devuelve una representación en formato de cadena de la vivienda.
     * @return La representación de la vivienda en formato de cadena.
     */
    public String toString() {
        return super.toString() +"\nAscensor: " + getAscensor() + "\n El precio del alquier es " + precio_alquiler();
    }

    /**
     * Calcula el número óptimo de personas para habitar la vivienda.
     * @return El número óptimo de personas para habitar la vivienda.
     */
    public int personasOptimasVivienda() {
        return (2 * super.getNum_habitaciones()) - 1;
    }

    /**
     * Calcula el costo de mantenimiento de la vivienda.
     * @return El costo de mantenimiento de la vivienda.
     */
    public int costeMantenimiento() {
        return this.getTamaño() * 5;
    }

    /**
     * Calcula el precio de alquiler de la vivienda.
     * @return El precio de alquiler de la vivienda.
     */
    public int precio_alquiler() {
        if (ascensor) {
            return (int) ((getTasacion() / 10000) + 200);
        } else {
            return (int) (getTasacion() / 10000);
        }
    }
}