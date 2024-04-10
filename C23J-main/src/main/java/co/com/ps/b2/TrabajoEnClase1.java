package co.com.ps.b2;

//Crear un Objeto en java 7 atributos y 3 metodos
//Moto
public class TrabajoEnClase1 {

    // Atributos
    private String marca;
    private String modelo;
    private int cilindrada;
    private String color;
    private double precio;
    private boolean enMarcha;
    private boolean luzEncendida;

    // Constructor
    public TrabajoEnClase1(String marca, String modelo, int cilindrada, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.color = color;
        this.precio = precio;
        this.enMarcha = false; // La moto está apagada inicialmente
        this.luzEncendida = false; // Las luces están apagadas inicialmente
    }

    // Métodos
    public void arrancar() {
        enMarcha = true;
        System.out.println("La moto está en marcha.");
    }

    public void apagar() {
        enMarcha = false;
        System.out.println("La moto está apagada.");
    }

    public void encenderLuces() {
        luzEncendida = true;
        System.out.println("Las luces están encendidas.");
    }
}




