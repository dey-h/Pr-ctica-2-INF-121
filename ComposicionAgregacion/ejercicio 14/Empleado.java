public class Empleado {
    private String nombre;
    private String puesto;
    private int salario;

    public Empleado(String nombre, String puesto, int salario){
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getSalario() {
        return salario;
    }
    @Override
    public String toString() {
        return nombre + " - " + puesto + " -" + salario;
    }
}
