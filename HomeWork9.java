/*
Задание №9: Ввод/вывод данных для массива
Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2. Размер массива задается пользователем.
 */
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число желаемых элементов в массиве");
        size = in.nextInt();
        int array[] = new int[size];
        for (int i = 1; i <= size; i++) {
            System.out.println("Введите " + i + "-й элемент массива");
            array[i - 1] = 2 * in.nextInt();
        }
        System.out.println("Значения массива умножены на 2:\n" + Arrays.toString(array));//метод toString выводит все значения массива
    }
}
