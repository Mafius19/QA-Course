import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);

        //Enter your name
        System.out.println("Ingrese su nombre");
        String nombre = input.next();

        //Enter year of birth
        System.out.println("Ingrese su año de nacimiento");
        int año = input.nextInt();

        //Calculate age
        int edad = 2021 - año;

        //show name and age
        System.out.println("Su nombre es " + nombre + " y su edad es de " + edad + " años.");
    }

}
