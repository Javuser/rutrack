package Anything;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float r1,r2,r3,r;
        r1 = scanner.nextInt();
        r2= scanner.nextInt();
        r3 = scanner.nextInt();
        r = 1/r1 + 1/r2 +1/r3;
        System.out.println(" " + r);
    }
}
