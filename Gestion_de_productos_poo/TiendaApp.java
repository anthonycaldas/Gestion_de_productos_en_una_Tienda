import java.util.Scanner;

public class TiendaApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRO DE PRODUCTOS ===");

        Tienda tienda = new Tienda(2);

        for (int i = 0; i < 2; i++) {

            System.out.println("\nProducto #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();

            sc.nextLine(); // limpiar buffer

            Producto p = new Producto(nombre, precio, cantidad);
            tienda.agregarProducto(i, p);
        }

        tienda.mostrarInventario();
    }
}
