import java.util.ArrayList;

class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) throws ProductoInvalidoException {
      
        for (Producto prod : productos) {
            if (prod.getCodigo().equalsIgnoreCase(p.getCodigo())) {
                throw new ProductoInvalidoException("El código '" + p.getCodigo() + "' ya existe.");
            }
        }
        if (p.getPrecio() < 0 || p.getStock() < 0) {
            throw new ProductoInvalidoException("Precio o stock no pueden ser negativos.");
        }

        productos.add(p);
    }
    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException("Producto con código '" + codigo + "' no encontrado.");
    }

    public void venderProducto(String codigo, int cantidad)
            throws ProductoNoEncontradoException, StockInsuficienteException {
        Producto p = buscarProducto(codigo);
        if (cantidad > p.getStock()) {
            throw new StockInsuficienteException(
                    "Stock insuficiente para vender " + cantidad + " unidades del producto " + codigo);
        }
        p.setStock(p.getStock() - cantidad);
        System.out.println("Venta realizada: " + cantidad + " unidades de " + p.getNombre());
    }

    public void mostrarInventario() {
        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println();
    }
}
