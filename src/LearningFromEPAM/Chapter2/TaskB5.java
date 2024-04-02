package LearningFromEPAM.Chapter2;

import java.util.Arrays;

public class TaskB5 {
    static int d,ost;
    public static void main(String[] args) {
         int a = 0,b,c,chastnoe;
         d = 129;

         int [] two = new int[10];
        int i = 0;
        do {

            two[i] = d%2;
            if (d%2==0){
                a++;
            }
            System.out.println("two[" + i + "] = " + two[i]);
            d /= 2;
            i++;
            System.out.println(" i = " + i);

        }while ( d != 1);
        if (d == 1){
            two [i] = 1;
            System.out.println("two [" + i + "] = " + two[i]);

        }
        System.out.println("Количество значащих нулей = " + a);

    }
}
