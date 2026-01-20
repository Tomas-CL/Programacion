package SegundoEjercicio;

/**
 *
 * @author usuario
 */
public class Ave extends Animal {
    private double logAlas;

    public Ave(String nombre, String habitad, double logAlas) {
        super(nombre, habitad, "Ave");
        this.logAlas = logAlas;
    }

    public double getLogAlas() {
        return logAlas;
    }

    public void setLogAlas(int logAlas) {
        this.logAlas = logAlas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Ave" + 
                "\nLogitud de Alas:" + logAlas;
    }
    
    
}
