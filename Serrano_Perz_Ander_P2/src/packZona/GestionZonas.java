package packZona;

import java.util.ArrayList;

/**
 * La clase GestionZonas se encarga de administrar y gestionar una lista de zonas.
 */
public class GestionZonas {
    private Zona[] Lista_Zonas; // Array para almacenar las zonas
    private int cont; // Contador para llevar el control del número de zonas

    /**
     * Constructor de la clase GestionZonas.
     * Inicializa el array de zonas y el contador.
     */
    public GestionZonas() {
        Lista_Zonas = new Zona[200];
        cont = 0;
    }

    /**
     * Devuelve la posición de una zona en el array de zonas.
     *
     * @param pzona La zona a buscar.
     * @return La posición de la zona en el array, o -1 si no se encuentra.
     */
    public int posicionZona(Zona pzona) {
        int pos = 0;
        boolean esta = false;
        int i = 0;
        while (i < Lista_Zonas.length && esta == false) {
            if (Lista_Zonas[i] == pzona) {
                pos = i;
                esta = true;
            }
            i++;
        }
        if (esta == false) {
            return -1;
        } else {
            return pos;
        }
    }

    /**
     * Agrega una zona al array de zonas si no está llena y no existe una zona con la misma referencia.
     *
     * @param pzona La zona a agregar.
     */
    public void addZona(Zona pzona) {
        if (cont < 200 && posicionZona(pzona) == -1) {
            Lista_Zonas[cont] = pzona;
            cont++;
        }
    }

    /**
     * Elimina una zona del array de zonas basándose en el municipio y el barrio proporcionados.
     *
     * @param municipio El municipio de la zona a eliminar.
     * @param barrio    El barrio de la zona a eliminar.
     * @return La zona eliminada, o null si no se encontró ninguna zona con el municipio y barrio dados.
     */
    public Zona removeZona(String municipio, String barrio) {
        for (int i = 0; i < cont; i++) {
            if (Lista_Zonas[i].getubicacion().getMunicipio().equals(municipio) && Lista_Zonas[i].getubicacion().getBarrio().equals(barrio)) {
                Zona zonaEliminada = Lista_Zonas[i];
                Lista_Zonas[i] = Lista_Zonas[cont - 1];
                Lista_Zonas[cont - 1] = null;
                cont--;
                return zonaEliminada;
            }
        }
        return null;
    }

    /**
     * Devuelve la cantidad de zonas en el array.
     *
     * @return El número de zonas.
     */
    public int howManyZonas() {
        return cont;
    }

    /**
     * Obtiene una lista de zonas para un municipio dado.
     *
     * @param municipio El municipio para el cual se obtienen las zonas.
     * @return Una lista de zonas del municipio dado.
     */
    public ArrayList<Zona> listaZonas(String municipio) {
        ArrayList<Zona> zonasMunicipio = new ArrayList<Zona>();
        for (int i = 0; i < cont; i++) {
            if (Lista_Zonas[i].getubicacion().getMunicipio().equals(municipio)) {
                zonasMunicipio.add(Lista_Zonas[i]);
            }
        }
        return zonasMunicipio;
    }
    /**
     * Devuelve el barrio más caro en un municipio dado.
     *
     * @param pmunicipio El municipio para el cual se busca el barrio más caro.
     * @return El nombre del barrio más caro en el municipio dado, o null si no se encuentra ningún barrio.
     */
    public String barrioMasCaro(String pmunicipio){
        String a = null;
        Zona zona = null;

        for(int i =0; i < howManyZonas()-1;i++){
            if(Lista_Zonas[i].igualMunicipio(pmunicipio)){
                if(Lista_Zonas[i].masCaro(zona)){
                    zona = Lista_Zonas[i];
                }
            }
        }
        if(zona != null){
            a = zona.getubicacion().getBarrio();
        }
        return a;
    }

    /**
     Busca una zona en la lista de zonas de la gestión de zonas.
     @param pbarrio El nombre del barrio de la zona a buscar.
     @param pmunicipio El nombre del municipio de la zona a buscar.
     @return La zona encontrada, o null si no se encuentra ninguna zona con los criterios especificados.
     */
    public Zona buscarZona(String pbarrio,String pmunicipio){
        Zona zona1=null;
        for(int i=0; i<cont;i++){
            if(Lista_Zonas[i].getubicacion().getBarrio().equals(pbarrio) && Lista_Zonas[i].getubicacion().getMunicipio().equals(pmunicipio)){
                zona1 =Lista_Zonas[i];
            }

        }
        return zona1;
    }

    /**
     Obtiene la lista de zonas almacenadas en la gestión de zonas.
     @return Arreglo de zonas.
     */
    public Zona[] getListazonas() {
        return Lista_Zonas;
    }

}

