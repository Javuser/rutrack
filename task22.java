package Anything;

import java.util.Scanner;

public class task22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c,A,h,s;
        a = scanner.nextInt();
        b = scanner.nextInt();
        A = scanner.nextInt();//угол Альфа
        //Math.cos(A) = ((a-b)/2)/c;
        c = (float) ((float)(a-b)/2*Math.cos(A));
        s = (float) ((float) c*Math.sin(A)*(a - (c * Math.cos(A))));//Площадь трапеции
        System.out.println(s);//Выводим площадь
    }
}
