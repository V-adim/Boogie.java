package GitHub.JavaBasic.Loops;

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        double a,b,h,y = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите координату начала отрезка");
        a = s.nextDouble();
        System.out.println("Введите координату конца отрезка");
        b = s.nextDouble();
        System.out.println("Введите шаг изменения координаты");
        h = s.nextDouble();

        for (double x = a; x<b; ){
            if (x<=2){
                y=-x;
                            }
            else if (x>2) {
                y=x;
            }
            System.out.println("Y на отрезке в точке с x="+x+"будет =" + y);
            x=x+h;
        }
    }
}
