package LearningFromEPAM.Chapter2;

/**
 * Округлить все элементы матрицы до целого числа.
 */
public class TaskC6 extends TaskC{
    public static void main(String[] args) {
        initAr();
        /**
         * Rounding for integer
         */
        for (int i = 0; i < mainAr.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < mainAr.length; j++) {
                mainAr[i][j] = Math.round(mainAr[i][j]);
                System.out.print(" | "+mainAr[i][j]);
            }
        }
    }
}
