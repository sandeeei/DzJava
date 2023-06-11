//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
//(произведение чисел от 1 до n)
package Seminar1;

/**
 * task1
 */
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int sum=0;
        int n = iScanner.nextInt();
        for(int i=1; i <= n; i++){
            sum+=i;
        }

    
        int count=1;
        for(int i=1; i <= n; i++){
            count*=i;
        }
        System.out.printf("Треугольное число данного числа:  %d\n", sum);
        System.out.printf("Факториал данного числа:  %d\n", count);
}
}   