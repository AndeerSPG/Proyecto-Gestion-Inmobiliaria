package packInmueble;

/**
 * Clase que representa un tipo de vivienda llamado "Bajos", que extiende la clase Viviendas.
 */
public class Bajos extends Viviendas {
    private boolean barbacoa;

    /**
     * Constructor de la clase Bajos.
     * @param referencia_castral La referencia catastral de la vivienda.
     * @param pmunicipio El municipio donde se encuentra la vivienda.
     * @param pbarrio El barrio donde se encuentra la vivienda.
     * @param pnum_habitaciones El número de habitaciones de la vivienda.
     * @param pnum_aseos El número de aseos de la vivienda.
     * @param pbarbacoa Indica si la vivienda tiene barbacoa (true) o no (false).
     */
    public Bajos(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos, boolean pbarbacoa,int ptamaño) {
        super(referencia_castral, pmunicipio, pbarrio, pnum_habitaciones, pnum_aseos,ptamaño);
        barbacoa = pbarbacoa;
        if (barbacoa) {
            setTasacion((int) (getTasacion() + (0.2 * getTasacion())));
        }
    }

    /**
     * Constructor de la clase Bajos.
     * @param referencia_castral La referencia catastral de la vivienda.
     * @param pmunicipio El municipio donde se encuentra la vivienda.
     * @param pbarrio El barrio donde se encuentra la vivienda.
     * @param pnum_habitaciones El número de habitaciones de la vivienda.
     * @param pnum_aseos El número de aseos de la vivienda.
     * @param pbarbacoa Indica si la vivienda tiene barbacoa (true) o no (false).
     * @param ppreciozona indica el precio de la zona en la que está el bajo.
     */
    public Bajos(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos, boolean pbarbacoa,int ptamaño, int ppreciozona) {
        super(referencia_castral, pmunicipio, pbarrio, pnum_habitaciones, pnum_aseos,ptamaño,ppreciozona);
        barbacoa = pbarbacoa;
        if (barbacoa) {
            setTasacion((int) (getTasacion() + (0.2 * getTasacion())));
        }
    }

    /**
     * Establece si la vivienda tiene barbacoa o no.
     * @param p Indica si la vivienda tiene barbacoa (true) o no (false).
     */
    public void setBarbacoa(boolean p) {
        barbacoa = p;
    }

    /**
     * Obtiene si la vivienda tiene barbacoa o no.
     * @return true si la vivienda tiene barbacoa, false si no la tiene.
     */
    public boolean getBarbacoa() {
        return barbacoa;
    }

    /**
     * Devuelve una representación en formato de cadena de la vivienda.
     * @return La representación de la vivienda en formato de cadena.
     */
    public String toString() {
        return super.toString()+ "\nBarbacoa: " + getBarbacoa();
    }

    /**
     * Calcula el costo de mantenimiento de la vivienda.
     * @return El costo de mantenimiento de la vivienda.
     */
    public int costeMantenimiento() {
        if (barbacoa) {
            return (this.getTamaño() * 2) + 100;
        } else {
            return (this.getTamaño() * 2);
        }
    }
}
