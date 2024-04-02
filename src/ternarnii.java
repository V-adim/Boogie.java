import java.util.Scanner;

public class ternarnii {
    public static void main (String[] args){
        System.out.println("Введите число 1");
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        System.out.println("Введите число 2");
        double b = sc.nextDouble();

        double c = a > b ? a:b;
        System.out.println("Максимум из них: " + c);

        System.out.println("Введите число 1 c шестью цифрами после запятой");
        double d = sc.nextDouble();
        System.out.println("Введите число 2 c шестью цифрами после запятой");
        double e = sc.nextDouble();
        if (Math.abs(d-e)<0.000001) {
            System.out.println("ЧИСЛА ПРАКТИЧЕСКИ РАВНЫ");
                    }
            else
            System.out.println("ОТЛИЧАЮТСЯ");
    }
}
