package GitHub.JavaBasic.LinePrograms;

import java.util.Scanner;

public class One {
    public static void main (String[] args){
        int a,b,c,z;
        Scanner s = new Scanner(System.in);

        System.out.println("Введите число а ");
        a= s.nextInt();
        System.out.println("Введите число b ");
        b= s.nextInt();
        System.out.println("Введите число c ");
        c= s.nextInt();

        z=((a-3)*b/2)+c;
        System.out.println("По формуле z=((a-3)*b/2)+c \n"+"z=" + z);
    }
}
