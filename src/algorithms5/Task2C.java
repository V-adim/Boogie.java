package algorithms5;
/**
 *
 C. Петя, Маша и верёвочки
 Ограничение времени 	1 секунда
 Ограничение памяти 	512Mb
 Ввод 	стандартный ввод или input.txt
 Вывод 	стандартный вывод или output.txt

 На столе лежали две одинаковые верёвочки целой положительной длины.
 Петя разрезал одну из верёвочек на N частей, каждая из которых имеет целую положительную длину,
 так что на столе стало N+1 верёвочек. Затем в комнату зашла Маша и взяла одну из лежащих на столе верёвочек.
 По длинам оставшихся на столе N верёвочек определите, какую наименьшую длину может иметь верёвочка, взятая Машей.
 Формат ввода
 Первая строка входных данных содержит одно целое число N — количество верёвочек, оставшихся на столе (2 ≤ N ≤ 1000). Во второй строке содержится N целых чисел li — длины верёвочек (1 ≤ li ≤ 1000).
 Формат вывода
 Выведите одно целое число — наименьшую длину, которую может иметь верёвочка, взятая Машей.

 Пример 1
 Ввод
 4
 1 5 2 1
 Вывод
 1

 Пример 2
 Ввод
 4
 5 12 4 3
 Вывод
 24
 */

import java.util.Scanner;

public class Task2C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int lMax, lSum = 0, lMissed;
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = s.nextInt();
        }
        lMax = l[0];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (l[i] > lMax){
                    lMax = l[i];
                }
            }
            lSum += l[i];
        }
        if (lMax > (lSum - lMax)){
            lMissed = lMax - (lSum - lMax);
        }else {
            lMissed = lSum;
        }

        System.out.println(lMissed);
        }
    }

