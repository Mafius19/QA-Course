//Práctico 3
public class PractiseAplication {
    public static void main(String args[]) {
        /*Ejercicio 1:
        int doble = calcularDoble(5);
        System.out.println((doble));*/
        /*Ejercicio 2:
        compararCon20(25);*/
        /*Ejercicio 3
        System.out.println(multiplicar(3,4));*/
        /*Ejercicio 4
        System.out.println(sumar(5,9));*/
        /*Ejercicio 5
        System.out.println(multiplicar(5,9.3));*/
        //Ejercicio 6
        determinarMayor(12,11);
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
    }*/
    // 6 - Realizar un método que reciba dos números y retorne el mayor ambos.
    public static void determinarMayor(int x, int y) {
        if (x > y) {
            System.out.println("El mayor es: " + x);
        } else if(y > x){
            System.out.println("El mayor es: " + y);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}
