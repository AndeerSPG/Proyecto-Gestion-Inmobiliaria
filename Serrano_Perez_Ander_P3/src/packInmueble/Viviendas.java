package packInmueble;

/**
 * Clase que representa viviendas.
 */
public class Viviendas extends Inmueble {
    private int num_habitaciones;
    private int num_aseos;
    private int tasacion;

    /**
     * Constructor de la clase Viviendas.
     * @param referencia_castral La referencia catastral de la vivienda.
     * @param pmunicipio El municipio donde se encuentra la vivienda.
     * @param pbarrio El barrio donde se encuentra la vivienda.
     * @param pnum_habitaciones El número de habitaciones de la vivienda.
     * @param pnum_aseos El número de aseos de la vivienda.
     */
    public Viviendas(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos,int ptamaño) {
        super(referencia_castral, pmunicipio, pbarrio,ptamaño);
        num_habitaciones = pnum_habitaciones;
        num_aseos = pnum_aseos;
        tasacion = getZona1().getprecio() * getTamaño();
    }
    /**
     * Constructor de la clase Viviendas.
     * @param referencia_castral La referencia catastral de la vivienda.
     * @param pmunicipio El municipio donde se encuentra la vivienda.
     * @param pbarrio El barrio donde se encuentra la vivienda.
     * @param pnum_habitaciones El número de habitaciones de la vivienda.
     * @param pnum_aseos El número de aseos de la vivienda.
     * @param ppreciozona indica el precio de la zona.
     */
    public Viviendas(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos,int ptamaño, int ppreciozona) {
        super(referencia_castral, pmunicipio, pbarrio,ptamaño,ppreciozona);
        num_habitaciones = pnum_habitaciones;
        num_aseos = pnum_aseos;
        tasacion = ppreciozona * getTamaño();
    }

    /**
     * Establece el número de habitaciones de la vivienda.
     * @param pnum El número de habitaciones.
     */
    public void setNum_habitaciones(int pnum) {
        num_habitaciones = pnum;
    }

    /**
     * Obtiene el número de habitaciones de la vivienda.
     * @return El número de habitaciones.
     */
    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    /**
     * Establece el número de aseos de la vivienda.
     * @param pnum El número de aseos.
     */
    public void Set_aseos(int pnum) {
        num_aseos = pnum;
    }

    /**
     * Obtiene el número de aseos de la vivienda.
     * @return El número de aseos.
     */
    public int getNum_aseos() {
        return num_aseos;
    }

    /**
     * Devuelve una representación en forma de cadena de la vivienda.
     * @return La representación de la vivienda como cadena.
     */
    public String toString() {
        return  super.toString() + "\nNumero de habitaciones: " + getNum_habitaciones() + "\n Numero de aseos: " + getNum_aseos();
    }

    /**
     * Obtiene la tasación de la vivienda.
     * @return La tasación de la vivienda.
     */
    public int getTasacion() {
        return tasacion;
    }

    /**
     * Establece la tasación de la vivienda.
     * @param p La tasación de la vivienda.
     */
    public void setTasacion(int p) {
        tasacion = p;
    }

    /**
     * Comprueba si el precio de venta es inferior al de tasación.
     * @return Un mensaje indicando si el precio de venta es inferior o superior al de tasación.
     */
    public String precio_inferior_tasacion() {
        if (this.getPrecioTotal() < tasacion) {
            return "El precio de venta es inferior al de tasacion.";
        } else {
            return "El precio de venta es superior al de tasacion.";
        }
    }

/**
 * Calcula el número óptimo de personas para la vivienda.
 * @return El número óptimo de personas para la vivienda
 */
    public int personas_optimas_vivienda(){
        return 2* num_habitaciones;
    }
}
