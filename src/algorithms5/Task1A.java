package algorithms5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Вася и Маша участвуют в субботнике и красят стволы деревьев в белый цвет.
 *  Деревья растут вдоль улицы через равные промежутки в 1 метр. Одно из деревьев обозначено числом ноль,
 *  деревья по одну сторону занумерованы положительными числами 1,2 и т.д., а в другую — отрицательными −1,−2 и т.д.
 *  Ведро с краской для Васи установили возле дерева P, а для Маши — возле дерева Q.
 *  Ведра с краской очень тяжелые и Вася с Машей не могут их переставить, поэтому они окунают кисть в ведро
 *  и уже с этой кистью идут красить дерево. Краска на кисти из ведра Васи засыхает, когда он удаляется от ведра
 *  более чем на V метров, а из ведра Маши — на M метров. Определите, сколько деревьев может быть покрашено.
 *  Формат ввода
 * В первой строке содержится два целых числа P и V — номер дерева, у которого стоит ведро Васи и на сколько деревьев
 * он может от него удаляться.
 * В второй строке содержится два целых числа Q и M — аналогичные данные для Маши.
 * Все числа целые и по модулю не превосходят 108.
 * Формат вывода
 * Выведите одно число — количество деревьев, которые могут быть покрашены.
 * Пример
 * Ввод
 * 0 7
 * 12 5
 * Вывод
 * 25
 */
public class Task1A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int centerV = s.nextInt();
        int sV = s.nextInt();
        int centerM = s.nextInt();
        int sM = s.nextInt();
        int q, Vx1, Vx2, Mx1, Mx2;

        // det first and second intervals
        Vx1 = centerV - sV;
        Vx2 = centerV + sV;
        Mx1 = centerM - sM;
        Mx2 = centerM + sM;

        //det intersection
        if (Vx2 < Mx1 || Vx1 > Mx2) {
            q = sV * 2 + sM * 2 + 2;
        } else {
            int[] ends = new int[4];
            ends[0] = Vx1;
            ends[1] = Vx2;
            ends[2] = Mx1;
            ends[3] = Mx2;
            Arrays.sort(ends);
            if (ends[1] >= 0 & ends[2] >= 0){
                q = (sV * 2 + sM * 2 + 2) - (ends[2] - ends[1] + 1);
            }else {
                if (ends[1] < 0 & ends[2] < 0){
                    q = (sV * 2 + sM * 2 + 2) - (Math.abs(ends[1]) - Math.abs(ends[2]) + 1);
                }else {
                    q = (sV * 2 + sM * 2 + 2) - (Math.abs(ends[1]) + ends[2] + 1);
                }
            }

        }
        System.out.println(q);

    }
}
