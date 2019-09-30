import java.util.Scanner;
/*
Задача №5: Таблица умножения
Задание
Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
 */
public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения. \nВведите любое число, если десятичное - через запятую.");
        Scanner in = new Scanner(System.in);
        double doubleNumber = in.nextDouble();
        System.out.println(doubleNumber + " x 1 = " + doubleNumber*1 + "\n" +
                doubleNumber + " x 2 = " + doubleNumber*2 + "\n" +
                doubleNumber + " x 3 = " + doubleNumber*3 + "\n" +
                doubleNumber + " x 4 = " + doubleNumber*4 + "\n" +
                doubleNumber + " x 5 = " + doubleNumber*5 + "\n" +
                doubleNumber + " x 6 = " + doubleNumber*6 + "\n" +
                doubleNumber + " x 7 = " + doubleNumber*7 + "\n" +
                doubleNumber + " x 8 = " + doubleNumber*8 + "\n" +
                doubleNumber + " x 9 = " + doubleNumber*9 + "\n" +
                doubleNumber + " x 10 = " + doubleNumber*10);
    }
}
