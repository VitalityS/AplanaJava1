import java.util.Scanner;
/*
Задача №4: Отработка поразрядных операцийЗадание
Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите бинарное число");
        String binNumber = in.nextLine();
        int number = Integer.parseInt(binNumber, 2);
        System.out.println("Это число в  десятиричном формате = " + number);
    }
}
