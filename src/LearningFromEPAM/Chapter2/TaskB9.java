package LearningFromEPAM.Chapter2;

import java.util.Scanner;

/**
 * 9. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствую-
 * щего данному числу. Осуществить проверку корректности ввода чисел.
 */
public class TaskB9 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of month");
        a = s.nextInt();

        switch (a){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("WRONG ENTER!!!!!");

        }
    }
}
