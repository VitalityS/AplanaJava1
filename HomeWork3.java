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

        }
    }
