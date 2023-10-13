import java.util.Scanner;
public class SimpleInventario {
    public static void agregarArticulo(String articulo) {
        if (articulo.length() > 4) {
            System.out.println("Articulo agregado exitosamente");
        } else {
            System.out.println("No se permite este articulo");
        }
    }

    public static void removerArticulo (int id) {
        if (id > 0);
        System.out.println("Removido");

    }
    public static String obtenerPrecioArticulo (String articulo, double precio) {
        double formula = (Math.random() * 5000) + 100;
        if (articulo.startsWith("mar") && precio >= 0.00) {
            return "articulo" + articulo + "Tiene un valor de RD$" + (Math.random() * 5000) + 100;
        } else if (articulo.startsWith("tab") || precio >= 12000.00) {
        return articulo + "Tiene un valor que sobre pasa los 12000.00" + formula;
    } else {
            return "Ninguno de los escnarios pudo aplicar";
        }
    }

    public static String obtenerNombreArticulo (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo");
        String nombre = scanner. nextLine();
        if (nombre.length() > 3) {
        } else {
            return "Error de operacion!";
        }
        System.out.println("Usted ha ingresado el articulo " + nombre);
        return nombre;

    }

    public static void imprimirInventario() {
        Scanner scanner = new Scanner(System. in);
        System.out.println("Ingrese su nombre");
        String usuario = scanner.nextLine();
        System.out.println("Bienvenido " + usuario);
        String articuloExistente = obtenerNombreArticulo();
        System.out.println("Articulo existente " + articuloExistente);
    }
    public static void main(String[] args) {
        imprimirInventario();
    }
}

