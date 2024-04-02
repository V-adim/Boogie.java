package LearningFromEPAM.Chapter2;

import java.util.Arrays;

/**
 * 9. Построить матрицу, вычитая из элементов каждой строки матрицы ее сред-
 * нее арифметическое.
 */
public class TaskC9 extends TaskC {
    public static void main(String[] args) {
        initAr();
        /**
         * Calculating the sum of elements
         */
        double sum = 0;
        for (int l = 0; l < mainAr.length; l++) {
            for (int c = 0; c < mainAr.length ; c++) {
                sum = sum + mainAr[l][c];
            }
        }
        System.out.println("\nsum = "+ sum);
        /**
         * Calculating the quantity of elements (square)
         */
        double q = mainAr.length * mainAr.length;
        /**
         * Calculating the average of elements
         */
        double a = sum / q;
        System.out.println("average of el = " + a);
        /**
         * Calculating new matrix
         */
        for (int l = 0; l < mainAr.length; l++) {
            for (int c = 0; c < mainAr.length ; c++) {
                mainAr[l][c] = mainAr[l][c] - a;
            }
        }
        /**
         * Printing the result
         */
        System.out.println(Arrays.deepToString(mainAr));
    }
}
