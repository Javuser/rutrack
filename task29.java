package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double x,y,s;
        x = scanner.nextInt();
        y = scanner.nextInt();
        s = 3 *Math.pow(x*y,2) - 2*x*y*y - 7*x*x*y - 4*y*y +15*x*y + 2*x*x - 3*x +10*y +6;
        System.out.println(s);
    }
}
