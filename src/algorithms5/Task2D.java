package algorithms5;
/**
 *
 D. Шахматная доска
 Ограничение времени 	1 секунда
 Ограничение памяти 	64Mb
 Ввод 	стандартный ввод или input.txt
 Вывод 	стандартный вывод или output.txt

 Из шахматной доски по границам клеток выпилили связную (не распадающуюся на части) фигуру без дыр.
 Требуется определить ее периметр.
 Формат ввода
 Сначала вводится число N (1 ≤ N ≤ 64) – количество выпиленных клеток.В следующих N строках вводятся
 координаты выпиленных клеток, разделенные пробелом (номер строки и столбца – числа от 1 до 8).
 Каждая выпиленная клетка указывается один раз.
 Формат вывода
 Выведите одно число – периметр выпиленной фигуры (сторона клетки равна единице).

 Пример 1
 Ввод
 3
 1 1
 1 2
 2 1
 Вывод
 8

 Пример 2
 Ввод
 1
 8 8
 Вывод
 4

 Примечания
 1) Вырезан уголок из трех клеток. Сумма длин его сторон равна 8.
 2) Вырезана одна клетка. Ее периметр равен 4.
 */

import java.util.Scanner;

public class Task2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] d = new int[10][10];
        int[] di = {-1, 0, 0, 1};
        int[] dj = {0, -1, 1, 0};
        int p, p1 = 4, neighbourSum = 0;

        for (int i = 0; i < n; i++) {
            d[s.nextInt()][s.nextInt()] = 5;
        }
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if (d[i][j] == 5){
                    for (int k = 0; k < 4; k++) {
                        if (d[i + di[k]][j + dj[k]] == 5){
                            neighbourSum += 1;
                        }
                    }
                }
            }
        }
        p = n * p1 - neighbourSum;
        System.out.println(p);
    }
}
