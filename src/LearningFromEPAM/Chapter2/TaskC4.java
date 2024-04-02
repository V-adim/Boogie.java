package LearningFromEPAM.Chapter2;

/**
 *  Найти сумму элементов матрицы, расположенных между первым и вторым
 * положительными элементами каждой строки.
 */
public class TaskC4 extends TaskC {
    public static void main(String[] args) {
        initAr();
        int first = 0, second = 0;
        double sum = 0;
        /**
         * Finding indexes of first and second positive elements of each line
         */
        for (int l = 0; l < mainAr.length; l++) {
            for (int c = 0; c < mainAr[l].length; c++) {
                if (mainAr[l][c] > 0) {
                    first = c;
//                    System.out.println("\nfirst c on line " + l + " = " + first);
                    break;
                }
            }
            for (int c = first + 1; c < mainAr[l].length; c++) {
                if (mainAr[l][c] > 0) {
                    second = c;
//                    System.out.println("\nsecond c on line " + l + " = " + second);
                    break;
                }
            }
            /**
             * Finding the sum between
             */
            for (int c = first + 1; c < second ; c++) {
                sum += mainAr[l][c];
            }
            System.out.println("\nThe sum in line " + l + " = " + sum);
            sum = 0;
        }
    }
}
