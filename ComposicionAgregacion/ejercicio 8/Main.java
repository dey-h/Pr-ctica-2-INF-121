import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    
        Facultad Ingenieria = new Facultad("Ingeniería");
        Facultad CienciasPuras = new Facultad("Ciencias Puras");


        Fraternidad caporales = new Fraternidad("Caporales", "Carlos Pérez");
        Fraternidad tobas = new Fraternidad("Tobas", "María López");

        Ingenieria.agregarFrat(caporales);
        CienciasPuras.agregarFrat(tobas);

        Participante p1 = new Participante("Ana", 20, Ingenieria, caporales);
        Participante p2 = new Participante("Luis", 22, Ingenieria,caporales );
        Participante p3 = new Participante("Sofía", 19, CienciasPuras, tobas);
        Participante p4 = new Participante("Miguel", 21, CienciasPuras, tobas);
        Participante p5 = new Participante("Jorge", 23, CienciasPuras, tobas);
        caporales.registrar(p1);
        caporales.registrar(p2);
        tobas.registrar(p3);
        tobas.registrar(p4);
        tobas.registrar(p5);
        System.out.println("Lista de Participantes ");
        mostrarParticipantes(Ingenieria);
        mostrarParticipantes(CienciasPuras);

        System.out.println("Encargados ");
        mostrarEncargados(Ingenieria);
        mostrarEncargados(CienciasPuras);

        System.out.println("Verificar Participantes");
        verificarParticipante(Ingenieria, CienciasPuras);
    }

    public static void mostrarParticipantes(Facultad facultad) {
        for (Fraternidad f : facultad.getFraternidades()) {
            for (Participante p : f.getParticipantes()) {
                System.out.println("Nombre: " + p.getNombre() + 
                                   ", Edad: " + p.getEdad() + 
                                   ", Fraternidad: " + f.getNombre() +
                                   ", Facultad: " + facultad.getNombre());
            }
        }
    }

    public static void mostrarEncargados(Facultad facultad) {
        for (Fraternidad f : facultad.getFraternidades()) {
            System.out.println("Fraternidad: " + f.getNombre() + 
                               " - Encargado: " + f.getEncargado());
        }
    }

    public static void verificarParticipante(Facultad... facultades) {
        ArrayList<String> nombres = new ArrayList<>();

        for (Facultad fac : facultades) {
            for (Fraternidad frat : fac.getFraternidades()) {
                for (Participante p : frat.getParticipantes()) {
                    if (nombres.contains(p.getNombre())) {
                        System.out.println("El participante " + p.getNombre() + " está en más de una fraternidad.");
                    } else {
                        nombres.add(p.getNombre());
                    }
                }
            }
        }
        System.out.println("no se encontro algun participante en 2 fraternidades");
    }
}
