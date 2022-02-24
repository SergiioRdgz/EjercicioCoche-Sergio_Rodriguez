public class Coche {
    private String marca;
    private String modelo;
    private int kilometraje;

    public Coche(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String obtenerMarcaCoche(){
        return marca;
    }
    public String obtenerModeloCoche(){
        return modelo;
    }
    public int obtenerKilometraje(){
        return kilometraje;
    }
}
