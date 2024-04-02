package GitHub.JavaBasic.LinePrograms;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        double x, y;
        System.out.println("Введите число формата nnn.ddd\n (вводить обязательно через запятую)");
        Scanner s = new Scanner(System.in);//вводить обязательно через запятую
        x = s.nextDouble();
        y = (x-(double) Math.round(x % 1 * 1000)/1000)/1000+Math.round(x % 1 * 1000);
        System.out.println("проверка y="+y);
    }
}