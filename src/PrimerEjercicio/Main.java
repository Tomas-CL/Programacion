package PrimerEjercicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n===Gestion de transporte público===\n");
        int opcion, opcion2;
        int capacidad, velocidadMax, rutasAsignadas, numeroVagones;
        int capacidadTotal = 0;
        boolean salir = false;
        ArrayList<Transporte> transportes = new ArrayList<>();

        do {
            System.out.println("\n===Menu===\n"
                    + "1.  Añadir transporte\n"
                    + "2.  Lista de informacion\n"
                    + "3.  Capacidad total del transporte disponible\n"
                    + "4.  Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Elige el tipo de transporte");
                    System.out.println("1.  Tren\n"
                            + "2.  Autobus");
                    System.out.print("Elige una opcion: ");
                    opcion2 = teclado.nextInt();
                    if (opcion2 == 1) {
                        System.out.print("Introduce la capacidad: ");
                        capacidad = teclado.nextInt();
                        System.out.print("Introduce la velocidad maxima: ");
                        velocidadMax = teclado.nextInt();
                        System.out.print("Intruduce los vagones: ");
                        numeroVagones = teclado.nextInt();
                        Tren tren = new Tren(capacidad, velocidadMax, numeroVagones);
                        transportes.add(tren);
                    } else if (opcion2 == 2) {
                        System.out.print("Introduce la capacidad: ");
                        capacidad = teclado.nextInt();
                        System.out.print("Introduce la velocidad maxima: ");
                        velocidadMax = teclado.nextInt();
                        System.out.print("Intruduce el numero de rutas: ");
                        rutasAsignadas = teclado.nextInt();
                        Autobus bus = new Autobus(capacidad, velocidadMax, rutasAsignadas);
                        transportes.add(bus);
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                    break;
                case 2:
                    for (int i = 0; i < transportes.size(); i++) {
                        System.out.println(transportes.get(i));
                    }
                    break;
                case 3:
                    for (int i = 0; i < transportes.size(); i++) {
                        capacidadTotal += transportes.get(i).getCapacidad();

                    }
                    System.out.println("Capacidad total: " + capacidadTotal);
                    break;
                case 4:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (!salir);

    }

}
