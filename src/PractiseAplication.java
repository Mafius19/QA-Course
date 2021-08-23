import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int num = 1;
        int acc = 0;
        int ingresados = 0;
        double promedio;

        while (num != 0){
            System.out.println("Ingrese un número");
            num = input.nextInt();
            acc = acc + num;
            ingresados++;
            promedio = (double) acc / ingresados;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        }
    }
}
