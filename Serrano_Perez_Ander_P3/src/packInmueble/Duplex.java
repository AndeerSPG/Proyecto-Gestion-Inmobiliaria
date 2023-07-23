package packInmueble;

/**
 * Clase que representa un tipo de vivienda llamado "Duplex", que extiende la clase Viviendas.
 */
public class Duplex extends Viviendas {
    private int num_escaleras;

    /**
     * Constructor de la clase Duplex.
     * @param referencia_castral La referencia catastral de la vivienda.
     * @param pmunicipio El municipio donde se encuentra la vivienda.
     * @param pbarrio El barrio donde se encuentra la vivienda.
     * @param pnum_habitaciones El número de habitaciones de la vivienda.
     * @param pnum_aseos El número de aseos de la vivienda.
     * @param pnum_escaleras El número de escaleras del dúplex.
     */
    public Duplex(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos, int pnum_escaleras, int ptamaño) {
        super(referencia_castral, pmunicipio, pbarrio, pnum_habitaciones, pnum_aseos,ptamaño);
        num_escaleras = pnum_escaleras;
    }
    /**
     * Constructor de la clase Duplex.
     * @param referencia_castral La referencia catastral de la vivienda.
     * @param pmunicipio El municipio donde se encuentra la vivienda.
     * @param pbarrio El barrio donde se encuentra la vivienda.
     * @param pnum_habitaciones El número de habitaciones de la vivienda.
     * @param pnum_aseos El número de aseos de la vivienda.
     * @param pnum_escaleras El número de escaleras del dúplex.
     * @param ppreciozona indica el precio de la zona.
     */
    public Duplex(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos, int pnum_escaleras, int ptamaño, int ppreciozona) {
        super(referencia_castral, pmunicipio, pbarrio, pnum_habitaciones, pnum_aseos,ptamaño,ppreciozona);
        num_escaleras = pnum_escaleras;
    }

    /**
     * Establece el número de escaleras del dúplex.
     * @param pnum El número de escaleras del dúplex.
     */
    public void setNumEscaleras(int pnum) {
        num_escaleras = pnum;
    }

    /**
     * Obtiene el número de escaleras del dúplex.
     * @return El número de escaleras del dúplex.
     */
    public int getNumEscaleras() {
        return num_escaleras;
    }

    /**
     * Devuelve una representación en formato de cadena del dúplex.
     * @return La representación del dúplex en formato de cadena.
     */
    public String toString() {
        return super.toString()+ "\nNúmero de escaleras: " + getNumEscaleras();
    }

    /**
     * Calcula el costo de mantenimiento del dúplex.
     * @return El costo de mantenimiento del dúplex.
     */
    public int costeMantenimiento() {
        return (this.getNum_habitaciones() + num_escaleras) / 10;
    }
}
