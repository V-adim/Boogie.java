package GitHub.JavaBasic.LinePrograms;

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        double a;
        double b;
        double c;
        double z;
        Scanner s = new Scanner(System.in);

        System.out.println("Введите число а ");
        a= s.nextDouble();
        System.out.println("Введите число b ");
        b= s.nextDouble();
        System.out.println("Введите число c ");
        c= s.nextDouble();

        z= (b+Math.sqrt(b*b+4*a*c))/2*a-a*a*a*c+Math.pow(b,-3);
        System.out.println("По формуле z=(b+Math.sqrt(b*b+4*a*c))/2*a-a*a*a*c+Math.pow(b,-3) \n"+"z=" + z);
    }
}
