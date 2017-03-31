package Anything;

import java.util.Scanner;

public class task17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float r ,R,s,s1,s2,pi;
        r = 20;
        pi =(float) 3.14;
        R = scanner.nextFloat();
        s1 = r*r*pi;
        s = R*R*pi;
        s2 =  s - s1;
        System.out.println(s2);

    }
}
