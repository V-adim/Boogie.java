package LearningFromEPAM.Chapter1;

public class TaskB9 {
    public static void main(String[] args) {

        for (int a = 7; a <9 ; a++) {
        int s = sum1(a);
        if (s ==1) {
            System.out.println(a);
        }
        else {
            while (s != 1){
                s = sum1(s);
                System.out.println(s);
            }
        }
        }
    }

        public static int sum1 (Integer i){
            int i1, i2, sum = 0;
            String ii = i.toString();
            for (int j = 0; j < ii.length(); j++) {
                i1 = Character.getNumericValue(ii.charAt(j));
                i2 = i1 * i1;
                sum += i2;
//               System.out.println("квадрат цифры" + i2);
            }
//            System.out.println("Сумма квадратов всех цифр" + sum);
            return sum;
        }






}
