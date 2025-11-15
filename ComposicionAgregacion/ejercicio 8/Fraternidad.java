import java.util.ArrayList;

public class Fraternidad{
    private String nombre;
    private String encargado;
    private ArrayList<Participante> participantes;

    public Fraternidad(String nombre, String encargado){
        this.nombre=nombre;
        this.encargado=encargado;
        this.participantes=new ArrayList<>();
    }
    public void registrar(Participante p){
        participantes.add(p);
    }
    public ArrayList<Participante>getParticipantes(){
        return participantes;
    }
    public String getEncargado() {
        return encargado;
    }

    public String getNombre() {
        return nombre;
    }
}