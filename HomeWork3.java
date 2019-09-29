
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

/*
            Scanner in = new Scanner(System.in);
            System.out.println("Введите бинарное число");
            String binNumber = in.nextLine();
            int number = Integer.parseInt(binNumber, 2);
            System.out.println("В десятиричном виде = " + number);
*/
/*
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
*/
/*
        //задача 6
         System.out.println("Введите первое число");
            int num1, num2, num3;

            Scanner in = new Scanner(System.in);
            num1 = in.nextInt();
            System.out.println("Введите второе число");
            num2 = in.nextInt();
            System.out.println("Введите третье число");
            num3 = in.nextInt();
            int sr = (num1+num2+num3)/3;
            //System.out.println("Среднее арифметическое чисел: " + num1 +", "+ num2 +", "+  num3 +" = "+  (num1+num2+num3)/3);
            System.out.println("Среднее арифметическое чисел: " + num1 +", "+ num2 +", "+  num3 +" = "+ sr);
            System.out.println("Деление среднего арифметического на 2 без остатка:" + sr/2);
            if(sr/2 > 3){
                System.out.println("Программа выполнена успешно!");
            }else System.out.println("Программа выполнена не успешно87" + sr/2);
*/
/*
        //задача 7
        int X = 10;
        int Y = 15;
        int Z = 20;
        int number;
        String result;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        number = in.nextInt();
        //в строку result сохраняется значение по условию совпадения значения переменной number с одной из констант
        result = (number == X || number == Y || number == Z) ?
                "Данное значение имеется в константах" :
                "Такой константы нет!";
        System.out.println(result);
*/
/*
        //задача 8

        for(int i = 1; i <= 50; i++){
            System.out.print(i < 50 ? i +", ": i);
        }
*/
/*
    //задача 9
        int razmer;
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько элементов будет в массиве ? Введите число");
        razmer = in.nextInt();
        int massiv[] = new int[razmer];
        for (int i = 1; i <= razmer; i++) {
            System.out.println("Введите " + i + "-й элемент массива");
            massiv[i-1] = 2*in.nextInt();
        }
        System.out.println("Значения массива умножены на 2:\n" + Arrays.toString(massiv));
*/

        // задача 10
        int stroka;
        int stolbec;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк двумерного массива");
        stroka = in.nextInt();
        System.out.println("Введите количество столбцов двумерного массива");
        stolbec = in.nextInt();
        int[][]massiv = new int[stroka][stolbec];
        for(int i = 1; i <= stroka; i++){
            for (int j = 1; j <= stolbec; j++) {
                System.out.println("Введите " + j + "-й элемент " + i + "-й строки массива");
                massiv[i-1][j-1] = 3*in.nextInt();
            }
        }
        System.out.println("Значения массива умножены на 3:\n" + Arrays.deepToString(massiv));
    }
}
