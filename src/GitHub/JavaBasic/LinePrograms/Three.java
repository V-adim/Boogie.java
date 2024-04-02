package GitHub.JavaBasic.LinePrograms;

import java.util.Scanner;

public class Three {
    public static void main (String[] args){
        double x;
        double y;
        double z;
        Scanner s = new Scanner(System.in);

        System.out.println("Введите число x ");
        x= s.nextDouble();
        System.out.println("Введите число y ");
        y= s.nextDouble();
        z= (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.log10(x*y);
        System.out.println("По формуле z= (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.log(x*y) \n"+"z=" + z);
    }
}
