import java.util.Scanner;

//Práctico 3
public class PractiseAplication {
    static double Pi = 3.14;
    static double IVA = 0.22;

    public static void main(String args[]) {
        /*//Ejercicio 1:
        int doble = calcularDoble(5);
        System.out.println((doble));
        //Ejercicio 2:
        compararCon20(25);
        //Ejercicio 3
        System.out.println(multiplicar(3,4));
        //Ejercicio 4
        System.out.println(sumar(5,9));
        //Ejercicio 5
        System.out.println(multiplicar(5,9.3));
        //Ejercicio 6
        determinarMayor(12,11);
        //Ejercicio 7
        sumitorial(12);
        //Ejercicio 8
        System.out.println(divisiblePor2(12));
        //Ejercicio 9
        System.out.println(areaCirculo(5));
        //Ejercicio 10
        System.out.println(areaParalelogramo(10, 4));
        //Ejercicio 11
        convertirMoneda(25);
        //Ejercicio 12
        System.out.println(calcularIva(110450));
        //Ejercicio 13
        verficarRango(19, 10, 28);
        //Ejercicio 14
        convertirAMillas(14);
        //Ejercicio 15
        System.out.println(sumitorialPar(10));
        //Ejercicio 16
        tipoTriangulo(10,13,12);
        //Ejercicio 17
        System.out.println(factorial(5));
        //Ejercicio 18
        System.out.println(validarNumero("Ingrese un número",
                "Error: Debe ingresar un número dentro del rango",
                10,
                100));*/
        //Ejercicio 19
        System.out.println(valorAbsoluto(-100));
    }
    /*//1 - Escribir un método que reciba un número y retorne su doble
    public static int calcularDoble(int num) {
        return num*2;
    }
    //2 - Método que reciba un número entero e imprima en pantalla en caso de ser mayor a 20, “Es mayor a 20”.
    //De lo contrario, imprimir “No es mayor a 20”
    public static void compararCon20(int num) {
        if (num > 20) {
            System.out.println("Es mayor a 20");
        } else {
            System.out.println("No es mayor a 20");
        }
    }
    //3 - Método que reciba dos enteros y retorne la multiplicación de la misma.
    public static int multiplicar(int x, int y) {
        return x*y;
    }
    //4 - Método que reciba dos números y retorne su suma.
    public static int sumar(int x, int y) {
        return x+y;
    }
    //5 - Método que reciba un número entero y un número double, y retorne su multiplicación
    public static double multiplicar(int x, double y) {
        return x*y;
    }
    //6 - Realizar un método que reciba dos números y retorne el mayor ambos.
    public static void determinarMayor(int x, int y) {
        if (x > y) {
            System.out.println("El mayor es: " + x);
        } else if(y > x){
            System.out.println("El mayor es: " + y);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
    //7 - Crear un método que reciba un número entero n, y muestre en pantalla la suma desde 1
    // hasta ese número n. Ej. Si n es 4, se debe mostrar en pantalla 10.
    public static void sumitorial(int num) {
        int sumitorial = 0;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                sumitorial = sumitorial + i;
            }
        } else {
            System.out.println("Debe ingresar un entero positivo");
        }
        System.out.println("La suma desde 1 hasta " + num + " es de: " + sumitorial);

    }
    //8 - Crear un método que retorne verdadero si y sólo si el número es par,
    // de lo contrario, debe retornar falso.
    public static boolean divisiblePor2(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //9 - Crear un método que permita reciba el radio de un círculo, y retorne
    // su área (radio^2)*PI (utilizar una variable estática para el valor de PI).
    public static double areaCirculo(double radio) {
        return Pi*Math.pow(radio, 2);
    }
    //10 - Crear un método que permita recibir el alto y ancho de un paralelogramo tipo, y
    //retorne su área.
    public static double areaParalelogramo(double base, double altura) {
        return base*altura;
    }
    //11 - Crear un método que reciba un entero, y muestre en pantalla la cantidad de
    //dólares y de euros que representa ese número
    public static void convertirMoneda(int cantidad) {
        System.out.println("La cantidad ingresada equivale a: " + cantidad + "$ dólares");
        System.out.println("La cantidad ingresada equivale a: " + cantidad + "€ euros");

    }
    //12 - Realizar un método llamado calcularIva, que calcule el IVA (22%) dado un número float
    // llamado sueldo, recibido por parámetro. Sugerencia: utilizar variables estáticas.
    public static double calcularIva(float sueldo) {
        return sueldo * IVA;

    }
    //13 - Dado un número, un máximo y un mínimo (recibido por parámetro), retorne verdadero si el número
    // está dentro del máximo y el mínimo. Si el número se encuentra dentro del max y min, el método debe
    // mostrar “El número es válido” sino, se debe retornar, “El numero esta fuera de rango.”
    public static void verficarRango( int num, int min, int max) {
        if ( num >= min && num <= max) {
            System.out.println("El número es válido");
        } else {
            System.out.println("El número esta fuera de rango");
        }
    }
    //14 - Método llamado convertirAMillas, que reciba un entero llamado kilómetros y retorne
    // el equivalente a las millas. Se debe imprimir el valor en millas en pantalla. (1 milla = 1.6 kms).
    public static void convertirAMillas(int kilometros) {
        System.out.println("El valor en millas es de: " + kilometros/1.6 + " mi");
    }
    //15 - Crear un método que retorne la suma de los números pares entre 1 y n, siendo n un parámetro.
    public static int sumitorialPar( int num) {
        int sumaPares = 0;
        for (int i = 2; i <= num; i=i+2) {
           sumaPares = sumaPares + i;
        }
        return sumaPares;
    }
    //16 - Crear un método llamado tipoTriangulo, que dado 3 valores enteros recibidos por parámetro,
    // imprima en pantalla si es escaleno, si es equilátero o isósceles.
    public static void tipoTriangulo (int ladoA, int ladoB, int ladoC) {
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("El triángulo es Equilatero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("El triángulo es Isoceles");
        } else if (ladoA != ladoB || ladoA != ladoC || ladoB != ladoC) {
            System.out.println("El triángulo es Escaleno");
        }
    }
    //17 - Crear un método llamado factorial que reciba un número y retorne el factorial de
    // ese número. Ej. si el número recibido es 5, se deberá retornar el siguiente valor: 5*4*3*2*1.
    // Sugerencia: utilizar un acumulador.
    public static int factorial (int num) {
        int acc = 1;
        for (int i = 1; i <= num; i++) {
            acc = acc * i;
        }
        return acc;
    }
    //18 - Realizar un método llamado validarNumero, que recibe 4 parametros:
    //Un mensaje para mostrar: mensaje
    //Un mensaje de error: error
    //Un entero llamado: mínimo
    //Un entero llamado: máximo
    //Se debe pedir el ingreso de números indicando el mensaje por parámetro para solicitar el número.
    //En caso de que se ingrese un número fuera del rango, mostrar el mensaje de error y pedir que
    //ingrese un número que se encuentre dentro del rango. El método debe retornar un entero
    // que se encuentre dentro del rango comprendido entre el máximo y el mínimo.
    public static int validarNumero(String mensaje, String error, int minimo, int maximo) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int num = 999999999;
        while (num <= minimo || num >= maximo) {
            System.out.println(mensaje);
            num = input.nextInt();
            if (num >= minimo && num <= maximo) {
                break;
            }
            System.out.println(error);
        }
        return num;
    }*/
    //19 - Crear un método llamado valorAbsoluto, que reciba un número y retorne
    //el valor absoluto del mismo. Ej. si se recibe un -4, el método debe retornar 4.
    public static int valorAbsoluto(int num) {
        if (num < 0) {
            return num*-1;
        }
        return num;
    }
}
