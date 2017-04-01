import java.util.Scanner;

public class task77d{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n,i,s,a;
        s = 0;
        System.out.print("Введите значение n=");
        n = scanner.nextInt();
        for(i=0;i<=n;i++){
            s =Math.sqrt(2+s);//summ
        }
        System.out.println("Сумма равно:"+s);
    }
}
