package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float v1,v2,t1,t2,t,v;
        v1 = scanner.nextInt();
        v2 = scanner.nextInt();
        t1 = scanner.nextInt();
        t2 = scanner.nextInt();
        v = v1 + v2;
        t = (v1*t1 + v2*t2)/v;
        System.out.println("Установленная температура равен " + t);
        System.out.println("Объем равен " + v);

    }
}
