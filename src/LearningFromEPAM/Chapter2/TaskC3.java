package LearningFromEPAM.Chapter2;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 *  Найти и вывести наибольшее число возрастающих\убывающих элементов
 * матрицы, идущих подряд.
 */
public class TaskC3 extends TaskC{
    public static void main(String[] args) {

        int a = 0;
        int count;
        int[] countTotal = new int[1000];

        initAr();
        /**
         * Searching for increasing elements in lines from the left to the right
         */
        for (int l = 0; l < mainAr.length; l++) {
            count = 1;
            for (int c = 0; c < mainAr.length-1; c++) {
                if (mainAr[l][c] < mainAr[l][c+1]){
                    count++;
                    countTotal[a] = count;
                    a++;
                }
                if (mainAr[l][c] >= mainAr[l][c+1]){
                    count = 1;
                }
            }
        }
        /**
         * Searching for increasing elements  in Columns from up to down
         */
        for (int c = 0; c < mainAr.length; c++) {
            count = 1;
            for (int l = 0; l < mainAr.length-1; l++) {
                if (mainAr[l][c] < mainAr[l+1][c]){
                    count++;
                    countTotal[a] = count;
                    a++;
                }
                if (mainAr[l][c] >= mainAr[l+1][c]){
                    count = 1;
                }
            }
        }
        /**
         * Printing all quantities of increasing in a row elements
         */
        System.out.println("\n");
        for (var v:countTotal) {
            if (v!=0){
                System.out.print(v+" ; ");
            }
        }
        OptionalInt max = Arrays.stream(countTotal).max();
        System.out.println("\nMax increasing in a row elements  = " + max);
        /**
         * Searching for decreasing elements in lines from the left to the right
         */
        for (int l = 0; l < mainAr.length; l++) {
            count = 1;
            a = 0;
            for (int c = 0; c < mainAr.length-1; c++) {
                if (mainAr[l][c] > mainAr[l][c+1]){
                    count++;
                    countTotal[a] = count;
                    a++;
                }
                if (mainAr[l][c] <= mainAr[l][c+1]){
                    count = 1;
                }
            }
        }

        /**
         * Searching for decreasing elements  in Columns from up to down
         */
        for (int c = 0; c < mainAr.length; c++) {
            count = 1;
            for (int l = 0; l < mainAr.length-1; l++) {
                if (mainAr[l][c] > mainAr[l+1][c]){
                    count++;
                    countTotal[a] = count;
                    a++;
                }
                if (mainAr[l][c] <= mainAr[l+1][c]){
                    count = 1;
                }
            }
        }
        /**
         * Printing all quantities of decreasing in a row elements
         */
        System.out.println("\n");
        for (var v:countTotal) {
            if (v!=0){
                System.out.print(v+" ; ");
            }
        }
        OptionalInt maxD = Arrays.stream(countTotal).max();
        System.out.println("\nMax decreasing in a row elements  = " + maxD);
    }
}
