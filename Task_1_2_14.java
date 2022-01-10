public class Task_1_2_14 {
    public static void main(String[] args) {
        int a, b;
        boolean result;
        a = (int)(Math.random() * 100);
        b = (int)(Math.random() * 100);
        result = a % b == 0 || b % a == 0;
        System.out.println(result);
    }
}
//1.2.14. Напишите программу, которая получает два положительных
// числа в аргументах командной строки и выводит true , если
// одно из этих чисел нацело делится на другое.
