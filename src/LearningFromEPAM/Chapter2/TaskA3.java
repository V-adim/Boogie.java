package LearningFromEPAM.Chapter2;

import java.util.Scanner;

public class TaskA3 {
    static String[] mainAr = input();

    public static void main(String[] args) {
        int sum = 0;

        /**
         * Определяем среднее значение длины членов массива
         */
        for (int i = 0; i < 10; i++) {
            sum += lengths()[i];
        }
        double medLength =  (double) sum/mainAr.length;
        System.out.println("medLength = " + medLength);

        /**
         * Define and print values of array members length more than medium length and less
         */
        for (int i = 0; i<10;i++) {
            if (mainAr[i].length()<medLength){
                System.out.println("less " + mainAr[i] + " length " + mainAr[i].length());
            }
            else {
                System.out.println("more " + mainAr[i] + " length " + mainAr[i].length());
            }
        }
    }
    /**
     * Метод для создания и инициализации массива чисел String
     * @return массив введенных чисел
     */
    public static String[] input () {
        String[] nums = new String[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Введите десять чисел через Enter");
        for (int i = 0; i < 10; i++) {
            nums [i] = s.next();
        }
        return nums;
    }
    /**
     * метод для составления массива длин чисел
     */
    public static int[] lengths () {
        int[] lengths = new int[10];
        var temp = mainAr;
        for (int i = 0; i < 10; i++) {
            lengths[i] = temp[i].length();
            }
        return lengths;
    }
}
