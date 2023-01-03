public class Autobus extends Vehiculo{
    private int numPlazas;
    public Autobus(String marca, String modelo, double precioAlquiler, int numPlazas){
        super(marca, modelo, precioAlquiler);
        setPlazas(numPlazas);
    }
    public void setPlazas(int numPlazas){
        this.numPlazas=numPlazas;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("\t"+"Plazas: " + numPlazas);
    }
}
