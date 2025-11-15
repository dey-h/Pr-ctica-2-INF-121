public class Main {
    public static void main(String[] args) {
        Doctor d1=new Doctor("Jorge ", " Cardiologia");
        Doctor d2=new Doctor("Luis", " Neurologia");
        Doctor d3=new Doctor("Maria", " Cirujano");
        Doctor d4=new Doctor("Andres", " Pediatria");

        Hospital h1= new Hospital("Hospital Arco Iris");
        Hospital h2= new Hospital("Hospital 12 de Octubre");

        h1.agregarDoctor(d4);
        h2.agregarDoctor(d3);
        h1.agregarDoctor(d1);
        h2.agregarDoctor(d2);
        h1.agregarDoctor(d2);
        h1.mostrarDoctores();
        h2.mostrarDoctores();
    }
    
}
