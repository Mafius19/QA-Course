import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int num1,num2,mayor,menor,i;

        System.out.println("Ingrese un número");
        num1 = input.nextInt();

        System.out.println("Ingrese otro número");
        num2 = input.nextInt();

        if (num1 >= num2) {
            menor = num2;
            mayor = num1;
        } else {
            menor = num1;
            mayor = num2;
        }

        for (i = menor; i < mayor; i++){
            System.out.println(i);
        }
    }
}
