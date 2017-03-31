package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float t,l,g =10,pi;
        pi = (float) 3.14;
        l = scanner.nextInt();
        t = (float)( 2*pi*Math.sqrt(l/g));
        System.out.println(" " + t);

    }

}
