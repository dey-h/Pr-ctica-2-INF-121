public class Main {
    public static void main(String[] args) {
        Ropero r1=new Ropero("madera");
        r1.adicionar(new Ropa("Camisa" , "Algodón"));
        r1.adicionar(new Ropa("Pantalón" , "Jeans"));
        r1.adicionar(new Ropa("Falda" , "Seda"));
        r1.adicionar(new Ropa("Camisa" , "Lino"));
        r1.adicionar(new Ropa("Chaqueta" , "Cuero"));

        r1.mostrar();
        r1.mostrarPorMaterial("Algodón");

        r1.eliminarPorMaterial("Seda");

        r1.eliminarPorTipo("Camisa");

        System.out.println("Después de eliminar prendas:");
        r1.mostrar();
    }
    
}
