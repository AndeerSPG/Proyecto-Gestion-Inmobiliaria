package packZona;
/**
 Representa una zona con información sobre su ubicación, precio y disponibilidad de instalaciones deportivas.
 */
public class Zona {
    private Ubicacion ubi1;
    private int precio;
    private boolean Instalaciones_deportivas;

    /**
     Crea una instancia de Zona con la ubicación, precio y disponibilidad de instalaciones deportivas especificados.
     @param pmunicipio El nombre del municipio de la zona.
     @param pbarrio El nombre del barrio de la zona.
     @param pprecio El precio de la zona.
     */
    public Zona(String pmunicipio, String pbarrio, int pprecio ){
        ubi1 = new Ubicacion(pmunicipio,pbarrio);
        precio = pprecio;
        Instalaciones_deportivas = false;

    }
    /**
     Crea una instancia de Zona con la ubicación, precio y sin instalaciones deportivas por defecto.
     @param pmunicipio El nombre del municipio de la zona.
     @param pbarrio El nombre del barrio de la zona.
     */
    public Zona(String pmunicipio, String pbarrio){
        ubi1 = new Ubicacion(pmunicipio,pbarrio);
        precio = 3000;
        Instalaciones_deportivas = false;
    }

    /**
     Obtiene la ubicación de la zona.
     @return La ubicación de la zona.
     */
    public Ubicacion getubicacion(){
        return ubi1;
    }

    /**
     Obtiene el precio de la zona.
     @return El precio de la zona.
     */
    public int getprecio(){
        return precio;
    }

    /**
     Comprueba si la zona cuenta con instalaciones deportivas.
     @return true si la zona tiene instalaciones deportivas, false en caso contrario.
     */
    public boolean getInstalacion(){
        return Instalaciones_deportivas;
    }

    public void setInstalaciones_deportivas(boolean p){
        Instalaciones_deportivas = p;
    }

    /**
     Compara si la zona es igual a otro objeto.
     @param obj El objeto a comparar.
     @return true si la zona es igual al objeto especificado, false en caso contrario.
     */
    public boolean equals(Object obj){
        if(obj instanceof Zona){
            Zona otro = (Zona) obj;
            if(this.getubicacion().getMunicipio() == otro.getubicacion().getMunicipio() && this.getubicacion().getBarrio() == otro.getubicacion().getBarrio()  ){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    /**
     Comprueba si la zona es más cara que otra zona.
     @param pzona La otra zona a comparar.
     @return true si la zona es más cara que la zona especificada, false en caso contrario.
     */
    public boolean masCaro(Zona pzona){
        if(this.getprecio() > pzona.getprecio()){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     Comprueba si la zona tiene el mismo municipio que el especificado.
     @param pmunicipio El municipio a comparar.
     @return true si la zona tiene el mismo municipio, false en caso contrario.
     */
    public boolean igualMunicipio(String pmunicipio){
        if (ubi1.getMunicipio() == pmunicipio){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     Devuelve una representación en forma de cadena de la zona, incluyendo su ubicación, precio y disponibilidad de instalaciones deportivas.
     @return La representación en forma de cadena de la zona.
     */
    public String toString(){
        return "[" + this.getubicacion().getMunicipio() + "," + this.getubicacion().getBarrio() + "]," +
                this.getprecio() + "," + this.getInstalacion();


    }
}

