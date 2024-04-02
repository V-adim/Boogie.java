package LearningFromEPAM.Chapter2;

import java.util.Scanner;

public class TaskB8 {
    static double num;
    static boolean check = false;
    static int x;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder newNum = new StringBuilder();
        int  chas = 1_000_000;


/**
 * Взаимодействие с пользователем
 */



            System.out.println("Введите число");
            int a = s.nextInt();
            System.out.println("Введите его систему счисления");
            int n = s.nextInt();
            String str = Integer.toString(a);
        System.out.println(str.length());


/**
 * Проверка правильности условия
 */
            for (int k = 0; k < str.length(); k++) {
                if (Character.getNumericValue(str.charAt(k)) >= n) {
                    System.out.println("Число не из этой системы )))\n Ответ будет НЕВЕРЕН!!!");
                    check = true;
                    break;

                 }
            }

/**
 * Перевод в десятичную систему
  */

        int j = 0,d2,d22;
        for (int i = str.length() - 1; i >= 0  ; i--) {
            if (check){
                break;
            }
            double d1 = Math.pow(n,j);
           d22 = str.charAt(i);
           d2 = Character.getNumericValue(d22);
            System.out.println("i "+i+"; d1 "+d1+"; d2 "+d2);
            j++;
            num += d1*d2;
        }
        System.out.println("Число 10-чной системе "+num);

        /**
         * Перевод в другую систему
         */
        System.out.println("Введите желаемую систему");
        n = s.nextInt();
        int y = (int) num;
        while (chas>=n) {
            chas = y / n;
            System.out.println("chas " + chas);
            x = y -  chas*n;
            System.out.println("x " + x);
            newNum.append(x);
            y = chas;
        }
        newNum.append(1);
        System.out.println("получилось " + newNum.reverse());
    }
}
