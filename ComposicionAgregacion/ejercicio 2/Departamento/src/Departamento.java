public class Departamento {
    private String nombre;
    private String area;
    private Empleado[] empleados;
    private int cantEmpleados;    

    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new Empleado[10];
        this.cantEmpleados = 0;
    }

    public void agregarEmpleado(Empleado e) {
        if (cantEmpleados < empleados.length) {
            empleados[cantEmpleados] = e;
            cantEmpleados++;
        } else {
            System.out.println("No se pueden agregar más empleados al departamento " + nombre);
        }
    }

    public void mostrarEmpleados() {
        if (cantEmpleados == 0) {
            System.out.println("El departamento " + nombre + " no tiene empleados.");
        } else {
            System.out.println("Empleados del departamento " + nombre + ":");
            for (int i = 0; i < cantEmpleados; i++) {
                System.out.println(" - " + empleados[i]);
            }
        }
    }
    public void cambioSalario(int nuevoSueldo) {
        for (int i = 0; i < cantEmpleados; i++) {
            empleados[i].setSueldo(nuevoSueldo);
        }
    }
    public int getCantEmpleados() {
        return cantEmpleados;
    }
    public Empleado[] getEmpleados() {
        return empleados;
    }
    public boolean veriEmpleadoComun(Departamento otro) {
        for (int i = 0; i < cantEmpleados; i++) {
            for (int j = 0; j < otro.cantEmpleados; j++) {
                if (empleados[i].getNombre().equals(otro.empleados[j].getNombre())) {
                    return true;
                }
            }
        }
        return false;
    }
    public void moverEmpleados(Departamento otro) {
        for (int i = 0; i < otro.cantEmpleados; i++) {
            if (cantEmpleados < empleados.length) {
                empleados[cantEmpleados] = otro.empleados[i];
                cantEmpleados++;
            } else {
                System.out.println("No hay más espacio en " + nombre);
                break;
            }
        }
        otro.cantEmpleados = 0; 
    }
}

