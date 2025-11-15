public class Main {
    public static void main(String[] args) {
        Departamento dp1=new Departamento("Recursos Humanos", "Administración");
        Departamento dp2=new Departamento("Desarrollo", "Tecnología");

        dp1.agregarEmpleado(new Empleado("Maria", "Secretaria", 3500));
        dp1.agregarEmpleado(new Empleado("Jorge", "Jefe", 7300));
        dp1.agregarEmpleado(new Empleado("Marco", "Tecnico", 2700));
        dp1.agregarEmpleado(new Empleado("Juan", "Asistente", 3000));
        dp1.agregarEmpleado(new Empleado("Laura", "Analista", 4300));
        dp1.mostrarEmpleados();
        dp2.mostrarEmpleados();
        dp1.cambioSalario(6000);
        System.out.println("\nDespués de cambiar salarios:");
        dp1.mostrarEmpleados();

        System.out.println("\n¿Empleado en común? " + dp1.veriEmpleadoComun(dp2));

        dp2.moverEmpleados(dp1);
        System.out.println("\nDespués de mover empleados:");
        dp1.mostrarEmpleados();
        dp2.mostrarEmpleados();
    }   
}
