package packTest;

import packZona.Ubicacion;

public class UbicacionTest {

    public static void main (String[] args) {
        Ubicacion donostiaAntiguo, donostiaGros;
        //Uso de constructores
        donostiaAntiguo=new Ubicacion("Donostia", "Antiguo");
        donostiaGros=new Ubicacion("Donostia", "Gros");

        //Prueba del metodo toString
        System.out.println("El objeto donostiaAntiguo en modo String debe quedar [Donostia,Antiguo]: " +
                donostiaAntiguo.toString());
        System.out.println("El objeto donostiaGros en modo string debe quedar [Donostia,Gros] " +
                donostiaGros.toString());

        //Prueba del metodo equals
        Ubicacion donostiaAntiguo2=new Ubicacion("Donostia", "Antiguo");
        System.out.println("Donostia Antiguo y Donostia Gros son iguales? " +
                donostiaAntiguo2.equals(donostiaGros));
        System.out.println("Donostia Antiguo y Donostia Antiguo son iguales? " +
                donostiaAntiguo.equals(donostiaAntiguo2));

        //Prueba del metodo mismoMunicipio
        Ubicacion urretxuIparragirre=new Ubicacion("Urretxu", "Iparragirre");
        System.out.println("Donostia Antiguo y Donostia Gros estan en el mismo municipio. "+
                "El resultado debe ser true y el resultado es " + donostiaAntiguo.mismoMunicipio(donostiaGros));
        System.out.println("Donostia Antiguo y Urretxu Iparragirre no estan en el mismo municipio. "+
                "El resultado debería ser false y es " + donostiaAntiguo.mismoMunicipio(urretxuIparragirre));

    }

}