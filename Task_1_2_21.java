import java.util.Scanner;

public class Task_1_2_21 {
    public static void main(String[] args) {
        int t;
        double result;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        result = Math.sin(2 * Math.toRadians(t)) + Math.sin(3 * Math.toRadians(t));
        System.out.println("Sin(2t) + Sin(3t) = " + result);
    }
}
//1.2.21.Напишите программу, которая получает число t
// в аргументе командной строки и выводит значение sin(2Ј) + sin(3Ј).