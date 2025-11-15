import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private ArrayList<Fraternidad>fraternidades;

    public Facultad(String nombre){
        this.nombre=nombre;
        this.fraternidades=new ArrayList<>();
    }
    public void agregarFrat(Fraternidad f){
        fraternidades.add(f);
    }
    public ArrayList<Fraternidad>getFraternidades(){
        return fraternidades;
    }
    public String getNombre() {
        return nombre;
    }

}
