package packInmueble;

import packZona.GestionZonas;
import packZona.Zona;

import java.util.ArrayList;
import java.util.Collections;


/**
 * La clase Agencia representa una agencia inmobiliaria y gestiona la lista de inmuebles y la relación de características de las zonas.
 */
public class Agencia {
    private GestionInmobiliaria listaInmuebles;
    private GestionZonas listaZonas;
    private static final Agencia instance = new Agencia();

    /**
     * Crea una nueva instancia de la clase Agencia.
     */
    private Agencia() {
        listaInmuebles = new GestionInmobiliaria();
        listaZonas = new GestionZonas();
    }

    public static Agencia getInstance(){
        return instance;
    }

    /**
     * Añade un inmueble a la lista de inmuebles de la agencia.
     * @param inmueble El inmueble a añadir.
     */
    public void addInmueble(Inmueble inmueble) {
        if (listaInmuebles.getListaInmueble().contains(inmueble)) {
            throw new IllegalArgumentException("El inmueble ya existe en la lista");
        }
        listaInmuebles.incluirInmueble(inmueble);
    }

    /**
     * Elimina un inmueble de la lista de inmuebles de la agencia.
     * @param inmueble El inmueble a eliminar.
     */
    public void removeInmueble(Inmueble inmueble) {
        listaInmuebles.removeInmueble(inmueble);
    }

    /**
     * Devuelve en un ArrayList la referencia catastral de todos los inmuebles de un municipio.
     * @param municipio El municipio para el cual se desean obtener los inmuebles.
     * @return ArrayList con las referencias catastrales de los inmuebles del municipio.
     */
    public ArrayList<String> inmueblesPorMunicipio(String municipio) {
        return listaInmuebles.catastroMunicipio(municipio);
    }

    /**
     * Ordena por precio todos los inmuebles de la agencia.
     */
    public void ordenarPorPrecio() {
        Collections.sort(listaInmuebles.getListaInmueble());
    }

    /**
     * Muestra los dos primeros bajos de un municipio que pueden tener barbacoa.
     * @param municipio El municipio para el cual se desean obtener los dos primeros bajos con barbacoa.
     */
    public void mostrarDosPrimerosBajosConBarbacoa(String municipio) {
        int cont=0;
        int i =0;
        while(i<listaInmuebles.getListaInmueble().size() && cont < 2){
            if (listaInmuebles.getListaInmueble().get(i).obtenerMunicipio().equals(municipio)) {
                if(listaInmuebles.getListaInmueble().get(i).getClass() == Bajos.class){
                    Bajos bajo = (Bajos) (listaInmuebles.getListaInmueble().get(i));
                    if(bajo.getBarbacoa() == true){
                        cont++;
                        System.out.println(bajo.toString());

                    }
                }
            }
            i++;
        }
    }

    /**
     * Muestra la información de todas las viviendas y, para las que se pueden alquilar, muestra también su precio de alquiler.
     *
     * @return
     */
    public void mostrarInformacionViviendas() {
        for(int i =0; i< listaInmuebles.getListaInmueble().size();i++){
            if(listaInmuebles.getListaInmueble().get(i) instanceof Viviendas) {
                System.out.println("Informacion del inmueble " + (i + 1));
                System.out.println(listaInmuebles.getListaInmueble().get(i).toString());
            }
        }

    }

    /**
     * Elimina y devuelve la Zona a la que pertenecen un municipio y un barrio.
     *
     * @param pmunicipio El municipio de la zona a eliminar.
     * @param pbarrio    El barrio de la zona a eliminar.
     * @return La zona eliminada, o null si no existe ninguna zona con las características dadas.
     */
    public void eliminarZona(String pmunicipio, String pbarrio) {
        listaZonas.removeZona(pmunicipio,pbarrio);
    }

    /**
     * Devuelve el barrio más caro de un municipio.
     * @param municipio El municipio para el cual se desea obtener el barrio más caro.
     * @return El barrio más caro del municipio.
     */
    public String barrioMasCaro(String municipio) {
        return listaZonas.barrioMasCaro(municipio);
    }

    /**
     * Elimina los inmuebles de un municipio y devuelve la lista actualizada de inmuebles.
     * @param municipio El municipio para el cual se desea eliminar los inmuebles.
     * @return La lista de inmuebles actualizada después de eliminar los inmuebles del municipio.
     */
    public ArrayList<Inmueble> eliminarInmueblesPorMunicipio(String municipio) {
        for(int i =0; i< listaInmuebles.getListaInmueble().size();i++){
            if(listaInmuebles.getListaInmueble().get(i).getZona1().getubicacion().getMunicipio() == municipio){
                listaInmuebles.removeInmueble(listaInmuebles.getListaInmueble().get(i));
            }
        }
        return listaInmuebles.getListaInmueble();
    }
    /**
     * Obtiene la lista de inmuebles de la agencia.
     *
     * @return ArrayList de Inmueble que representa la lista de inmuebles de la agencia.
     */
    public ArrayList<Inmueble> get_listainmueble2(){
        return listaInmuebles.getListaInmueble();
    }

    /**
     * Obtiene la gestión de inmuebles de la agencia.
     *
     * @return GestionInmobiliaria que representa la gestión de inmuebles de la agencia.
     */
    public GestionInmobiliaria get_listainmueble1(){

        return listaInmuebles;
    }

    /**
     * Obtiene la lista de zonas de la agencia.
     *
     * @return Array de Zona que representa la lista de zonas de la agencia.
     */
    public Zona[] get_listazonas2(){
        return listaZonas.getListazonas();
    }

    /**
     * Obtiene la gestión de zonas de la agencia.
     *
     * @return GestionZonas que representa la gestión de zonas de la agencia.
     */
    public GestionZonas get_listazonas1(){
        return listaZonas;
    }





}
