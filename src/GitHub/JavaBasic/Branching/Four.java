package GitHub.JavaBasic.Branching;

import java.util.Scanner;

public class Four {
    public static void main(String[] args){
        double A,B,MIN,MAX,x,y,z,min,med,max,q;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер А прямоугольного отверстия");
        A = s.nextDouble();
        System.out.println("Введите размер B прямоугольного отверстия");
        B = s.nextDouble();
        System.out.println("Введите размер x стороны кирпича");
        x = s.nextDouble();
        System.out.println("Введите размер y стороны кирпича");
        y = s.nextDouble();
        System.out.println("Введите размер z стороны кирпича");
        z = s.nextDouble();
        if (A>B){
            MAX = A;
            MIN = B;
        }else {
            MAX = B;
            MIN = A;
        }
        if (x<y){
            min = x;
            max = y;
        }else {
            min = y;
            max = x;
        }
        if (z>max){
            max = z;
            med = y;
        }else {
            med = z;
        }
        if (med<min){
            q = med;
            med = min;
            min = q;
        }
        if (min<MIN&med<MAX)
            System.out.println("ПРОЛАЗИТ");
        else
            System.out.println("НЕ ЛЕЗЕТ");
    }
}
