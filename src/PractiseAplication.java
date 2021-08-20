import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int num;

        //Enter the 3 numbers
        System.out.println("Ingrese un número");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("El número ingresado es mayor a 0");
        } else {
            System.out.println("El número ingresado es menor o igual a 0");
        }

    }
}
