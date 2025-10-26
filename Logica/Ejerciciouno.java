public class Ejerciciouno {

    public static void main(String[] args) {
        /*
         * Operadores
         */

        // Operadores de aritmeticos
        System.out.println("---Operadores Aritmetricos--- ");
        int suma = 5 + 8;
        int resta = 5 - 8;
        int multiplicacion = 5 * 8;
        int dividicion = 5 / 8;
        int resto = 5 % 8;
        System.out.println("Suma: " + suma + "|" + " Resta: " + resta + "|" + " Mlutiplicacion: " + multiplicacion +
                "|" + " Divicion: " + dividicion + "|" + " Resto: " + resto);
        System.out.println("----------------------------");

        // Operadores de asignacion
        System.out.println("---Operadores de Asignacion---");
        int b = 5; // Guarda un valor
        System.out.println("Guarda un valor en x " + b);
        System.out.println("Esto sumaria x += 3 que seria lo mismo que x = x + 3 = " + (b += 3));
        System.out.println("Esto restaria x -= 3 que seria lo mismo que x = x - 3 = " + (b -= 3));
        System.out.println("Esto multiplicaria x *= 3 que seria lo mismo que x = x * 3 = " + (b *= 3));
        System.out.println("Esto dividiria x /= 3 que seria lo mismo que x = x / 3 = " + (b /= 3));
        System.out.println("Esto mostraria el resto x %= 3 que seria lo mismo que x = x % 3 = " + (b %= 3));
        System.out.println("---------------------------------------------------------------");

        // Operadores de incremento y decremento
        System.out.println("---Operadores de incremento y decremento---");
        int a = 5;
        System.out.println("Esto incrementraria la variable a en 1 = " + (a++));
        System.out.println("Imprime el resultado de a++ = " + a);
        System.out.println("Esto incrementraria en 1 y luego usa la variable = " + (++a));
        int r = 3;
        System.out.println("Esto decrementaria la variable r en 1 = " + (r--));
        System.out.println("Imprime el resultado de i-- = " + r);
        System.out.println("Esto decrementaria en 1 y luego usa la variable = " + (--r));
        System.out.println("---------------------------------------");

        // Operadores de comparacion
        System.out.println("---Operadores de Comparacion---");

        System.out.println("Igualdad: 10 == 2 es " + (10 == 2));
        System.out.println("Desilgualdad: 10 != 2 es " + (10 != 2));
        System.out.println("Mayor que: 10 > 2 es " + (10 > 2));
        System.out.println("Menor que: 10 < 2 es " + (10 < 2));
        System.out.println("Mayor o igual: 10 >= 2 es " + (10 >= 2));
        System.out.println("Menor o igual: 10 <= 2 es " + (10 <= 2));
        System.out.println("--------------------------------------");

        // Operadores logicos
        System.out.println("AND: 10 + 2 == 12 && 5 - 5 == 0 " + ((10 + 2 == 12) && (5 - 5 == 0)));
        System.out.println("OR: 10 + 2 == 12 || 5 - 5 == 0 " + ((10 + 2 == 15) || (5 - 5 == 0)));
        System.out.println("NOT: ! 10 + 4 == 5 " + (!!(10 + 4 == 5)));
        System.out.println("------------------------------");

        // Operaores de bits
        int bitA = 4; // 0100 en binario
        int bitB = 6; // 0110 en binario
        System.out.println("AND: bitA & bitB = " + (bitA & bitB)); // 0100
        System.out.println("OR: bitA | bitB = " + (bitA | bitB)); // 0110
        System.out.println("XOR: bitA ^ bitB = " + (bitA ^ bitB)); // 0010
        System.out.println("NOT: ~bitA = " + (~bitA));
        System.out.println("Desplazamiento a la izquierda: " + (bitA << 1));
        System.out.println("Desplazamiento a la derechaa: " + (bitB >> 1));
        System.out.println("------------------------------");

        /*
         * Estruturas de control
         */

        // Metotodos Condicionales

        int c = 8;

        if (c > 7) {
            System.out.println("El número " + c + " es mayor que 7");
        } else {
            System.out.println("El número " + c + " no es mayor que 7");
        }

        switch (c) {
            case 9:
                System.out.println(" El valor es " + c);
                break;
            case 7:
                System.out.println("El valor no es " + c);
                break;
            default:
                System.out.println("Opción invalida");
        }
        System.out.println("-----------------------------");

        // Metodos Iterativas

        System.out.println("Bucle for");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        /*System.out.println("Bucle infinito");
        int i = 0;
        while (i <= 10) {
            System.out.println("t = " + t);
        */
        System.out.println("Bucle while");
        int t = 0;
        while (t <= 50) {
            System.out.println("t = " + t);
            t++;
        }
        System.out.println("bucle do-while");
        int num = 8;
        do {
            System.out.println("num es " + num);
            num++;
        } while (num < 7);

        // Manejo de  exepciones
        try { // Esto comprueba si hay fallo
             int resultado = 10 / 0;
            System.out.println("Resultado " +resultado);
        } catch (ArithmeticException e) { // Si hay fallo, se detiene aquí
            System.out.println("Error: divicion entre 0");
        } finally{ // Esto se ejecuta siempre haya fallo o no
            System.out.println("Bloque finally ejecutado");
        }

        /*
         * Ejercicio Extra
         */
        System.out.println("---Ejercicio Extra---");
        for (int i = 10; i <= 55; i++) {
            if(i %2 == 0  && i !=16 && i%3 !=0){
                System.out.println(i);
            }
            
        }

    }
}
