package PrimerEjercicio;

/**
 *
 * @author usuario
 */
public class Autobus extends Transporte {

    private int rutasAsignadas;

    public Autobus(int capacidad, int velocidadMax, int rutasAsignadas) {
        super(capacidad, velocidadMax);
        this.rutasAsignadas = rutasAsignadas;
    }

    public int getRutasAsignadas() {
        return rutasAsignadas;
    }

    public void setRutasAsignadas(int rutasAsignadas) {
        this.rutasAsignadas = rutasAsignadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Autobus" +
                "\nRutas asignadas: " + rutasAsignadas;
    }
    
    
    
    
}
