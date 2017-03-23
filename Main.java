package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float h,t;
        int g = 10;
        h = scanner.nextInt();
        t = (float) Math.sqrt((2*h)/g);
        System.out.println(" " + t);

    }
}
