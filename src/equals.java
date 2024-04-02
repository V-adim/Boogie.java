import java.util.Scanner;

public class equals {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("введите логин: ");
        String log = scan.nextLine();

        if (log.equals("admin")) {
            System.out.println("введите пароль");
            String parol = scan.nextLine();
            if (parol.equals("123"))
                System.out.println("CONGRATULATIONS!!!!!");
            else System.out.println("ХТО ТЫ?");



        }
         else System.out.println("ХТО ТЫ?");
    }
           }
