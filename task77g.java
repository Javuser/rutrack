package Anything;

import java.util.Scanner;

public class task77g {
    // Задача про синусов
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i, s, n, S, a, b, c;
        s = 0;
        a = Math.sin(1 * Math.PI / 180);

        n = scanner.nextDouble();// Присваиваем значение n
        s = 1 / a;
        for (i = 2; i < n; i++) {
            a = a + Math.sin(i * Math.PI / 180);
            s = s + 1 / a;// Общая сумма
        }
        System.out.println(" Общая сумма равно:" + s);
    }
}


