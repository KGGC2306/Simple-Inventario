import java.util.Scanner;
public class SimpleInventario {
    public static void agregarArticulo (String articulo) {

    }

    public static void removerArticulo (int id) {

    }
    public static double obtenerPrecioArticulo (int id) {
        return 0.00;
    }
    public static String obtenerNombreArticulo (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo");
        String nombre = scanner. nextLine();
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

