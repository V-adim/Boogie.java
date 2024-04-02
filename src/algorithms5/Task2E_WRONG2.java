package algorithms5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2E_WRONG2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] table = new int[4][n];

        int amax, g = -1, am = -1, firNeg = -1, change = -1;


            for (int i = 0; i < n; i++) {
                table[0][i] = i + 1;
                table[1][i] = s.nextInt();
                table[2][i] = s.nextInt();
                table[3][i] = table[1][i] - table[2][i];
            }

        System.out.println(Arrays.deepToString(table));


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (table[3][i] < table[3][j]){
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



        boolean neg = false;
        for (int i = n - 1; i >= 0 ; i--) {
            if (table[3][i] <= 0){
                g = i;
                neg = true;
                break;
            }
        }

        System.out.println(Arrays.deepToString(table));

        if (neg){
            for (int i = 0; i < n; i++) {
                if (table[3][i] <= 0){
                    firNeg = i;
                }
            }
            amax = table[1][g];
            for (int i = g; i < n; i++) {
                if (table[1][i] > amax){
                    amax = table[1][i];
                    am = i;
                }
            }

        change = firNeg;



        }else {
            amax = table[1][0];
            for (int i = 0; i < n; i++) {
                if (table[1][i] > amax){
                    amax = table[1][i];
                    am = i;
                }
            }
        }



        int tmp1 = table[0][change];
        int tmp2 = table[1][change];
        int tmp3 = table[2][change];
        int tmp4 = table[3][change];
        table[0][change] = table[0][am];
        table[1][change] = table[1][am];
        table[2][change] = table[2][am];
        table[3][change] = table[3][am];
        table[0][am] = tmp1;
        table[1][am] = tmp2;
        table[2][am] = tmp3;
        table[3][am] = tmp4;


/**
 *
 */
    }
}
