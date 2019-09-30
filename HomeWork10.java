/*
Задание №10: Ввод/вывод данных для матрицы
Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
 */

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        int row;
        int column;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк двумерного массива");
        row = in.nextInt();
        System.out.println("Введите количество столбцов двумерного массива");
        column = in.nextInt();
        int[][] array = new int[row][column];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.println("Введите " + j + "-й элемент " + i + "-й строки массива");
                //если первая строка, элемент массива умножить на 3
                if (i == 1) {
                    array[i - 1][j - 1] = 3 * in.nextInt();
                } else array[i - 1][j - 1] = in.nextInt();
            }
        }
        System.out.println("Значения первой строки массива умножены на 3:");
        //цикл для вывода значений первой строки массива
        for (int k = 0; k < row; k++) {
            for (int j = 0; j < column; j++) {
                if (k == 0) System.out.print(array[k][j] + "; ");
            }
        }
    }
}
