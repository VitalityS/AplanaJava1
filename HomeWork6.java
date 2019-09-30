/*
Задача №6: Отработка арифметических операцийЗадание
Написать программу, которая будет выполнять следующие действия:

1. Ввод трех чисел с клавиатуры x, y, z
2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

        int num1, num2, num3, sr, sr_2;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        num1 = in.nextInt();

        System.out.println("Введите второе число");
        num2 = in.nextInt();

        System.out.println("Введите третье число");
        num3 = in.nextInt();

        sr = (num1 + num2 + num3) / 3;
        sr_2 = sr / 2;
        System.out.println("Среднее арифметическое чисел: " + num1 + ", " + num2 + ", " + num3 + " = " + sr);

        if (sr_2 > 3) {
            System.out.println("Программа выполнена корректно!");
        }
    }
}
