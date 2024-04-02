package LearningFromEPAM.Chapter2;

import java.util.Scanner;

public class TaskB7 {
    public static void main(String[] args) {
        int c, d;
        StringBuilder otv = new StringBuilder();
        /**
         * Взаимодействуем с пользователем
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в десятичной системе");
        int a = scan.nextInt();
        System.out.println("Введите цифрой систему к которой нужно привести");
        int b = scan.nextInt();
        /**
         * Считаем и формируем ответ в String
         */
        do {
            d = a / b;
            c = a - d * b;
            otv.append(c);
            a = d;
        }while (d != 1);
        /**
         * Печатаем ответ
         */
        System.out.print(d);
        System.out.println(otv.reverse());
    }
}
