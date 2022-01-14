import java.util.Scanner;

public class Task_1_2_23 {
    public static void main(String[] args) {
        int m, d;
        boolean result = false;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        d = input.nextInt();
        result = (d >= 20 && d <= 31 && m == 3) || (d <= 20 && d >= 1 && m == 6) || (d >= 1 && d <= 30 && m == 4) || (d >= 1 && d <= 31 && m == 5);
        System.out.println(result);
    }
}
//1.2.23. Напишите программу, которая получает два целых числа m и d в аргументах
//командной строки и выводит true, если день d месяца m лежит в диапазоне от 20/03
//до 20/06, или false в противном случае.
