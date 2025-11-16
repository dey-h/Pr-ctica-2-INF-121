public class Main {
    public static void main(String[] args) {

        Empresa emp = new Empresa("Tech Solutions");

        emp.agregarEmpleado(new Empleado("Ana", "Ingeniera", 3000));
        emp.agregarEmpleado(new Empleado("Luis", "Analista", 2500));
        emp.agregarEmpleado(new Empleado("Marta", "Gerente", 4000));

        emp.mostrarEmpresa();
        Empleado encontrado = emp.buscarEmpleado("Ana");
        if (encontrado != null)
            System.out.println("Empleado encontrado: " + encontrado);

        emp.eliminarEmpleado("Luis");

        emp.mostrarEmpresa();

        System.out.println("Promedio salarial: " + emp.promedioSalarial());

        emp.empleadosSalarioMayor(2800);
    }
}