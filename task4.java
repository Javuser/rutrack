package Anything;

import java.util.Scanner;

public class task4 {
// task about arithmetic and geometric mean
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x,y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(" " + (x+y)/2);
        System.out.println(" " + Math.sqrt(x*y));
    }
}
