package packInmueble;
import packZona.Zona;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Clase principal que representa el menú de la Agencia Inmobiliaria.
 */
public class MenuAgencia {

    static Agencia agencia = Agencia.getInstance();
    private static Scanner scanner;

    /**
     * Método principal que ejecuta el menú de la Agencia Inmobiliaria.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */

    public static void main(String[] args) {

        // Creación de objetos Inmueble y Zona
        Garajes inmueble1 = new Garajes("Referencia1", "Municipio1", "Barrio2", 120, 70, 1000);
        Locales_comerciales inmueble2 = new Locales_comerciales("Referencia2", "Municipio1", "Barrio1", "Restaurante", 90);
        Bajos inmueble3 = new Bajos("Referencia3", "Municipio1", "Barrio1", 4, 2, true, 120);
        Apartamento inmueble4 = new Apartamento("Referenmcia4", "Municipio1", "Barrio3", 4, 2, 80, 3, 4500);
        Zona zona1 = new Zona("Municipio1", "Barrio1", 500);
        Zona zona2 = new Zona("Municipio1", "Barrio2", 800);
        // Agregar los objetos Inmueble y Zona a la Agencia
        agencia.addInmueble(inmueble1);
        agencia.addInmueble(inmueble2);
        agencia.addInmueble(inmueble3);
        agencia.addInmueble(inmueble4);
        agencia.get_listazonas1().addZona(zona1);
        agencia.get_listazonas1().addZona(zona2);


        scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Agencia Inmobiliaria");

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");
            System.out.println();

            switch (opcion) {
                case 1:
                    ordenarInmueblesPorTasacion();
                    break;
                case 2:
                    mostrarNumerosCatastrales();
                    break;
                case 3:
                    mostrarInformacionInmueble();
                    break;
                case 4:
                    mostrarBarrioMasCaro();
                    break;
                case 5:
                    mostrarInformacionInmuebles();
                    break;
                case 6:
                    eliminarInmueblesMunicipio();
                    break;
                case 7:
                    mostrarBajosConBarbacoa();
                    break;
                case 8:
                    mostrarChaletConPiscinayJardin();
                    break;
                case 9:
                    mostrarApartamento();
                    break;
                case 10:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Gracias por utilizar la Agencia Inmobiliaria. ¡Hasta pronto!");
    }

    private static void mostrarMenu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. Ordenar Inmuebles por tasación");
        System.out.println("2. Mostrar números catastrales de un municipio");
        System.out.println("3. Mostrar información de un Inmueble");
        System.out.println("4. Mostrar barrio más caro de un municipio");
        System.out.println("5. Mostrar información de todos los Inmuebles");
        System.out.println("6. Eliminar Inmuebles de un municipio y guardar en archivo");
        System.out.println("7. Mostrar Bajos con barbacoa de un municipio");
        System.out.println("8. Mostras Chalets con piscina y jardin de un municipio");
        System.out.println("9. Dado un municipio muestra los apartamentos disponibles");
        System.out.println("10. Salir");
    }

    /**
     * Método para leer un número entero desde la entrada estándar.
     *
     * @param mensaje El mensaje a mostrar al usuario.
     * @return El número entero leído.
     */
    private static int leerEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
            }
        }

        return numero;
    }
    /**
     * Método para ordenar los inmuebles por tasación y mostrarlos por pantalla.
     */
    private static void ordenarInmueblesPorTasacion() {
        agencia.ordenarPorPrecio();
        System.out.println(agencia.toString());
    }

    /**
     * Método para mostrar los números catastrales de los inmuebles de un municipio específico.
     * Se utiliza la entrada estándar para obtener el municipio.
     */
    private static void mostrarNumerosCatastrales() {
        System.out.println("Introduce el municipio:");
        String municipio = scanner.nextLine();
        System.out.println(agencia.inmueblesPorMunicipio(municipio));

    }

    /**
     * Método para mostrar la información de un inmueble específico.
     * Se utiliza la entrada estándar para obtener el número de catastro.
     */
    private static void mostrarInformacionInmueble() {
        System.out.println("Introduce el numero de catastro:");
        String catastro = scanner.nextLine();

        Inmueble inm = agencia.get_listainmueble1().buscarInmueble(catastro);
        System.out.println(inm.toString());
    }

    /**
     * Método para eliminar los inmuebles de un municipio específico y guardarlos en un archivo.
     * Se utiliza la entrada estándar para obtener el municipio.
     */
    private static void eliminarInmueblesMunicipio() {
        System.out.println("Introduce el municipio:");
        String municipio = scanner.nextLine();
        boolean encontrado = false;
        int i = 0;
        FileWriter fs;
        while (i < agencia.get_listainmueble2().size() && !encontrado) {
            if (agencia.get_listainmueble2().get(i).getZona1().getubicacion().getMunicipio().equals(municipio)) {
                try {
                    fs = new FileWriter("Nombrefichero");
                    fs.write(agencia.get_listainmueble2().get(i).toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Método para mostrar el barrio más caro de un municipio específico.
     * Se utiliza la entrada estándar para obtener el municipio.
     */
    private static void mostrarBarrioMasCaro() {
        System.out.println("Introduce el municipio:");
        String municipio = scanner.nextLine();

        System.out.println(agencia.get_listazonas1().barrioMasCaro(municipio));

    }

    /**
     * Método para mostrar la información de todos los inmuebles.
     */
    private static void mostrarInformacionInmuebles() {

        System.out.println(agencia.get_listainmueble2().toString());

    }

    /**
     * Método para mostrar los dos primeros bajos con barbacoa de un municipio específico.
     * Se utiliza la entrada estándar para obtener el municipio.
     */

    private static void mostrarBajosConBarbacoa() {
        System.out.println("Introduce el municipio:");
        String municipio = scanner.nextLine();

        agencia.mostrarDosPrimerosBajosConBarbacoa(municipio);
    }

    /**
     * Método para mostrar los chalets con piscina y jardín de un municipio específico.
     * Se utiliza la entrada estándar para obtener el municipio.
     */
    private static void mostrarChaletConPiscinayJardin() {
        System.out.println("Introduce el municipio:");
        String municipio = scanner.nextLine();

        int cont = 0;
        int i = 0;
        while (i < agencia.get_listainmueble2().size() && cont < 2) {
            if (agencia.get_listainmueble2().get(i).obtenerMunicipio().equals(municipio)) {
                if (agencia.get_listainmueble2().get(i).getClass() == Chalet.class) {
                    Chalet chalet = (Chalet) (agencia.get_listainmueble2().get(i));
                    if (chalet.getPiscina() == true && chalet.getJardin() == true) {
                        cont++;
                        System.out.println(chalet.toString());

                    }
                }
            }
            i++;
        }
    }

    /**
     * Método para mostrar los apartamentos de un municipio específico.
     * Se utiliza la entrada estándar para obtener el municipio.
     */
    private static void mostrarApartamento() {
        System.out.println("Introduce el municipio:");
        String municipio = scanner.nextLine();

        int cont = 0;
        int i = 0;
        while (i < agencia.get_listainmueble2().size()) {
            if (agencia.get_listainmueble2().get(i).obtenerMunicipio().equals(municipio)) {
                if (agencia.get_listainmueble2().get(i).getClass() == Apartamento.class) {
                    Apartamento apartamento = (Apartamento) (agencia.get_listainmueble2().get(i));
                    System.out.println(apartamento.toString());
                }
            }
            i++;
        }

    }


}
