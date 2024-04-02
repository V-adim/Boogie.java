package GitHub.JavaBasic.Loops;

import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        double a,n=1,e,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите некоторое число e");
        e=s.nextDouble();

        do {
            a=1/Math.pow(2,n)+1/Math.pow(3,n);
            if (Math.abs(a)>e){
                sum=sum+a;
            }
                  n++;
            
        }
        while (Math.abs(a)>e);
        System.out.println("Сумма всех элементов ряда\nмодуль которых меньше е равна\n"+sum);



       }
}
