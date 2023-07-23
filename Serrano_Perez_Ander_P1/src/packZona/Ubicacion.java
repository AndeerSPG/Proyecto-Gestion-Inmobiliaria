package packZona;

/**
 Representa la ubicación de un inmueble, especificando el municipio y el barrio.
 */
public class Ubicacion {
    private String municipio;
    private String barrio;

    /**
     Crea una instancia de Ubicacion con el municipio y el barrio especificados.
     @param pmunicipio El nombre del municipio.
     @param pbarrio El nombre del barrio.
     */
    public Ubicacion(String pmunicipio, String pbarrio){
        municipio = pmunicipio;
        barrio = pbarrio;
    }

    /**
     Obtiene el municipio de la ubicación.
     @return El nombre del municipio.
     */
    public String getMunicipio(){
        return municipio;
    }

    /**
     Establece el municipio de la ubicación.
     @param pmunicipio El nombre del municipio a establecer.
     */
    public void setMunicipio(String pmunicipio){
        municipio = pmunicipio;
    }

    /**
     Obtiene el barrio de la ubicación.
     @return El nombre del barrio.
     */
    public String getBarrio(){
        return barrio;
    }

    /**
     Establece el barrio de la ubicación.
     @param pbarrio El nombre del barrio a establecer.
     */
    public void setBarrio(String pbarrio){
        barrio = pbarrio;
    }

    /**
     Compara si la ubicación es igual a otro objeto.
     @param obj El objeto a comparar.
     @return true si la ubicación es igual al objeto especificado, false en caso contrario.
     */
    public boolean equals(Object obj){
        if(obj instanceof Ubicacion){
            Ubicacion otro = (Ubicacion) obj;
            if(this.barrio == otro.barrio && this.municipio == otro.municipio){
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
     Comprueba si la ubicación tiene el mismo municipio que otra ubicación.
     @param ubi1 La ubicación a comparar.
     @return true si ambas ubicaciones tienen el mismo municipio, false en caso contrario.
     */
    public boolean mismoMunicipio(Ubicacion ubi1){
        if(this.municipio == ubi1.municipio){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     Devuelve una representación en cadena de la ubicación.
     @return La representación en cadena de la ubicación.
     */
    public String toString(){
        return "[ " + this.getMunicipio() +","+ this.getBarrio() + " ]";

    }

}
