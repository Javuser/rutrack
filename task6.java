package Anything;

import java.util.Scanner;

public class Main {
//task about triangle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,s;
        a = scanner.nextInt();
        b = scanner.nextInt();
        s = (a*b)/2;
        b = (float) Math.sqrt(a*a+b*b);
        System.out.println(" area is equal " + s);
        System.out.println(" hypotenuse is equal " + b);
    }
}
