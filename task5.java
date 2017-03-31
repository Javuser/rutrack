package Anything;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x,y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(" " + Math.abs(x+y)/2);
        System.out.println(" " + (Math.abs(Math.sqrt(x*y))));
    }
}
