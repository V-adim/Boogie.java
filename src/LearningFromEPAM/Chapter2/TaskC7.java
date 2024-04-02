package LearningFromEPAM.Chapter2;

/**
 * Повернуть матрицу на 90, 180 или 270 градусов против часовой стрелки.
 */
public class TaskC7 extends TaskC{
    public static void main(String[] args) {
        initAr();
        /**
         * Turning on ??? degrees
         */
        double[][] turnAr = new double[mainAr.length][mainAr.length];
        System.out.print("\n\n\nTurning on 90 degrees");
        for (int l = 0; l < mainAr.length; l++) {
            System.out.println("\n");
            for (int c = 0; c < mainAr.length; c++) {

                turnAr[l][c] = mainAr[c][mainAr.length-1-l];
                System.out.print(" | "+turnAr[l][c]);
            }
        }
        /**
         * Turning on 270 degrees
         */
        System.out.print("\n\n\nTurning on 270 degrees");
        for (int l = 0; l < mainAr.length; l++) {
            System.out.println("\n");
            for (int c = 0; c < mainAr.length; c++) {

                turnAr[l][c] = mainAr[mainAr.length - 1 -c][l];
                System.out.print(" | "+turnAr[l][c]);
            }
        }



    }
}
