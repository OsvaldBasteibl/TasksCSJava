public class Task_1_2_18 {
    public static void main(String[] args) {
        double x, y;
        double result;
        x = Math.random() * 100;
        y = Math.random() * 100;
        System.out.println("x = " + x + " y = " + y);
        result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(result);
    }
}
//1.2.18. Напишите программу, которая получает два числа с плавающей точкой х и у
//в аргументах командной строки и выводит евклидово расстояние от точки (х, у)
//до точки (0,0).