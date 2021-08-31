//Practico 3
public class PractiseAplication {
    public static void main(String args[]) {
        /*Ejercicio 1:
        int doble = calcularDoble(5);
        System.out.println((doble));*/
        /*Ejercicio 2:
        compararCon20(25);*/
        //Ejercicio 3
        System.out.println(multiplicar(3,4));
    }
    //1 - Escribir un método que reciba un número y retorne su doble
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
}
