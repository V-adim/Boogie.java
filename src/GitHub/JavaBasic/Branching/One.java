package GitHub.JavaBasic.Branching;

import java.util.Scanner;

public class One {
    public static void main(String[] args){
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение первого угла в градусах");
        a=s.nextInt();
        System.out.println("Введите значение второго угла в градусах");
        b=s.nextInt();
        c=180-a-b;
        if (c>0){
            System.out.println("Треугольник получился");
        }
        else System.out.println("Треугольник NE получился");
        if (a==90|b==90|c==90){
            System.out.println("Он еще и прямоугольный!!!");
        }


    }
}
