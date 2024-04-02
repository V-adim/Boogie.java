package LearningFromEPAM.Chapter2;

/**
 * 15. Перестроить матрицу, переставляя в ней строки так, чтобы сумма элемен-
 * тов в строках полученной матрицы возрастала.
 */
public class TaskC15 extends TaskC{
    public static void main(String[] args) {
        double el, sum1, sum;
        initAr();

        /**
         * Calculating the sum of elements in line
         */
        var a = 0;
        for (int i = 0; i < mainAr.length - a ; i++) {
        for (int l = 0; l < mainAr.length - 1; l++) {
            sum1 = 0;
            for (int c = 0; c < mainAr.length; c++) {
                sum1 += mainAr[l][c];
            }
            sum = 0;
            for (int c = 0; c < mainAr.length; c++) {
                sum += mainAr[l+1][c];
            }
            /**
             * Changing lines
             */
            if (sum1 > sum){
                    for (int c = 0; c < mainAr.length; c++) {
                        el = mainAr[l][c];
                        mainAr[l][c] = mainAr[l + 1][c];
                        mainAr[l + 1][c] = el;
                }
            }
        }
        a++;
    }
        /**
         * Printing new array
         */
        System.out.println("\n\n\n\nNew array");
        for (int l = 0; l < mainAr.length; l++) {
            System.out.println();
            for (int c = 0; c < mainAr.length ; c++) {
                System.out.print(mainAr[l][c] + " | ");
            }
        }
        /**
         * Counting sums in new array
         */
        for (int l = 0; l < mainAr.length; l++) {
        sum = 0;
        for (int c = 0; c < mainAr.length; c++) {
            sum += mainAr[l][c];
        }
            System.out.println("\nsum in line " + l + " = " + sum);
    }
    }
}
