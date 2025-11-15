public class Charla {
    private String lugar;
    private String nomCharla;
    private Speaker s;
    private int np;
    private Participante P[];

    public Charla (String lugar, String nomCharla,  String nombre, String apellido, int edad, int ci, String especialidad){
        this.lugar=lugar;
        this.nomCharla=nomCharla;
        this.s=new Speaker(nombre, apellido, edad, ci, especialidad);
        this.np=0;
        this.P=new Participante[50];
    }
    public String getLugar(){
        return lugar;
    }
    public String getNomCharla(){
        return nomCharla;
    }
    public Speaker getS(){
        return s;
    }
    public int getNp() {
        return np;
    }
    
    public void agregarParticipante(Participante p){
        if (np<P.length){
            P[np]=p;
            np++;
        }
    }
    public Participante getParticipante(int i) {
        if (i >= 0 && i < np) {
            return P[i];
        }
        return null;
    }
    public void mostrarParticipante(){
        for (int i=0;i<np;i++){
            System.out.println("Nombre: " +P[i].getNombre()+" Apellido: "+P[i].getApellido()+"  Edad: "+P[i].getEdad()+"   CI: "+P[i].getCi()+" Numero de Ticket "+P[i].getNroTicket());
        }
    }
    public boolean VeriPersona(String nombre, String apellido) {
        
        if (s.getNombre().equalsIgnoreCase(nombre) || s.getApellido().equalsIgnoreCase(apellido)) {
            return true;
        }

        for (int i = 0; i < np; i++) {
            if (P[i].getNombre().equals(nombre) ||
                P[i].getApellido().equals(apellido)) {
                return true;
            }
        }
        return false;
    }
    public boolean eliPorCi(int cix){
        boolean encontrado=false;
        if (s!=null&&s.getCi()==cix){
            s=null;
            encontrado= true;
            System.out.println("se elimino al Speaker con ci: "+ cix);
        }
        return false;
    }
}
