package SegundoEjercicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n===Sistema de zoológico===\n");
        String nombre, habitat, tipoPelaje;
        int logAlas;
        int opcion, opcion2, listar;
        int selva = 0, sabana = 0, acuario = 0;
        boolean salir = false;
        ArrayList<Animal> animales = new ArrayList<>();

        do {
            System.out.println("\n===Menu===\n"
                    + "1.  Registrar animales\n"
                    + "2.  Listar todos los animales\n"
                    + "3.  Mostrar la cantidad total de animales\n"
                    + "4.  Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Selecciona el tipo de animal\n"
                            + "1.  Mamifero\n"
                            + "2.  Ave\n");
                    System.out.print("Elige una opcion: ");
                    opcion2 = teclado.nextInt();
                    teclado.nextLine();
                    
                    if (opcion2 == 1) {
                        System.out.print("Escribe el nombre: ");
                        nombre = teclado.nextLine();
                        
                        System.out.print("Dame el habitat: ");
                        habitat = teclado.nextLine();
                        
                        System.out.print("Dime el tipo de pelaje: ");
                        tipoPelaje = teclado.nextLine();
                        
                        Mamifero mamifero = new Mamifero(nombre, habitat, tipoPelaje);
                        animales.add(mamifero);
                        System.out.println("Mamífero registrado correctamente.\n");
                        
                    } else if (opcion2 == 2) {
                        System.out.println("Escribe el nombre: ");
                        nombre = teclado.nextLine();
                        
                        System.out.println("Dame el habitad: ");
                        habitat = teclado.nextLine();
                        
                        System.out.println("Dime la longitud de alas: ");
                        logAlas = teclado.nextInt();
                        teclado.nextLine();
                        
                        Ave ave = new Ave(nombre, habitat, logAlas);
                        animales.add(ave);
                        System.out.println("Ave registrada correctamente.\n");
                        
                    } else {
                        System.out.print("Opcion incorrecta: ");
                    }
                    break;
                case 2:
                    System.out.println("Selecciona el tipo de animal\n"
                            + "1.  Mamifero\n"
                            + "2.  Ave\n");
                    System.out.print("Elige una opcion: ");
                    listar = teclado.nextInt();
                    teclado.nextLine();
                    
                    for (int i = 0; i < animales.size(); i++) {
                        if (listar == 1 && animales.get(i).getTipo().equals("Mamifero")) {
                            System.out.println(animales.get(i));
                        } else if (listar == 1 && animales.get(i).getTipo().equals("Ave")) {
                            System.out.println(animales.get(i));
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < animales.size(); i++) {
                        if (animales.get(i).getHabitat().equalsIgnoreCase("selva")) {
                            selva++;
                        } else if (animales.get(i).getHabitat().equalsIgnoreCase("sabana")) {
                            sabana++;
                        } else if (animales.get(i).getHabitat().equalsIgnoreCase("acuario")) {
                            acuario++;
                        }
                        System.out.println("Selva: "+ selva);
                        System.out.println("Sabanna: "+ sabana);
                        System.out.println("Acuario: "+ acuario);
                    }
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
