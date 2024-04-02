import java.util.Scanner;
public class scanner {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("ВВЕДИТЕ ЧИСЛО\n желательно до 1000");
        int a = scan.nextInt();
        if (a> 100 && a<1000) {
            System.out.println("СОТНЯ С ЛИШНИМ!!!!!!!!!");

        }

        else if (a<100){
            System.out.println("ДО СОТНИ НЕ ДОТЯНУЛИ!!!!!!!!!");
        }
        else
            System.out.println("ЭЭЭ!!! МНОГОВАТО БУДЕТ!!!");
    }

}