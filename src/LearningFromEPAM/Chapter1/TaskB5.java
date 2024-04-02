package LearningFromEPAM.Chapter1;

public class TaskB5 {
    public static void main(String[] args) {

        for (int i = 100; i<1000; i++){
            String a = Integer.toString(i);
            if (a.charAt(0) != a.charAt(1) & a.charAt(0) != a.charAt(2) & a.charAt(1) !=a.charAt(2))
            System.out.println(a);
        }
    }
}
