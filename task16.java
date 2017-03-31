package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ggg = new Scanner(System.in);
        float l ,pi,s,r;
        pi = (float) 3.14;
        l = ggg.nextInt();
        r = l / (2 * pi);
        s = pi*r*r;
        System.out.println(s);
    }
}
