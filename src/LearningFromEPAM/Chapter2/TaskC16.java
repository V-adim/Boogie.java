package LearningFromEPAM.Chapter2;


/**
 * 16. Найти число локальных минимумов. Соседями элемента матрицы назовем
 * элементы, имеющие с ним общую сторону или угол. Элемент матрицы назы-
 * вается локальным минимумом, если он строго меньше всех своих соседей.
 * Случаи, когда элемент находится на краю или углу, не рассматриваем.
 */
public class TaskC16 extends TaskC {
    static int countMin = 0, countRealmin = 0;
    public static void main(String[] args) {
        initAr();
        /**
         * finding local min
         */
        for (int l = 1; l < mainAr.length-1 ; l++) {
            for (int c = 1; c < mainAr.length-1; c++) {
            count(l,c);
            }
        }
        System.out.println("\nAll quantity of min is " + countRealmin);
    }

    /**
     * Method for finding local min
     */
     static int count (int l,int c){
         countMin = 0;
         for (int l1 = l - 1; l1 <= l + 1 ; l1++) {
             for (int c1 = c - 1; c1 <= c + 1 ; c1++) {
                 if (mainAr[l][c] < mainAr[l1][c1]){
                     countMin++;
                     if (countMin==8){
                         countRealmin++;
                         System.out.print("\n\n"+mainAr[l][c]+"    index "+l+";"+c);
                     }
                 }
             }
         }
        return countRealmin;
    }
}
