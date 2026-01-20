package SegundoEjercicio;

/**
 *
 * @author usuario
 */
public class Animal {

    private String nombre;
    private String habitat;
    private String tipo;

    public Animal(String nombre, String habitad, String tipo) {
        this.nombre = nombre;
        this.habitat = habitad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitad(String habitad) {
        this.habitat = habitad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + 
               "\nHábitat: " + habitat;
    }
}
