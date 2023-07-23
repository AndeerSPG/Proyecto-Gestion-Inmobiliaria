package packTest;
import packZona.*;
public class GestionZonasTest {
    public static void main(String[] args) {
        //TODO crear objetos utilizando el constructor
        GestionZonas gestion = new GestionZonas();
        Zona Zona1 = new Zona("Donostia","Amara",3500);
        Zona Zona2 = new Zona("Donostia","Intxaurrondo",6000);
        //Test del metodo posicionZona ( deberia de devolver -1)
        System.out.println(gestion.posicionZona(Zona1));
        //Test del metodo addZona
        gestion.addZona(Zona1);
        //Test metodo howManyZonas (tiene que devolver 1)
        System.out.println(gestion.howManyZonas()) ;
        //Test metodo removeZona y no exista ninguna(devuelve null)
        System.out.println(gestion.removeZona("Irun","Belasko"));
        //Test metodo removeZona y existe la zona (devuelve la zona)
        System.out.println(gestion.removeZona("Donostia","Amara")) ;
        //Test metodo listaZonas (vacio ya que no hay ninguna zona con ese municipio)
        System.out.println(gestion.listaZonas("Donostia"));
        //Test metodo listaZonas ( las zonas que tengan como municipio el establecido)
        gestion.addZona(Zona1);
        gestion.addZona(Zona2);
        System.out.println(gestion.listaZonas("Donostia"));
        //Test metodo barrioMasCaro (devuelve el barrio mas caro)
        System.out.println(gestion.barrioMasCaro("Donostia"));
        //Test metodo barrioMasCaro (devuelve null)
        System.out.println(gestion.barrioMasCaro("Bilbo"));
        //Test metodo buscarZona(devuelve la zona que este en el barrio y municipio establecido.
        System.out.println(gestion.buscarZona("Amara","Donostia"));
        //Test metodo buscarZona(devuelve null)
        System.out.println(gestion.buscarZona("Amara2","Donostia123"));

    }

}