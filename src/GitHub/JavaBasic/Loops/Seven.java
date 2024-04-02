package GitHub.JavaBasic.Loops;

import java.util.Scanner;

public class Seven {
    public static void main(String[]args){
        int m,n,min,max;
        double k;
        Scanner s=new Scanner(System.in);
        System.out.println("Введите натуральное число m");
        m=s.nextInt();
        System.out.println("Введите натуральное число n");
        n=s.nextInt();
        min = m<n?m:n;
        max = m>n?m:n;

        for (int i=min;i<=max;i++){
            for (int j=2;j<(max-1);j++){
                k = i%j;
                if (k==0&i!=j){
                    System.out.println("Делитель "+i+" будет "+j);
                }
            }

        }
    }
}
