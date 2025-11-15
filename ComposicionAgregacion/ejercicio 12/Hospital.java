import java.util.ArrayList;
public class Hospital {
    private String nombre;
    private ArrayList <Doctor> doctores;
    
    public Hospital(String nombre){
        this.nombre=nombre;
        this.doctores=new ArrayList<>();
    }
    public void agregarDoctor(Doctor doctor){
        doctores.add(doctor);
    }
    public void mostrarDoctores() {
    System.out.println("Doctores en " + nombre + ":");
    for (int i = 0; i < doctores.size(); i++) {
        System.out.println((i + 1) + ". " + doctores.get(i));
    }
    System.out.println();
}


}
