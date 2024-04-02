package LearningFromEPAM.Chapter1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TaskB7 {
    public static void main(String[] args) {
        int[] ar = new int[] {5,14,156,581,2,54,59,945,6312,4,84,941,56,5646};

        for (int j = (ar.length-1); j >= 0; j--) {

        for (int i = 0; i< j; i++) {
            if (ar[i] > ar[i + 1]) {
                var temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
            }
        }
        }
        System.out.println(Arrays.toString(ar));

        for (int j = (ar.length-1); j >= 0; j--) {

            for (int i = 0; i< j; i++) {
                if (ar[i] < ar[i + 1]) {
                    var temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));

        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

        Integer[] arr = { 5, 2, 1, 8, 10 };
        Arrays.sort(arr, Collections.reverseOrder());
        for (int val : arr) {
            System.out.println(val);
        }

    }
}
