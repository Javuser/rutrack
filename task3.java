package Anything;

import java.util.Scanner;

public class task3 {
// task about cube
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt(),s1,s2;
        s1 = (float) Math.pow(a,3);//объем куба
        s2= (float) Math.pow(a,2);//бетынын ауданы
        System.out.println("v="+s1);
        System.out.println("s="+ s2);
}
}

