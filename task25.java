package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1,x2,y1,y2,x3,y3,AB,BC,AC,P,p,s;
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y1 = scanner.nextInt();
        y2 = scanner.nextInt();
        y3 = scanner.nextInt();
        AB = (float)Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        BC = (float)Math.sqrt((Math.pow(x3-x2,2)+Math.pow(y3-y2,2)));
        AC = (float)Math.sqrt((Math.pow(x3-x1,2)+Math.pow(y3-y1,2)));
        P = AC +BC +AB;
        p = (AC +BC +AB)/2;
        s = (float)Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
        System.out.println("Периметр равен: " + P);
        System.out.println("Площадь равен: " + s);


    }
}
