package LearningFromEPAM.Chapter2;

public class TaskA4 extends TaskA3{
    static int coincidence;

    public static void main(String[] args) {

        int minC;


        for (var t:mainAr) {
            System.out.println("NUMBER " + t);
            for (int i = 0; i < t.length() ; i++) {
                System.out.println(" digit " + i + "---" + t.charAt(i));

                boolean haveCoincidence = false;
                coincidence = 0;

                for (int j = i+1; j < t.length(); j++) {
                    haveCoincidence = false;

                    if (t.charAt(i) == t.charAt(j)){
                      coincidence ++;
                      haveCoincidence = true;

                    }

                    if (haveCoincidence){
                        System.out.println("coincidence on NUMBER "+t+"---" + coincidence);

                }


                }
                if (!haveCoincidence){
                    System.out.println("NUMBER " + t + " no coincidence\n");

                }
            }

        }

    }
}
