package GitHub.JavaBasic.Loops;

import java.util.Scanner;

public class Six {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите набор символов с клавиатуры");
        String x = s.nextLine();
        for (int i=0;i<x.length();i++){
            System.out.println("символ: "+x.charAt(i));
            int y = x.charAt(i);
            System.out.println("в памяти компьютера: "+y);
        }

       }
}
