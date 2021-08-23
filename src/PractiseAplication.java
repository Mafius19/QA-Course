import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        int i;
        double factorial = 1;
        for (i = 5; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println("El factorial de 5 es: " + factorial);
    }
}
