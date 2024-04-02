package algorithms5;

/**
 *
 A. Минимальный прямоугольник
 Ограничение времени 	1 секунда
 Ограничение памяти 	64Mb
 Ввод 	стандартный ввод или input.txt
 Вывод 	стандартный вывод или output.txt

 На клетчатой плоскости закрашено K клеток. Требуется найти минимальный по площади прямоугольник,
 со сторонами, параллельными линиям сетки, покрывающий все закрашенные клетки.

 Формат ввода
 Во входном файле, на первой строке, находится число K (1 ≤ K ≤ 100). На следующих K строках находятся пары чисел Xi и Yi — координаты закрашенных клеток (|Xi|, |Yi| ≤ 109).

 Формат вывода
 Выведите в выходной файл координаты левого нижнего и правого верхнего углов прямоугольника.

 Пример
 Ввод
 4
 1 3
 3 1
 3 5
 6 3

 Вывод
 1 1 6 5
 */

import java.util.Scanner;

public class Task2A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int[] x = new int[k];
        int[] y = new int[k];
        int minX, minY, maxX, maxY;

        for (int i = 0; i < k; i++) {
            x[i] = s.nextInt();
            y[i] = s.nextInt();
        }
        minX = x[0];
        minY = y[0];
        maxX = x[0];
        maxY = y[0];
        for (int i = 0; i < k; i++) {
            if (x[i] < minX){
                minX = x[i];
            }
            if (x[i] > maxX){
                maxX = x[i];
            }
            if (y[i] < minY){
                minY = y[i];
            }
            if (y[i] > maxY){
                maxY = y[i];
            }
        }
        System.out.println(minX + " " + minY + " " + maxX + " " + maxY);
    }
}
