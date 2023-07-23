package packInmueble;

/**
 * Clase que representa un tipo de inmueble llamado "Garajes", que extiende la clase Inmueble
 * e implementa la interfaz "alquiler".
 */
public class Garajes extends Inmueble implements alquiler {
    private int num_coches;
    private int tasacion;

    /**
     * Constructor de la clase Garajes.
     * @param referencia_castral La referencia catastral del garaje.
     * @param pmunicipio El municipio donde se encuentra el garaje.
     * @param pbarrio El barrio donde se encuentra el garaje.
     * @param pnum_coches El número de coches que puede albergar el garaje.
     */
    public Garajes(String referencia_castral, String pmunicipio, String pbarrio, int pnum_coches, int ptamaño) {
        super(referencia_castral, pmunicipio, pbarrio,ptamaño);
        tasacion = (int) ((getTasacion() + 0.05 * num_coches)) ;
        num_coches = pnum_coches;

    }
    /**
     * Constructor de la clase Garajes.
     * @param referencia_castral La referencia catastral del garaje.
     * @param pmunicipio El municipio donde se encuentra el garaje.
     * @param pbarrio El barrio donde se encuentra el garaje.
     * @param pnum_coches El número de coches que puede albergar el garaje.
     * @param ppreciozona indica el precio de la zona.
     */
    public Garajes(String referencia_castral, String pmunicipio, String pbarrio, int pnum_coches, int ptamaño, int ppreciozona) {
        super(referencia_castral, pmunicipio, pbarrio,ptamaño,ppreciozona);
        tasacion =  (int) (getTasacion() + (0.05 * num_coches));
        num_coches = pnum_coches;

    }

    /**
     * Calcula el precio de alquiler del garaje.
     * @return El precio de alquiler del garaje.
     */
    public int precio_alquiler() {
        return (int) (tasacion / 1000);
    }

    /**
     Obtiene el número de coches que pueden ser estacionados en el garaje.
     @return Número de coches del garaje.
     */
    public int getNum_coches() {
        return num_coches;
    }


    /**
     Devuelve una representación en forma de cadena de caracteres que describe el garaje.
     @return Cadena de caracteres que representa el garaje.
     */
    public String toString() {
        return super.toString() +"\n El precio del alquier es " + precio_alquiler() + "\n El numero de plazas es: " + getNum_coches();
    }

    /**
     Obtiene la tasación del garaje.
     @return Tasación del garaje.
     */
    public int getTasacion(){
        return tasacion;
    }

    /**
     Establece la tasación del garaje.
     */
    public void setTasacion(){
        tasacion =  (int) (getZona1().getprecio() * getTamaño() + (0.05 * num_coches));
    }
}
