package LearningFromEPAM.Chapter2;

public class TaskA5 extends TaskA3{
    static int even;
    public static void main(String[] args) {
        /**
         * вызываем Метод для создания и инициализации массива чисел
         * @return String массив mainAr введенных чисел
         */


        for (int i = 0; i < mainAr.length; i++) {
            for (int j = 0; j < mainAr[i].length(); j++) {
                if (mainAr[i].charAt(j) % 2 != 0){
                    break;
                }
                if (j+1==mainAr[i].length()){
                    even++;
                    System.out.println("all digits are even - " + mainAr[i]);
                }
            }
        }
        System.out.println(even);
    }
}
