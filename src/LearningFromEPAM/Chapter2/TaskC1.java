package LearningFromEPAM.Chapter2;

/**
 * 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений
 * элементов k-го столбца (строки).
 */
import java.util.Scanner;

public class TaskC1 extends TaskC{
    public static void main(String[] args) {
         double[][] mainAr = initAr();

        /**
         * Asking user about number of line
         */
        System.out.println("\nEnter the number of line to sort by");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        /**
         * Checking line number
         */
        if (a < 0 | a > mainAr.length-1){
            System.out.println("Wrong number!!!\nRestart program");
        }
        /**
         * Sorting columns by enhanced line
         */
        for (int i = 0; i <  (mainAr[a].length - 1); i++) {
            for (int c = 0; c < (mainAr[a].length - 1 - i); c++) {
                if (mainAr[a][c] > mainAr[a][c+1]){

                    for (int l = 0; l < mainAr.length; l++) {
                        var v = mainAr[l][c];
                        mainAr[l][c] = mainAr[l][c+1];
                        mainAr[l][c+1] = v;
                    }
                }
            }
        }

        /**
         * Printing sorted array
         */
        prAr();
//                System.out.println("Sorted array");
//        for (int i = 0; i < mainAr.length ; i++) {
//            System.out.println("");
//            for (int j = 0; j < mainAr[i].length ; j++) {
//                System.out.print(" | "+mainAr[i][j]+" | ");
//            }
//        }

        /**
         * Asking user about number of column
         */
        System.out.println("\nEnter the number of column to sort by\n" +
                "(the sorted before array will be changed)");
         a = s.nextInt();
        /**
         * Checking column number
         */
        if (a < 0 | a > mainAr.length-1){
            System.out.println("Wrong number!!!\nRestart program");
        }

        /**
         * Sorting columns by enhanced line
         */
        for (int i = 0; i <  (mainAr.length - 1); i++) {
            for (int l = 0; l < (mainAr.length - 1 - i); l++) {
                if (mainAr[l][a] > mainAr[l+1][a]){

                    for (int c = 0; c < mainAr.length; c++) {
                        var v = mainAr[l][c];
                        mainAr[l][c] = mainAr[l+1][c];
                        mainAr[l+1][c] = v;
                    }
                }
            }
        }
        /**
         * Printing sorted array
         */

        System.out.println("Sorted array");
        for (int i = 0; i < mainAr.length ; i++) {
            System.out.println("");
            for (int j = 0; j < mainAr[i].length ; j++) {
                System.out.print(" | "+mainAr[i][j]+" | ");
            }
        }

    }
}
