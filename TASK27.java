package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  a, b, c, A, B, C;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        //a * a = ((b * b) + (c * c)) - (2 * b * c * Math.cos(A));
        //b*b = a*a + c*c - 2*a*c*Math.cos(B);
        //c*c = a*a + b*b - 2*a*b*Math.cos(C);
        (A) = (((b * b) + (c * c)) - (a * a)) / (2 * b * c);
        (B) = (((a * a) + (c * c)) - (b * b)) / (2 * a * c);
        (C) = (a * a + b * b - c * c) / (2 * a * b);
        if (a + b > c & b +c > a & a + c > b ) {
            System.out.println(Math.acos(A));
            System.out.println(Math.acos(B));
            System.out.println(Math.acos(C));
        }
        else {
            System.out.println("Error1");
        }
    }
}