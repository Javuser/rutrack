package Anything;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float p,a,b,c,l,m,h1,h2,h3,l1,l2,l3,m1,m2,m3;
         a =scanner.nextInt();
         b = scanner.nextInt();
         c = scanner.nextInt();
          p = ( a + b + c)/2;
          h1 =(float) (2/a * Math.sqrt(p*(p-a)*(p-b)*(p-c)));
          h2 = (float) (2/b * Math.sqrt(p*(p-a)*(p-b)*(p-c)));
          h3 = (float) (2/c * Math.sqrt(p*(p-a)*(p-b)*(p-c)));
          m1 = (float) (Math.sqrt((2*b*b+ 2*c*c - a*a)))/2;
          m2 = (float)  (Math.sqrt((2*c*c+ 2*a*a - b*b)))/2;
          m3 = (float) (Math.sqrt((2*a*a+ 2*b*b - c*c)))/2;
          l1 = (float)((2 * Math.sqrt(a*b*p*(p-c)))/(a+b));
          l2 = (float)((2 * Math.sqrt(a*c*p*(p-a)))/(c+b));
          l3 = (float)((2 * Math.sqrt(c*b*p*(p-b))/(a+c)));
          System.out.println(" Длины высот:");
          System.out.println("h1 = " + h1);
          System.out.println("h2 = " + h2);
          System.out.println("h3 = " + h3);
          System.out.println(" ");
          System.out.println(" Длины медиан:");
          System.out.println("m1 = " + m1);
          System.out.println("m2 = " + m2);
          System.out.println("m3 = " + m3);
          System.out.println(" ");
          System.out.println(" Длины биссектрис:");
          System.out.println("l1 = " + l1);
          System.out.println("l2 = " + l2);
          System.out.println("l3 = " + l3);

    }
}
