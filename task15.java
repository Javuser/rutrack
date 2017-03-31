package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,r,p;
        c = scanner.nextInt();
        b = scanner.nextInt();
        a = (float) Math.sqrt(c*c-b*b);
        p = (a+b+c)/2;
        r = (float)Math.sqrt((((p-a)*(p-b)*(p-c)))/p);
        System.out.println(a);
        System.out.println(r);

    }
}
