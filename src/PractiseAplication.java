import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        int i;
        int esMultiplo = 0;
        for (i = 10; i <= 70; i++){
            if (((double) i % 3) == 0) {
                esMultiplo++;
            }
        }
        System.out.println("La cantidad de múltiplos de 3 que existen entre el 10 y el 70 son: " + esMultiplo);
    }
}
