public class Ropero{
    private String  material;
    private int nroRopas;
    private Ropa[] ropas;

    public Ropero(String material){
        this.material=material;
        this.nroRopas = 0;
        this.ropas=new Ropa [50];
    }
    public void adicionar(Ropa r ){
        if(nroRopas<ropas.length){
            ropas[nroRopas]=r;
            nroRopas++;
        }else {
            System.out.println("el ropero está lleno");
        }
    }
    public void eliminarPorMaterial(String mat){
        int i = 0;
        while (i < nroRopas) {
            if (ropas[i].getMaterial().equalsIgnoreCase(mat)) {
                eliminarPosicion(i);
            } else {
                i++;
            }
        }
    }
    public void eliminarPorTipo(String tipo){
        int i = 0;
        while (i < nroRopas) {
            if (ropas[i].getTipo().equals(tipo)) {
                eliminarPosicion(i);
            } else {
                i++;
            }
        }
    }
    private void eliminarPosicion(int pos){
        for (int i = pos; i < nroRopas - 1; i++){
            ropas[i] = ropas[i + 1];
        }
        nroRopas--;
    }
    public void mostrarPorMaterial(String mat){
        System.out.println("Prendas de material " + mat + ":");
        for (int i = 0; i < nroRopas; i++){
            if (ropas[i].getMaterial().equals(mat)){
                System.out.println(" - " + ropas[i]);
            }
        }
    }
    public void mostrarPorTipo(String tipo){
        System.out.println("Prendas de tipo " + tipo + ":");
        for (int i = 0; i < nroRopas; i++){
            if (ropas[i].getTipo().equals(tipo)){
                System.out.println(" - " + ropas[i]);
            }
        }
    }
    public void mostrar(){
        System.out.println("Ropero de " + material + " con " + nroRopas + " prendas:");
        for (int i = 0; i < nroRopas; i++){
            System.out.println(" - " + ropas[i]);
        }
    }
}