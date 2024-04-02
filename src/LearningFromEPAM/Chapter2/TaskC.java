package LearningFromEPAM.Chapter2;


import java.util.Scanner;

/**
 * Ввести с консоли n-размерность матрицы a[n][n]. Задать значения элемен-
 * тов матрицы в интервале значений от -n до n с помощью генератора случайных
 * чисел.
 */
public class TaskC {
   //static double [][] mainAr = initAr();
    public static void main(String[] args) {



    }
    static double[][] mainAr;
    /**
     * method for initialising and printing array
     */
    static double[][] initAr () {
        System.out.println("Enter dimension 'n' of array a [n][n]");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        mainAr = new double[n][n];
        for (int i = 0; i < mainAr.length ; i++) {
            System.out.println("");
            for (int j = 0; j < mainAr[i].length ; j++) {
                mainAr[i][j] = Math.random()*2*n - n;
                System.out.print(mainAr[i][j] + " | ");
            }
        }
        return mainAr;
    }
    /**
     * method for printing sorted array
     */
    static void prAr (){
        System.out.println("Sorted array");
        for (int i = 0; i < mainAr.length ; i++) {
            System.out.println("");
            for (int j = 0; j < mainAr[i].length ; j++) {
                System.out.print(" | "+mainAr[i][j]+" | ");
            }
        }
    }
}
