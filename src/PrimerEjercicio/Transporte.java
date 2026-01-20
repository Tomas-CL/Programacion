package PrimerEjercicio;

/**
 *
 * @author usuario
 */
public class Transporte {

    private int capacidad;
    private int velocidadMax;

    public Transporte(int capacidad, int velocidadMax) {
        this.capacidad = capacidad;
        this.velocidadMax = velocidadMax;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    @Override
    public String toString() {
        return "Capacidad: " + capacidad +
               "\nVelocidadMax: " + velocidadMax;
    }

}
