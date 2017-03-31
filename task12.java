package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,s;
        a = scanner.nextInt();
        s =(float)(a*a*Math.sqrt(3))/4;
        System.out.println(" " + s);
    }
}
