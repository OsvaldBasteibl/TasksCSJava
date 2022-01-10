import java.util.Scanner;

public class Task_1_2_4 {
    public static void main(String[] args) {
        int a, b, iteration;
        Scanner input = new Scanner(System.in);
        iteration = input.nextInt();
        for(int i = 0; i < iteration; i++){
            a = (int)(Math.random() * iteration);
            b = (int)(Math.random() * iteration);
            System.out.println("a = " + a + " b = " + b);
            boolean result_1 = (!(a < b) && !(a > b));
            boolean result_2 = (a == b);
            System.out.println(result_1 + " " + result_2);
        }

    }
}
//
//1.2.4.
//Предположим, а и b — переменные типа int.
//Упростите следующее выражение:(! (а < Ь) && ! (а > Ь)).