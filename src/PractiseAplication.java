import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int num,i;

        System.out.println("Ingrese un número");
        num = input.nextInt();

        if (num > 0) {
            for (i = 1; i < num; i++) {
                System.out.println(i);
            }
        } else {
            for (i = 1; i > num; i--) {
                System.out.println(i);
            }
        }
    }
}
