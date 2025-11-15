public class Main {
    public static void main(String[] args) {
        Evento e1=new Evento("Congreso de NeuroCiencia");
        Charla c2=new Charla("Auditorio central ", "Neurociencia y Aprendizaje",  "Vanesa", "Ramirez", 28, 458284, "Medicina tecnológica");
        Charla c1=new Charla("Paraninfo Universitario ", "Tecnología en Neurocirugía",  "Lucia", "Medrano", 30, 1245857, "Biotecnología");
        Charla c3=new Charla("Paraninfo Universitario ", "Avances en el tratamiento del Alzheimer",  "Javier ", "Paz", 45, 986854, "Neurología");
        Participante par1= new Participante("Marco", "Costas", 19, 134585, 01);
        Participante par2= new Participante("Andrea", "Estrada", 21, 123696, 02);
        Participante par3= new Participante("Rebeca", "Salas", 22, 985664, 03);
        Participante par4= new Participante("Andres", "Fernandez", 23, 134595, 04);
        Participante par5= new Participante("Elena ", "Torrez", 25, 149658, 05);
        Participante par6 = new Participante("Luis","Duarte", 20, 12458, 06);
        c1.agregarParticipante(par1);
        c1.agregarParticipante(par6);
        c2.agregarParticipante(par5);
        c2.agregarParticipante(par3);
        c2.agregarParticipante(par4);
        c2.agregarParticipante(par1);
        c3.agregarParticipante(par3);
        c3.agregarParticipante(par2);
        e1.agregarCharla(c3);
        e1.agregarCharla(c1);
        e1.agregarCharla(c2);
        e1.mostrarEvento();
        e1.mostrarCharla();
        System.out.println("Promedio");
        e1.promedioEdad();
        System.out.println("Promedio de edad: " + e1.promedioEdad());
        c1.VeriPersona("Luis", "Duarte");
        e1.PersonaEnCharla("Luis", "Duarte");
        e1.ordenarCharlasPorParticipantes(true);
        System.out.println();
        e1.mostrarCharla();
        e1.eliPorCi(458284);
      
    }
}
