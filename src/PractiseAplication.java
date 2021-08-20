import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;

        //Enter the 3 numbers
        System.out.println("Ingrese un número");
        num1 = input.nextInt();

        System.out.println("Ingrese otro número");
        num2 = input.nextInt();

        System.out.println("Ingrese un último número");
        num3 = input.nextInt();

        //Calculate total
        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Hay almenos 2 números repetidos");
        } else {
            System.out.println("No hay números repetidos");
        }
    }
}
