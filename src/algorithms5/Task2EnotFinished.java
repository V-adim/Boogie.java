package algorithms5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2EnotFinished {
    private static int aMax;
    private static int iAmax;
    private static int deltaSum, hMax;
    private static int dMin;
    private static int idMin;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] table = new int[4][n];

        int firstNotPositiv = -1;

        for (int i = 0; i < n; i++) {
            table[0][i] = i + 1;
            table[1][i] = s.nextInt();
            table[2][i] = s.nextInt();
            table[3][i] = table[1][i] - table[2][i];
        }

        System.out.println(Arrays.deepToString(table));

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (table[3][i] < table[3][j]) {
                    int tmp1 = table[0][i];
                    int tmp2 = table[1][i];
                    int tmp3 = table[2][i];
                    int tmp4 = table[3][i];
                    table[0][i] = table[0][j];
                    table[1][i] = table[1][j];
                    table[2][i] = table[2][j];
                    table[3][i] = table[3][j];
                    table[0][j] = tmp1;
                    table[1][j] = tmp2;
                    table[2][j] = tmp3;
                    table[3][j] = tmp4;
                }
            }
        }

        System.out.println(Arrays.deepToString(table));


        for (int i = 0; i < n; i++) {
            if (table[3][i] <= 0) {
                System.out.println(table[3][i]);
                firstNotPositiv = i;
                break;
            }
        }

        System.out.println("firstNotPositiv=" + firstNotPositiv);




            if (firstNotPositiv >= 0) {
            aMax = table[1][firstNotPositiv];
            iAmax = -15;
            for (int i = firstNotPositiv; i < n; i++) {

                if (table[1][i] >= aMax) {
                    aMax = table[1][i];
                    iAmax = i;
                }
            }
            System.out.println("aMax=" + aMax + " iAmax=" + iAmax);
            int tmp1 = table[0][firstNotPositiv];
            int tmp2 = table[1][firstNotPositiv];
            int tmp3 = table[2][firstNotPositiv];
            int tmp4 = table[3][firstNotPositiv];
            table[0][firstNotPositiv] = table[0][iAmax];
            table[1][firstNotPositiv] = table[1][iAmax];
            table[2][firstNotPositiv] = table[2][iAmax];
            table[3][firstNotPositiv] = table[3][iAmax];
            table[0][iAmax] = tmp1;
            table[1][iAmax] = tmp2;
            table[2][iAmax] = tmp3;
            table[3][iAmax] = tmp4;

                for (int i = 0; i < firstNotPositiv; i++) {
                    deltaSum += table[3][i];
                    hMax = deltaSum + table[1][iAmax];
                }

        }else {
                dMin = table[2][0];
                for (int i = 0; i < n; i++) {

                        if (table[2][i] < dMin){
                            dMin = table[2][i];
                            idMin = i;
                        }

                }

                int tmp1 = table[0][n-1];
                int tmp2 = table[1][n-1];
                int tmp3 = table[2][n-1];
                int tmp4 = table[3][n-1];
                table[0][n-1] = table[0][idMin];
                table[1][n-1] = table[1][idMin];
                table[2][n-1] = table[2][idMin];
                table[3][n-1] = table[3][idMin];
                table[0][idMin] = tmp1;
                table[1][idMin] = tmp2;
                table[2][idMin] = tmp3;
                table[3][idMin] = tmp4;

                for (int i = 0; i < n; i++) {
                    deltaSum += table[3][i];
                }
                hMax = deltaSum - table[2][n-1];

            }


        System.out.println(Arrays.deepToString(table));
        System.out.println(hMax);
        for (int i = 0; i < n; i++) {
            System.out.print(table[0][i] + " ");
        }



/**
 *
 */
    }
}
