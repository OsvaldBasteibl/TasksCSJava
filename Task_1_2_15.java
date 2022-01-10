public class Task_1_2_15 {
    public static void main(String[] args) {
        int a, b, c;
        boolean result;
        a = (int)(Math.random() * 100);
        b = (int)(Math.random() * 100);
        c = (int)(Math.random() * 100);
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        result = (a >= b + c) || (b >= a + c) || (c >= a + b);
        System.out.println(result);
    }
}
//1.2.15. Напишите программу, которая получает три положительных числа
// в аргументах командной строки и выводит f a ls e , если одно из них
// больше или равно сумме других, или true в противном случае.
// (Примечание: программа проверяет, могут ли числа представлять
// длины сторон некоторого треугольника.)