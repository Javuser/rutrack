package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1,x2,y1,y2,s;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        s = (float) Math.sqrt((Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));
        System.out.println("Расстояние равно:" + s);
    }
}
