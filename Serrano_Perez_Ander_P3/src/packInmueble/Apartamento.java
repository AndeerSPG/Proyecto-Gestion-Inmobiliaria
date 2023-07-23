package packInmueble;
/**
 * Representa un apartamento, que es un tipo de vivienda.
 */
public class Apartamento extends Viviendas{
    private boolean balcon;
    private int numero_planta;

    /**
     * Constructor de la clase Apartamento.
     *
     * @param referencia_castral  Referencia catastral del apartamento.
     * @param pmunicipio          Municipio del apartamento.
     * @param pbarrio             Barrio del apartamento.
     * @param pnum_habitaciones   Número de habitaciones del apartamento.
     * @param pnum_aseos          Número de aseos del apartamento.
     * @param ptamaño             Tamaño del apartamento.
     * @param pnumplanta          Número de planta del apartamento.
     */
    public Apartamento(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos,int ptamaño,int pnumplanta){
        super(referencia_castral, pmunicipio, pbarrio,pnum_habitaciones,  pnum_aseos, ptamaño);
        if(balcon == true){
            setTasacion(getTasacion()+800);
        }
        else setTasacion(getTasacion()+250);

        numero_planta = pnumplanta;

    }
    /**
     * Constructor de la clase Apartamento.
     *
     * @param referencia_castral  Referencia catastral del apartamento.
     * @param pmunicipio          Municipio del apartamento.
     * @param pbarrio             Barrio del apartamento.
     * @param pnum_habitaciones   Número de habitaciones del apartamento.
     * @param pnum_aseos          Número de aseos del apartamento.
     * @param ptamaño             Tamaño del apartamento.
     * @param pnumero_planta      Número de planta del apartamento.
     * @param pprecio             Precio del apartamento.
     */
    public Apartamento(String referencia_castral, String pmunicipio, String pbarrio, int pnum_habitaciones, int pnum_aseos,int ptamaño,int pnumero_planta,int pprecio){
        super(referencia_castral, pmunicipio, pbarrio,pnum_habitaciones,  pnum_aseos, ptamaño,pprecio);
        if(balcon == true){
            setTasacion(getTasacion()+800);
        }
        else setTasacion(getTasacion()+250);
        numero_planta = pnumero_planta;
    }

    /**
     * Obtiene el número de planta del apartamento.
     *
     * @return Número de planta del apartamento.
     */
    public int getNumero_planta(){return numero_planta;}

    /**
     * Establece el número de planta del apartamento.
     *
     * @param p Número de planta a establecer.
     */
    public void setNumero_planta(int p){
        numero_planta = p;
    }

    /**
     * Verifica si el apartamento tiene balcón.
     *
     * @return true si el apartamento tiene balcón, false de lo contrario.
     */
    public boolean getbalcon(){return balcon;}

    /**
     Establece si el apartamento tiene balcón.
     @param p Valor booleano que indica si el apartamento tiene balcón.
     */
    public void setBalcon(boolean p){
        balcon = p;
    }

}
