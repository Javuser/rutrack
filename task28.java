package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,s;
        x = scanner.nextInt();
        s = 2*Math.pow(x,4) - 3*Math.pow(x,3) + 4*Math.pow(x,2) - 5*x +6;
        System.out.println(s);

    }
}
