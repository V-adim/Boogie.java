package GitHub.JavaBasic.LinePrograms;

import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        int x,h,m,mm,s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время в секундах\n");
        x= scanner.nextInt();
        s=x%60;

        m=(x-s)/60;
        h=m/60;
        m=m%60;

        System.out.println("HH "+h+" MM "+m+" SS "+s);
    }
}
