import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,num4,suma;

        //Enter the 4 numbers
        System.out.println("Ingrese un número");
        num1 = input.nextInt();

        System.out.println("Ingrese otro número");
        num2 = input.nextInt();

        System.out.println("Ingrese otro número");
        num3 = input.nextInt();

        System.out.println("Ingrese un último número");
        num4 = input.nextInt();

        //Calculate total
        suma = num1 + num2 + num3 + num4;

        if (suma < 0) {
            suma = suma * -1;
        }
        System.out.println("El valor absoluto de la suma es: " + suma);
    }
}
