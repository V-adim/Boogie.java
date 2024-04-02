package GitHub.JavaBasic.Branching;

import java.util.Scanner;

public class Three {
    public static void main(String[] args){
        double x1,x2,x3,y1,y2;
        double y3 = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите координату x первой точки");
        x1 = s.nextDouble();
        System.out.println("Введите координату y первой точки");
        y1 = s.nextDouble();
        System.out.println("Введите координату x второй точки");
        x2 = s.nextDouble();
        System.out.println("Введите координату y второй точки");
        y2 = s.nextDouble();
        System.out.println("Введите координату x третьей точки");
        x3 = s.nextDouble();
        System.out.println("Введите координату y третьей точки");
        x3 = s.nextDouble();

        if ((y1-y2)/(y3-y2)==(x1-x2)/(x3-x2)) {
            System.out.println("Все три точки лежат на одной прямой");
        }
        else {
            System.out.println("Это ломаная");
        }

    }
}
