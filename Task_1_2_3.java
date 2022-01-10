import java.util.Scanner;

public class Task_1_2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iteration = input.nextInt();
        for(int i = 0; i < iteration; i++){
            double phi = Math.random()*180;
            System.out.println("Угол в градусах: " + phi);
            double result = Math.pow(Math.cos(Math.toRadians(phi)), 2) + Math.pow(Math.sin(Math.toRadians(phi)), 2);
            System.out.println("Sin^2(phi) + Cos^2(phi) = " + result);
        }

    }
}
//1.2.2.
//Напишите программу, которая использует Math.sin() и Math.cos()
//и проверяет, что значение cos(phi) + sin(phi) равно приблизительно 1
//для любого значения 0, переданного в аргументе командной строки.
//Просто выведите значение.