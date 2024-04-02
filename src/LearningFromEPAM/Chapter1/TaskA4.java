package LearningFromEPAM.Chapter1;

import java.util.Scanner;

public class TaskA4 {
    public static void main(String[] args) {
        String parol = "e9p2a8m3";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter password");
        String p = s.next();
        if (p.equals(parol)){
            System.out.println("Congratulations!!!");
        }
        else
            System.out.println("Try again (((");
    }
}
