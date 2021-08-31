//Práctico 3
public class PractiseAplication {
    static double Pi = 3.14;
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
        System.out.println(areaCirculo(5));*/
        //Ejercicio 10
        System.out.println(areaParalelogramo(10, 4));
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
    }*/
    //10 - Crear un método que permita recibir el alto y ancho de un paralelogramo tipo, y
    //retorne su área.
    public static double areaParalelogramo(double base, double altura) {
        return base*altura;
    }
}
