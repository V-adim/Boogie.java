package LearningFromEPAM.Chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String [] nums = new String[10];

        System.out.println("Введите десять чисел через Enter");
/**
 * инициализация массива
 */
        for (int i = 0; i < 10; i++) {
            nums [i] = s.next();
            }
/**
 * сортировка по возрастанию длины
 */
       for (int j = 9; j >= 0; j--) {
           for (int i = 0; i < j; i++) {
               if (nums[i].length() > nums[i + 1].length()) {
                   var v = nums[i];
                   nums[i] = nums[i + 1];
                   nums[i + 1] = v;

               }
           }
       }

        for (var num:nums
             ) {
            System.out.println("Числа по возрастанию длины " + num);
        }

        /**
         * сортировка по убыванию длины
         */
        for (int j = 9; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (nums[i].length() < nums[i + 1].length()) {
                    var v = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = v;
                }
            }
        }

        for (var num:nums
        ) {
            System.out.println("Числа по убыванию длины " + num);
        }

    }
}
