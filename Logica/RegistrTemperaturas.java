import java.util.Scanner;

public class RegistrTemperaturas {

    public static void array(int n) {
        int array[] = new int[n];
        for (int i = 0; i <= array.length; i++) {
            System.out.println(i);
        }
        return;
    }

    public static void main(String[] args) {
        int cantidad;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingese una cantidad: ");
        cantidad =teclado.nextInt();

        array(cantidad);

        teclado.close();

    }
}
