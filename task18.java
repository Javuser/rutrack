package Anything;

import java.util.Scanner;

import static java.lang.Math.sin;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a;
        double b;
        float c;
        float x;
        float y;
        float z;
        float r;
        x =  scanner.nextFloat();
        y =  scanner.nextFloat();
        z =  scanner.nextFloat();
        r  = scanner.nextFloat();
        a = (float) (2*r* sin(x));
        b = (float) (2*r* sin(y));
        c = (float) (2*r* sin(z));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
