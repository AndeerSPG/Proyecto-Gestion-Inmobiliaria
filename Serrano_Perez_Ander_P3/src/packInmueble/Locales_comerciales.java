package packInmueble;

/**
 * Clase que representa un local comercial.
 */
public class Locales_comerciales extends Inmueble {
    private String Tipo_actividad;
    private int tasacion;

    /**
     * Constructor de la clase Locales_comerciales.
     * @param referencia_castral La referencia catastral del local comercial.
     * @param pmunicipio El municipio donde se encuentra el local comercial.
     * @param pbarrio El barrio donde se encuentra el local comercial.
     * @param ptipo El tipo de actividad del local comercial.
     */
    public Locales_comerciales(String referencia_castral, String pmunicipio, String pbarrio, String ptipo, int ptamaño) {
        super(referencia_castral, pmunicipio, pbarrio,ptamaño);
        Tipo_actividad = ptipo;

        if (Tipo_actividad.equals("restaurante")) {
            tasacion = super.getZona1().getprecio() * super.getTamaño() + 1000;
        } else {
            tasacion = super.getZona1().getprecio() * super.getTamaño();
        }

    }
    /**
     * Constructor de la clase Locales_comerciales.
     * @param referencia_castral La referencia catastral del local comercial.
     * @param pmunicipio El municipio donde se encuentra el local comercial.
     * @param pbarrio El barrio donde se encuentra el local comercial.
     * @param ptipo El tipo de actividad del local comercial.
     * @param ppreciozona indica el precio de la zona.
     */
    public Locales_comerciales(String referencia_castral, String pmunicipio, String pbarrio, String ptipo, int ptamaño,int ppreciozona) {
        super(referencia_castral, pmunicipio, pbarrio,ptamaño,ppreciozona);
        Tipo_actividad = ptipo;

        if (Tipo_actividad.equals("restaurante")) {
            tasacion = super.getZona1().getprecio() * super.getTamaño() + 1000;
        } else {
            tasacion = super.getZona1().getprecio() * super.getTamaño();
        }

    }
    /**
     Obtiene la tasación del local comercial.
     @return Tasación del local comercial.
     */
    public int getTasacion(){
        return tasacion;
    }

    /**
     Obtiene el tipo de actividad del local comercial.
     @return Tipo de actividad del local comercial.
     */
    public String getTipo_actividad(){
        return Tipo_actividad;
    }

    /**
     Devuelve una representación en cadena del local comercial.
     @return Cadena que representa el local comercial.
     */
    public String toString() {
        return super.toString() +"\n Tipo de actividad: " +getTipo_actividad() + "\nTasacion: " + getTasacion() ;
    }
}
