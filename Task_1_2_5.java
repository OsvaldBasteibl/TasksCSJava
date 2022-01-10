import java.util.Scanner;

public class Task_1_2_5 {
    public static void main(String[] args) {
        boolean a, b;
        boolean result;
        Scanner input = new Scanner(System.in);
        System.out.println("\ta" + "\t\tb" + "\t\ta ^ b");
        a = true;
        b = true;
        System.out.print("\t" + a + "\t" + b +"\t");
        result = a ^ b;
        System.out.println(result);
        a = true;
        b = false;
        System.out.print("\t" + a + "\t" + b +"\t");
        result = a ^ b;
        System.out.println(result);
        a = false;
        b = true;
        System.out.print("\t" + a + "\t" + b +"\t");
        result = a ^ b;
        System.out.println(result);
        a = false;
        b = false;
        System.out.print("\t" + a + "\t" + b +"\t");
        result = a ^ b;
        System.out.println(result);
    }
}
//1.2.5. Оператор исключающего или ^ для операндов типа boolean по определению
//возвращает true, если операнды различны, и возвращает false, если они совпадают.
//Приведите таблицу истинности для этой функции.