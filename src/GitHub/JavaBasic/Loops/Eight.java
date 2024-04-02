package GitHub.JavaBasic.Loops;

import java.util.Scanner;

public class Eight {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число");
        String A = s.nextLine();
        System.out.println("Введите второе число");
        String B = s.nextLine();

        for (int i=0;i<A.length();i++)
            System.out.println("Первое число состоит из цифры: "+A.charAt(i));

        for (int i=0;i<B.length();i++)
            System.out.println("Второе число состоит из цифры: "+B.charAt(i));
    }
}
