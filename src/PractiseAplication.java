import java.util.Scanner;

public class PractiseAplication {
    public static void main(String args[]) {
        double i = 0;
        while (i <= 100) {
            if ((i % 9 == 0) && (i % 2 != 0)) {
                System.out.println(i);
            }
            i++;
        }
    }
}
