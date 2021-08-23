import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int num = 1;
        int acc = 0;

        while (num != 0){
            System.out.println("Ingrese un número");
            num = input.nextInt();
            acc = acc + num;
            System.out.println(acc);
        }

    }
}
