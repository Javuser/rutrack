package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s,A,B,r,pi,n;
        r = 13.7;
        pi = 3.14;
        A = scanner.nextInt();
        Math.toDegrees(A);
        s = (pi*r*r*Math.toDegrees(A))/360;
        System.out.println(s);



    }
}
