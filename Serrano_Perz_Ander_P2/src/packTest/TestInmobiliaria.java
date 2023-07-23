package packTest;

import packInmueble.*;
import packZona.*;

import java.util.ArrayList;

public class TestInmobiliaria {
    static Agencia agencia = Agencia.getInstance();
    public static void main(String[] args) {
        // Crear objetos de prueba
        Zona zona1 = new Zona("Municipio1", "Barrio1", 500);
        Zona zona2 = new Zona("Municipio2", "Barrio2", 800);

        Garajes inmueble1 = new Garajes("Referencia1", "Municipio1", "Barrio1", 120,70);
        Locales_comerciales inmueble2 = new Locales_comerciales("Referencia2", "Municipio1", "Barrio1", "Restaurante",90);
        Bajos inmueble3 = new Bajos("Referencia3","Municipio1", "Barrio1",4,2,true,120);
        // ... crear más objetos de prueba según la jerarquía de clases



        // Agregar inmuebles a la agencia
        agencia.addInmueble(inmueble1);
        agencia.addInmueble(inmueble2);
        agencia.addInmueble(inmueble3);
        // ... agregar más inmuebles a la agencia

        // Prueba de métodos de consulta y recogida de valores
        System.out.println("Información del inmueble 1:");
        System.out.println("Referencia: " + inmueble1.getReferenciaCastral());
        System.out.println("Municipio: " + inmueble1.getZona1().getubicacion().getMunicipio());
        System.out.println("Barrio: " + inmueble1.getZona1().getubicacion().getBarrio());


        // Prueba del cálculo de precio de tasación
        double precioTasacion1 = inmueble1.getTasacion();
        double precioTasacion2 = inmueble2.getTasacion();
        double precioTasacion3 = inmueble3.getTasacion();
        System.out.println("Precio de tasación del inmueble 1: " + precioTasacion1);
        System.out.println("Precio de tasación del inmueble 2: " + precioTasacion2);
        System.out.println("Precio de tasación del inmueble 3: " + precioTasacion3);

        // Ordenar los inmuebles por precio de tasación utilizando el método de la Agencia
        agencia.ordenarPorPrecio();

        // Obtener la lista de inmuebles ordenados
        ArrayList<Inmueble> listaInmueblesOrdenados = agencia.get_listainmueble2();

        System.out.println("Lista de inmuebles ordenados por precio de tasación:");
        for (Inmueble inmueble : listaInmueblesOrdenados) {
            System.out.println(inmueble.getReferenciaCastral() + ": " + inmueble.getTasacion());
        }

        // Prueba de mostrar los dos primeros bajos con barbacoa en un municipio
        System.out.println("Dos primeros bajos con barbacoa en Municipio1:");
        agencia.mostrarDosPrimerosBajosConBarbacoa("Municipio1");

        // Prueba de mostrar información de todas las viviendas
        System.out.println("Información de todas las viviendas:");
        agencia.mostrarInformacionViviendas();



        // Prueba de eliminación de una zona
        System.out.println("Eliminando la zona Municipio1 - Barrio1...");
        agencia.eliminarZona("Municipio1", "Barrio1");






    }
}
