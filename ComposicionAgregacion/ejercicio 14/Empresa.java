import java.util.ArrayList;
class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;  

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
    public void mostrarEmpresa() {
        System.out.println("Empresa: " + nombre);
        System.out.println("Empleados:");
        for (Empleado e : empleados) {
            System.out.println("- " + e);
        }
        System.out.println();
    }
    public Empleado buscarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
    public boolean eliminarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                empleados.remove(e);
                return true;
            }
        }
        return false;
    }
    public double promedioSalarial() {
        if (empleados.isEmpty()) return 0;

        double suma = 0;
        for (Empleado e : empleados) {
            suma += e.getSalario();
        }
        return suma / empleados.size();
    }
    public void empleadosSalarioMayor(double valor) {
        System.out.println("Empleados con salario mayor a " + valor + ":");
        for (Empleado e : empleados) {
            if (e.getSalario() > valor) {
                System.out.println("- " + e);
            }
        }
        System.out.println();
    }
}