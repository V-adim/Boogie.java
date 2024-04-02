package LearningFromEPAM.Chapter3;

import java.util.Arrays;
import java.util.Random;

/**
 * 5. Определить класс Интервал с учетом включения/невключения концов.
 * Создать методы по определению пересечения и объединения интервалов,
 * причем интервалы, не имеющие общих точек, пересекаться/объединятся не
 * могут. Объявить массив/список/множество из n интервалов и определить
 * расстояние между самыми удаленными концами.
 */
public class TaskB5 {
    public static void main(String[] args) {
        Interval.creatingIntervals();
        Interval.intersection();
        Interval.distanceBetweenOutermostEnds(Interval.combining());
    }

    static class Interval{
         private final int x1, x2;
        static Interval[] intervals = new Interval[10];

        private Interval(int x1, int x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "x1=" + x1 +
                    ", x2=" + x2 +
                    '}';
        }
        static void creatingIntervals(){
            Random rn = new Random();
            for (int i = 0; i < Interval.intervals.length; i++) {
                int x1 = rn.nextInt(200) - 100;
                int x2 = rn.nextInt(200) - 100;
                if (x1 > x2){
                    int a = x1;
                    x1 = x2;
                    x2 = a;
                }
                Interval.intervals[i] = new Interval(x1, x2);
                System.out.println(Interval.intervals[i].toString());
            }
        }
        static void intersection(){

            for (int i = 0; i < intervals.length - 1; i++) {
                if (intervals[i].x2 < intervals[i+1].x1 || intervals[i].x1 > intervals[i+1].x2){
                   System.out.println(intervals[i].toString() + " Doesn't have common points "
                           + intervals[i+1].toString() + "\n");
               }else {
                   int [] ends = new int[4];
                   ends[0] = intervals[i].x1;
                   ends[1] = intervals[i].x2;
                   ends[2] = intervals[i+1].x1;
                   ends[3] = intervals[i+1].x2;
                   Arrays.sort(ends);
                    System.out.println(intervals[i].toString() + " intersects " + intervals[i+1].toString()
                    + " intersection : [ " + ends[1] + " ; " + ends[2] + " ]\n");
               }
            }
        }
        static int[] combining(){
            int x1min = 100;
            int x2max = -100;
            for (Interval in:intervals) {
                if (x1min > in.x1){
                    x1min = in.x1;
                }
                if (x2max < in.x2){
                    x2max = in.x2;
                }
            }
            System.out.println("\n combined interval [ " + x1min + " ; " + x2max + " ]\n");
            return new int[]{x1min,x2max};
        }
        static void distanceBetweenOutermostEnds (int[] x){
            int s = ((x[1] + 100) - (x[0] + 100));
            System.out.println("\ndistanceBetweenOutermostEnds = " + s);
        }
    }
}
