package LearningFromEPAM.Chapter1;

public class TaskB6 {
    public static void main(String[] args) {
                    // exception
                System.out.println("2");
            // exception
        for (int i = 1;i<10000;i++) {
             for (int j = (i - 1); j > 1; j--) {
                if ( i % j == 0) {
                                     break;
                }
             else if (j==2) {
                    System.out.println(i);
                }
            }
        }
    }
}
