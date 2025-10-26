import java.util.Scanner;

public class Ejerciciodos {

    /*
    * Funciones definidas por el usuario
    */

    // Simple
    public static void mesaje(){
        System.out.println("!Hola, Java¡");
    }

    // Con retorno
    public static int suma(int a,int b){
        int resultado = b + a;
        if (resultado == 30) {
            mesaje(); 
        }else
        System.out.println("adiós");
        return resultado;
    }   
        
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1=teclado.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2= teclado.nextInt();

       suma(num1, num2);
        

        
        
    }
}