package LearningFromEPAM.Chapter1;

import java.util.Scanner;

public class TaskA1 {

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hi," + name + "!");
    }
}
//    PS C:\Users\васья\IdeaProjects\start\src\LearningFromEPAM> javac .\TaskA1.java
//
//        PS C:\Users\васья\IdeaProjects\start\src> java LearningFromEPAM.Chapter1.TaskA1
//        Enter your name
//        vadim
//        Hi,vadim!
