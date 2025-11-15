public class Empleado {
    private String nombre;
    private String cargo;
    private int sueldo;

    public Empleado(String nombre, String cargo, int sueldo){
        this.nombre=nombre;
        this.cargo=cargo;
        this.sueldo=sueldo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCargo(){
        return cargo;
    }
    public int getSueldo(){
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
    }
    @Override
    public String toString() {
        return nombre + " (" + cargo + ") - Sueldo: " + sueldo;
    }

}
