package packTest;
import packZona.Zona;
public class ZonaTest {

    public static void main(String[] args) {
        //TODO crear objetos utilizando diferentes constructores
        Zona Zona1 = new Zona("Donostia","Amara",3500);
        Zona Zona2 = new Zona("Donostia","Intxaurrondo");
        Zona Zona3 = new Zona("Donostia","Amara");
        //TODO probar el metodo equals cuando la instancia actual (la que se ha utilizado para invocar el metodo) es igual a la recibida como parametro
        System.out.println(Zona1.equals(Zona3));
        //TODO probar el metodo equals cuando la instancia actual es distinta a la recibida como parametro
        System.out.println(Zona1.equals(Zona2));
        //TODO probar el metodo masCaro cuando la instancia actual es mas cara que el parametro
        System.out.println(Zona1.masCaro(Zona2));
        //TODO probar el	metodo masCaro cuando la instancia actual NO es mas cara que el parametro
        System.out.println(Zona3.masCaro(Zona1));
        //TODO probar el metodo igualMunicipion cuando la instancia actual y la del parametro pertenecen almismo municipio
        System.out.println(Zona2.igualMunicipio("Donostia"));
        //TODO probar el metodo igualMunicipion cuando la instancia actual y la del parametro NO pertenecen almismo municipio n
        System.out.println(Zona2.igualMunicipio("Irun"));
        //TODO probar el metodo toString
        System.out.println(Zona1.toString());

    }

}
