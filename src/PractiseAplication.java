import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        //Keyboard
        Scanner input = new Scanner(System.in);
        int resultado;

        System.out.println("Ingrese el resultado del examen: ");
        resultado = input.nextInt();

        if (resultado >= 0 && resultado <= 59) {
            System.out.println("En base a tu resultado: " + resultado + " estas ELIMINADO");
        }
        if (resultado >= 60 && resultado <= 79) {
            System.out.println("En base a tu resultado: " + resultado + " estas APROBADO");
        }
        if (resultado >= 80 && resultado <= 100) {
            System.out.println("En base a tu resultado: " + resultado + " estas APROBADO CON EXCELENTE");
        }
        if (resultado < 0 && resultado > 100) {
            System.out.println("Resultado ingresado incorrecto");
        }
    }
}
