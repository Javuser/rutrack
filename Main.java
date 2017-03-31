package Anything;

import java.util.Scanner;

public class Main {
// task about cube
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt(),s1,s2;
        s1 = (float) Math.pow(a,3);
        s2= (float) Math.pow(a,2);
        System.out.println(s1);
        System.out.println(s2);
}
}

