public class Main {
    public static void main(String[] args) {
    
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);
        cuenta.mostrarInfo();

        try {
            cuenta.depositar(500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en depósito: " + e.getMessage());
        }

        try {
            cuenta.depositar(-200);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en depósito: " + e.getMessage());
        }

        cuenta.mostrarInfo();

        try {
            cuenta.retirar(300);
        } catch (FondosInsuficientesException e) {
            System.out.println("Error en retiro: " + e.getMessage());
        }
        try {
            cuenta.retirar(2000);
        } catch (FondosInsuficientesException e) {
            System.out.println("Error en retiro: " + e.getMessage());
        }

        cuenta.mostrarInfo();
    }
}
