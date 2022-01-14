import java.util.Arrays;
import java.util.Scanner;

public class Task_1_2_22 {
    public static void main(String[] args) {
        double x0, v0, t, result;
        double g = 9.80665;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите x0: ");
        x0 = input.nextDouble();
        System.out.print("Введите v0: ");
        v0 = input.nextDouble();
        System.out.print("Введите t: ");
        t = input.nextDouble();
        result = x0 + v0 * t - g * Math.pow(t, 2) / 2;
        System.out.println("Результат вычисления: " + result);
    }
}
//1.2.22.  Напишите программу, которая получает числа типа double х0, v0 и t  в аргументах
// командной строки и выводит значение х0 + v0t - g  t2/ 2, где g — константа 9,80665.