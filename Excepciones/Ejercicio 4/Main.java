public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        try {
            inv.agregarProducto(new Producto("P001", "Teclado", 25.5, 10));
            inv.agregarProducto(new Producto("P002", "Mouse", 15.0, 20));
            inv.agregarProducto(new Producto("P003", "Monitor", 150.0, 5));
        } catch (ProductoInvalidoException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
        inv.mostrarInventario();

        try {
            Producto buscado = inv.buscarProducto("P002");
            System.out.println("Producto encontrado: " + buscado);
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            inv.venderProducto("P001", 3);
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error en venta: " + e.getMessage());
        }

        try {
            inv.venderProducto("P003", 10);
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error en venta: " + e.getMessage());
        }

        try {
            inv.venderProducto("P999", 1);
        } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
            System.out.println("Error en venta: " + e.getMessage());
        }

        inv.mostrarInventario();
    }
}
