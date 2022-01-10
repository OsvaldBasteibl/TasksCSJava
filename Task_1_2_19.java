public class Task_1_2_19 {
    public static void main(String[] args) {
        int a, b;
        int result;
        a = (int)(Math.random() * 100);
        b = (int)(Math.random() * 100);
        System.out.println("a = " + a + " b = " + b);
        result = ((int)(Math.random() * (b - a + 1))) + a;
        System.out.println(result);
    }
}
//1.2.19. Напишите программу, которая получает два целых числа а и b в аргументах
//командной строки и выводит случайное целое число из диапазона от а до b включительно.