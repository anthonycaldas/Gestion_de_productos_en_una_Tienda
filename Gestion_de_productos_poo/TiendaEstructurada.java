import java.util.Scanner;

public class TiendaEstructurada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el precio unitario: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();

        double total = calcularTotal(precio, cantidad);

        mostrarResumen(nombre, precio, cantidad, total);
    }

    public static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    public static void mostrarResumen(String nombre, double precio, int cantidad, double total) {
        System.out.println("\n=== RESUMEN DE PRODUCTO ===");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + total);
    }
}
