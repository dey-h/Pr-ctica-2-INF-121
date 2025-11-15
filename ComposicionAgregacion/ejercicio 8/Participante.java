public class Participante {
    private String nombre;
    private int edad;
    private Facultad facultad;
    private Fraternidad fraternidad;

    public Participante(String nombre, int edad, Facultad facultad, Fraternidad fraternidad){
        this.nombre=nombre;
        this.edad=edad;
        this.facultad=facultad;
        this.fraternidad=fraternidad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Facultad getFacultad() {
        return facultad;
    }
    public Fraternidad getFraternidad() {
        return fraternidad;
    }
}
