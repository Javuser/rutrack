package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,a,b;
        x = scanner.nextInt();
        a = 1- 2*x +3*x*x - 4*x*x*x;
        b = 1 + 2*x +3*x*x + 4*x*x*x;
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
    }
}
