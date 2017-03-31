package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,d,n,s,i = 1;
        s=0;
        a = scanner.nextDouble();
        d = scanner.nextDouble();
        n = scanner.nextDouble();
        for(i =1;i<n; i++) {
            s = s + a + (i-1)*d;
        }
        System.out.println(s);
    }
}
