public class Main {
    public static void main(String[] args) {

        System.out.println("Suma: " + Calculadora.sumar(5, 3));
        System.out.println("Resta: " + Calculadora.restar(5, 3));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(5, 3));

        System.out.println("División: " + Calculadora.dividir(10, 2));

        try {
            System.out.println("División inválida: " + Calculadora.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error en división: " + e.getMessage());
        }

        try {
            int numero = Calculadora.convertirAEntero("123");
            System.out.println("Conversión exitosa: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println("Error de conversión: " + e.getMessage());
        }

        try {
            int numero = Calculadora.convertirAEntero("abc");
            System.out.println("Conversión: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println("Error de conversión: " + e.getMessage());
        }
    }
}
