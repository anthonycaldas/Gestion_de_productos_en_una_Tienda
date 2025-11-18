public class Tienda {

    private Producto[] productos;

    public Tienda(int cantidadProductos) {
        productos = new Producto[cantidadProductos];
    }

    public void agregarProducto(int indice, Producto p) {
        productos[indice] = p;
    }

    public void mostrarInventario() {
        double totalGeneral = 0;

        System.out.println("\n=== RESUMEN DE INVENTARIO ===");

        for (Producto p : productos) {
            p.mostrarInfo();
            totalGeneral += p.calcularTotal();
        }

        System.out.println("\nTOTAL GENERAL DEL INVENTARIO: $" + totalGeneral);
    }
}
