package GitHub.JavaBasic.Loops;

import java.util.Scanner;

public class One {
    public static void main(String[] args){
        int a,i=0,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        a = s.nextInt();
        for (;i<a;i++){
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел до введенного\n"+sum);
    }
}
