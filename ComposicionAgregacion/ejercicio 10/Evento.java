public class Evento {
    private String nombre;
    private int nc;
    private Charla C[];

    public Evento(String nombre){
        this.nombre=nombre;
        this.nc=0;
        this.C=new Charla[50];
    }
    public void agregarCharla(Charla c){
        if (nc<C.length){
            C[nc]=c;
            nc++;
        }
        else{
            System.out.println("no se pudo agregar");
        }
    }
    public void mostrarCharla() {
        for (int i = 0; i < nc; i++) {
            Charla charla = C[i];
            Speaker sp = charla.getS();

            System.out.println("Lugar: " + charla.getLugar() +" Nombre de la charla: " + charla.getNomCharla() +" Speaker: " + sp.getNombre() + " " 
            + sp.getApellido() +" Edad: " + sp.getEdad() +" CI: " + sp.getCi() +" Especialidad: " + sp.getEspecialidad() +" Participantes: " + charla.getNp());
            System.out.println(" Participantes:");
            charla.mostrarParticipante(); 
        }
    }
    public double promedioEdad() {
    int suma = 0;
    int cont = 0;

    for (int i = 0; i < nc; i++) {         
        Charla charla = C[i];
        for (int j = 0; j < charla.getNp(); j++) {  
            Participante p = charla.getParticipante(j); 
            if (p != null) {
                suma += p.getEdad();
                cont++;
            }
        }
    }

    if (cont == 0)
        return 0;

    return (double)suma / cont;  
}


    public void PersonaEnCharla(String nombre, String apellido) {
        boolean encontrada = false;

        for (int i = 0; i < nc; i++) {
            if (C[i].VeriPersona(nombre, apellido)) {
                System.out.println(nombre + " " + apellido + " está en la charla: "+C[i].getNomCharla());
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println(nombre + " " + apellido + " no participa en ninguna charla.");
        }
    }
    public boolean eliPorCi(int cix){
        for (int i=0;i<nc;i++){
            if(C[i].eliPorCi(cix)){
                System.out.println("speaker con ci:+ "+cix +"eliminado");
                return true;
            }
        }
        return false;
    }
    public void ordenarCharlasPorParticipantes(boolean descendente) {
        for (int i = 0; i < nc - 1; i++) {
            for (int j = i + 1; j < nc; j++) {
                boolean condicion = descendente 
                ?  (C[i].getNp() < C[j].getNp())   
                :   (C[i].getNp() > C[j].getNp());  

                if (condicion) {
                    Charla temp = C[i];
                    C[i] = C[j];
                    C[j] = temp;
                }
            }
        }
    }

    public void mostrarEvento(){
        System.out.println("Nombre del evento:" +nombre);
    }
}
