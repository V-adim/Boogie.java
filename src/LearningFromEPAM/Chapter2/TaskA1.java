package LearningFromEPAM.Chapter2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] nums = new String[10];
        String _short , _long;

        System.out.println("Введите десять чисел (после ввода числа жмите Enter)");

        /**
         * инициализируем массив чисел
         */

        for (int i = 0; i <10 ; i++) {
            nums [i] = s.next();
        }

        _short = nums[0];
        _long = nums[0];

        /**
         * находим самое короткое число
         */
        for (int i = 0; i < 10; i++) {
            if (_short.length() > nums[i].length()){
                _short = nums[i];
            }
                   }
        System.out.println("Самое короткое число: " + _short + " SIZE = " + _short.length());
/**
 * находим самое длинное число
 */
        for (int i = 0; i < 10; i++) {
            if (_long.length() < nums[i].length()){
                _long = nums[i];
            }
        }
        System.out.println("Самое длинное число: " + _long + " SIZE = " + _long.length());
    }
}
