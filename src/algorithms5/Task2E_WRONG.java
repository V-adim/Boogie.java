package algorithms5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2E_WRONG {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] deltaH = new int[n];
        ArrayList<Integer> order = new ArrayList<>();
        int countPositiv = 0, countNegative = 0, countZero = 0;
        int amax = -1, j = -1, k = 0, hSum = 0;

        for (int i = 0; i < n; i++) {

            a[i] = s.nextInt();
            b[i] = s.nextInt();
            deltaH[i] = a[i] - b[i];

            if (deltaH[i] > 0){
                countPositiv += 1;
                order.add(i + 1);
                k++;
            }else {
                if (deltaH[i] < 0){
                    countNegative += 1;
                    if (a[i] > amax) {
                        amax = a[i];
                        j = i;
                        System.out.println("j=" + j);
                    }
                }else {
                    countZero += 1;
                    if (a[i] > amax) {
                        amax = a[i];
                        j = i;
                        System.out.println("j=" + j);
                    }
                }
            }

        }
        System.out.println(" + " + countPositiv);
        System.out.println(" - " + countNegative);
        System.out.println(" 0 " + countZero);
        System.out.println("amax=" + amax);
        System.out.println("j=" + j);

        order.add(j + 1);

        System.out.println(order);

        for (int i = 0; i < j; i++) {
            hSum += deltaH[i];
        }
        System.out.println(hSum + a[j]);

        for (int i = 0; i < j; i++) {
            if (deltaH[i] <= 0){
                order.add(i + 1);
            }
            else {

            }
        }
        for (int i = j + 1; i < n; i++) {
            if (deltaH[i] <= 0){
                order.add(i + 1);
            }
        }



        for (int i = 0; i < n; i++) {
            System.out.print(order.get(i) + " ");
        }









    }
}
