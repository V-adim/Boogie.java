package GitHub.JavaBasic.LinePrograms;

import java.util.Scanner;

public class Six {
    public static void main (String[] args){
        double x,y;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите координату x");
        x=s.nextDouble();
        System.out.println("Введите координату y");
        y=s.nextDouble();
        System.out.println("Координаты нашей точки: ("+x+","+ y+")");

        if (x>-2&&x<2&&y>-1.5&&y<0){
            System.out.println("Мы попали!!!");
        } else if (x>-1&&x<1&&y>-1.5&&y<2) {
            System.out.println("Мы попали!!!");
        }
        else System.out.println("Мимо!!!");


    }
}
