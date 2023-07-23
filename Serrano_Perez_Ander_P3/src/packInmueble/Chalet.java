package packInmueble;

/**
 Clase que representa un chalet, un tipo de vivienda.
 */
public class Chalet extends Viviendas{
    private boolean jardin;
    private boolean piscina;
    /**
     Constructor de Chalet que permite crear un chalet con todas las características.
     @param referencia_castral Referencia catastral del chalet.
     @param pmunicipio Municipio del chalet.
     @param pbarrio Barrio del chalet.
     @param pnum_habitaciones Número de habitaciones del chalet.
     @param pnum_aseos Número de aseos del chalet.
     @param ptamaño Tamaño del chalet.
     @param pjardin Indica si el chalet tiene jardín.
     @param piscina Indica si el chalet tiene piscina.
     */
    public Chalet(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos,int ptamaño,boolean pjardin, boolean piscina){
        super(referencia_castral, pmunicipio, pbarrio, pnum_habitaciones, pnum_aseos, ptamaño);
        jardin = pjardin;
        this.piscina = piscina;
        if(piscina && jardin){
            setTasacion(getTasacion()+5000);
        }
        else setTasacion(getTasacion()+2000);
    }
    /**
     Constructor de Chalet que permite crear un chalet con todas las características y el precio de la zona.
     @param referencia_castral Referencia catastral del chalet.
     @param pmunicipio Municipio del chalet.
     @param pbarrio Barrio del chalet.
     @param pnum_habitaciones Número de habitaciones del chalet.
     @param pnum_aseos Número de aseos del chalet.
     @param ptamaño Tamaño del chalet.
     @param pjardin Indica si el chalet tiene jardín.
     @param ppreciozona Precio de la zona del chalet.
     */
    public Chalet(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos,int ptamaño,boolean pjardin,int ppreciozona){
        super(referencia_castral, pmunicipio, pbarrio, pnum_habitaciones, pnum_aseos, ptamaño,ppreciozona);
        jardin = pjardin;
        if(piscina && jardin){
            setTasacion(getTasacion()+5000);
        }
        else setTasacion(getTasacion()+2000);
    }
    /**
     Establece si el chalet tiene jardín.
     @param pjardin Valor booleano que indica si el chalet tiene jardín.
     */
    public void setJardin(boolean pjardin){
        jardin = pjardin;
    }

    /**
     Obtiene el valor que indica si el chalet tiene jardín.
     @return Valor booleano que indica si el chalet tiene jardín.
     */
    public boolean getJardin(){
        return jardin;
    }

    /**
     Obtiene el valor que indica si el chalet tiene piscina.
     @return Valor booleano que indica si el chalet tiene piscina.
     */
    public boolean getPiscina(){
        return piscina;
    }

    /**
     * Devuelve una representación en formato de cadena de la vivienda.
     * @return La representación de la vivienda en formato de cadena.
     */
    public String toString(){
        return super.toString()+ "\n Jardin: " + getJardin() + "\n Piscina: " + getPiscina();
    }
}
