package packTest;
import packInmueble.*;

public class GestiónInmobiliariTest {
    public static void main(String[] args) {
        //Se crea un objeto de la clase GestiónInmobiliaria
        GestionInmobiliaria Gestion = new GestionInmobiliaria();

        //metodo incluirInmueble ( añade el inmueble al Arraylist), para comprobar que se han añadido miramos cuantos elementos tiene la lista.(2)
        Inmueble inmueble1 = new Inmueble("1","Donostia","Amara",1500);
        Inmueble inmueble2 = new Inmueble("2","Donostia","Intxaurrondo",1500);

        Gestion.incluirInmueble(inmueble1);
        Gestion.incluirInmueble(inmueble2);
        System.out.println(Gestion.getListaInmueble().size());

        //metodo removeInmueble, para comprobar que se ha eliminado miramos cuantos elementos tiene la lista.(1)

        Gestion.removeInmueble(inmueble2);
        System.out.println(Gestion.getListaInmueble().size());

        //metodo catastroMunicipio ( devolvera un Arraylist con [1,2]
        Gestion.incluirInmueble(inmueble2);
        System.out.println(Gestion.catastroMunicipio("Donostia"));

        //metodo buscarInmueble
        System.out.println(Gestion.buscarInmueble("1"));


    }
}