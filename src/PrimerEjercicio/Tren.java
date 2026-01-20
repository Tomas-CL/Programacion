package PrimerEjercicio;

/**
 *
 * @author usuario
 */
public class Tren extends Transporte {
    private  int numeroVagones;

    public Tren(int capacidad, int velocidadMax,int numeroVagones) {
        super(capacidad, velocidadMax);
        this.numeroVagones = numeroVagones;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }
    
    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nTipo: tren" +
                "\nVagones: " + numeroVagones;
    }
    
}
