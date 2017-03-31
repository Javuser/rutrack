package Anything;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float m1;
        float m2;
        double F;
        float r;
        double G;
        m1 = scanner.nextInt();
        m2 = scanner.nextInt();
        r = scanner.nextInt();
        G = (float) ((float)6.61*(Math.pow(10,-11)));
        F = (float) ((G*m1*m2)/(r*r));
        System.out.println(" " + F);

    }
}
