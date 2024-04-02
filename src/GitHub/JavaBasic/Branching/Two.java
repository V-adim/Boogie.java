package GitHub.JavaBasic.Branching;

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        int a,b,c,d,min1,min2,max;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число а");
        a=s.nextInt();
        System.out.println("Введите число b");
        b=s.nextInt();
        System.out.println("Введите число c");
        c=s.nextInt();
        System.out.println("Введите число d");
        d=s.nextInt();

        min1= a<b? a:b;
        min2= c<d? c:d;
        max=min1>min2?min1:min2;
        System.out.println("Вопрос: Найти max{min(a,b),min(c,d)\nОтвет: мах="+max);

    }
}
