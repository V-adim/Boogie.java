package LearningFromEPAM.Chapter2;

import java.util.Scanner;

/**
 *  Выполнить циклический сдвиг заданной матрицы на k позиций вправо
 * (влево, вверх, вниз).
 */
public class TaskC2 extends TaskC{
    public static void main(String[] args) {
        initAr();
        Scanner n = new Scanner(System.in);
        /**
         * Moving to the right
         */
        System.out.println("\n****************\n*****************\nEnter quantity of position to move to the right");
        int q = n.nextInt();
        for (int i = 0; i < q; i++) {
        for (int l = 0; l < mainAr.length; l++) {
            var x = mainAr[l][mainAr.length-1];
            for (int c = mainAr.length-1; c > 0; c--) {
                mainAr[l][c] = mainAr[l][c-1];
                if (c==1) {
                    mainAr[l][c - 1] = x;
                }
            }
        }
    }
        prAr();
        /**
         * Moving to the left
         */
        System.out.println("\n****************\n*****************\nEnter quantity of position to move to the left");
        q = n.nextInt();
        for (int i = 0; i < q; i++) {
            for (int l = 0; l < mainAr.length; l++) {
                var x = mainAr[l][0];
                for (int c = 0; c < mainAr.length-1; c++) {
                    mainAr[l][c] = mainAr[l][c+1];
                    if (c==mainAr.length-2) {
                        mainAr[l][mainAr.length-1] = x;
                    }
                }
            }
        }
        prAr();
        /**
         * Moving up
         */
        System.out.println("\n****************\n*****************\nEnter quantity of position to move up");
        q = n.nextInt();
        for (int i = 0; i < q; i++) {
            for (int c = 0; c < mainAr.length; c++) {
                var x = mainAr[0][c];
                for (int l = 0; l < mainAr.length-1; l++) {
                    mainAr[l][c] = mainAr[l+1][c];
                    if (l==mainAr.length-2) {
                        mainAr[mainAr.length-1][c] = x;
                    }
                }
            }
        }
        prAr();
        /**
         * Moving down
         */
        System.out.println("\n****************\n*****************\nEnter quantity of position to move down");
        q = n.nextInt();
        for (int i = 0; i < q; i++) {
            for (int c = 0; c < mainAr.length; c++) {
                var x = mainAr[mainAr.length-1][c];
                for (int l = mainAr.length-1; l > 0;l--){
                    mainAr[l][c] = mainAr[l-1][c];
                    if (l==1) {
                        mainAr[l-1][c] = x;
                    }
                }
            }
        }
        prAr();
    }
}
