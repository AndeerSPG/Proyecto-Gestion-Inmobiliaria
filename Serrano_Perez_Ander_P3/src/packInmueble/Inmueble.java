package packInmueble;
import packZona.*;
/**
 * Clase que representa un inmueble.
 */
public class Inmueble implements Comparable {
    private final String referencia_castral;
    private Zona zona1;
    private int tamano;
    private int precioTotal;
    private int tasacion;

    /**
     * Constructor de la clase Inmueble.
     * @param referencia_castral La referencia catastral del inmueble.
     * @param pmunicipio El municipio donde se encuentra el inmueble.
     * @param pbarrio El barrio donde se encuentra el inmueble.
     */
    public Inmueble(String referencia_castral, String pmunicipio, String pbarrio,int ptamaño) {
        this.referencia_castral = referencia_castral;
        tamano = ptamaño;
        zona1 = new Zona(pmunicipio, pbarrio);

        precioTotal = tamano * zona1.getprecio();
        tasacion = precioTotal;
    }
    /**
     * Constructor de la clase Inmueble.
     * @param referencia_castral La referencia catastral del inmueble.
     * @param pmunicipio El municipio donde se encuentra el inmueble.
     * @param pbarrio El barrio donde se encuentra el inmueble.
     * @param pprecioZona indica el precio de la zona.
     */
    public Inmueble(String referencia_castral, String pmunicipio, String pbarrio,int ptamaño,int pprecioZona) {
        this.referencia_castral = referencia_castral;
        tamano = ptamaño;
        zona1 = new Zona(pmunicipio, pbarrio,pprecioZona);

        precioTotal = tamano * pprecioZona;
        tasacion = precioTotal;
    }

    /**
     * Compara si dos inmuebles son iguales según su referencia catastral.
     * @param obj El objeto a comparar.
     * @return true si los inmuebles tienen la misma referencia catastral, false en caso contrario.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Inmueble) {
            Inmueble otro = (Inmueble) obj;
            if (this.referencia_castral.equals(otro.referencia_castral)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Obtiene el municipio del inmueble.
     * @return El municipio del inmueble.
     */
    public String obtenerMunicipio() {
        return this.zona1.getubicacion().getMunicipio();
    }

    /**
     * Obtiene la referencia catastral del inmueble.
     * @return La referencia catastral del inmueble.
     */
    public String getReferenciaCastral() {
        return referencia_castral;
    }

    /**
     * Obtiene la zona del inmueble.
     * @return La zona del inmueble.
     */
    public Zona getZona1() {
        return zona1;
    }
    /**
     Establece la zona del inmueble.
     @param p Zona del inmueble.
     */
    public void setZona1(Zona p){
        zona1 = p;
    }

    /**
     * Obtiene el tamaño del inmueble.
     * @return El tamaño del inmueble.
     */
    public int getTamaño() {
        return tamano;
    }

    /**
     * Establece el tamaño del inmueble.
     * @param p El tamaño del inmueble a establecer.
     */
    public void setTamaño(int p) {
        tamano = p;
    }

    /**
     * Obtiene el precio total del inmueble.
     * @return El precio total del inmueble.
     */
    public int getPrecioTotal() {
        return precioTotal;
    }

    /**
     Compara el inmueble actual con otro objeto.
    @param obj Objeto a comparar.
    @return Devuelve un valor negativo si el precio total del inmueble actual es menor al del objeto comparado,un valor positivo si es mayor, y 0 si son iguales.
    */
    public int compareTo(Object obj){
        Inmueble in = (Inmueble) obj;
        if(this.getPrecioTotal()<in.getPrecioTotal()){
            return -1;
        }
        if(this.getPrecioTotal()>in.getPrecioTotal()){
            return 1;
        }
        return 0;
    }
    /**
     Obtiene la tasación del inmueble.
    @return Tasación del inmueble.
    */
    public int getTasacion(){
        return tasacion;
    }
    /**
     Devuelve una representación en cadena del inmueble.
     @return Cadena que representa el inmueble.
     */
    public String toString() {
        return "\nTipo: "+ getClass()+"\nReferencia Castral: " + getReferenciaCastral() + "\n Zona: " + getZona1() + "\n Tamaño: " + getTamaño() + "\n Precio Total: " + getPrecioTotal() + "\n Tasacion: " + getTasacion();
    }

    /**
     Establece el precio total del inmueble.
     @param pprecio Precio total del inmueble.
     @throws IllegalArgumentException si el precio es un valor negativo.
     */
    public void set_preciototal(int pprecio){
        if (pprecio < 0) {
            throw new IllegalArgumentException("El precio no puede ser un valor negativo");
        }
        precioTotal = pprecio;
    }
}
