package Anything;

import java.util.Scanner;

public class task78 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n, i, x;
        x = scanner.nextInt();
        n = 1;
        for (int i = 1; i <= x; i++) {
            n = n * i;
        }
        System.out.println(n);
    }
}
