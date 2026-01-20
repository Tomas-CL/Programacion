package SegundoEjercicio;

/**
 *
 * @author usuario
 */
public class Mamifero extends Animal {
    private String tipoPelaje;

    public Mamifero(String nombre, String habitat, String tipoPelaje) {
        super(nombre, habitat, "Mamifero");
        this.tipoPelaje = tipoPelaje;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nTipo: Mamifero" +
                "\nPelaje: " + tipoPelaje;
    }
}
