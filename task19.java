package Anything;

import java.util.Scanner;

public class task19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s1,s2,s,a1,a2,v1,v2,a,b,c,t,t1,t2;
        v1 = scanner.nextFloat();
        v2 = scanner.nextFloat();
        a1 = scanner.nextFloat();
        a2 = scanner.nextFloat();
        s = scanner.nextFloat();
        /*s1 = v1*t+(a1*t*t)/2
         s2 = v2*t +(a2*t*t)/2
         s = s1 + s2
         s = v1*t + (a1*t*t)/2 + v2*t + (a2*t*t)/2
         v1*t + (a1*t*t)/2 + v2*t + (a2*t*t)/2 - s = 0
         */
         a = (a1 + a2)/2;
         b = v1 + v2;
         c = s;
        //t * a * t + b*t +c = 0

         t1 =(-b+Math.sqrt(b*b - 4*a*c))/2*a;
        t2=(-b-Math.sqrt(b*b - 4*a*c))/2*a;
        if(t1<0 & t2<0){
            System.out.println("Time can not be  negative");
        }
        if(t1>0 & t2>0) {
            System.out.println(t1);
            System.out.println(t2);
        }
        if(t1<0 & t2>0){
            System.out.println(t2);
        }
        if(t1>0 & t2<0){
            System.out.println(t1);
        }
    }
}
