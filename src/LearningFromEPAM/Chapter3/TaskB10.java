package LearningFromEPAM.Chapter3;

import java.util.ArrayList;
import java.util.Random;

/**
 * 10. Определить класс Прямая на плоскости (пространстве). Определить точки
 * пересечения прямой с осями координат. Определить координаты пересече-
 * ния двух прямых. Создать массив/список/множество объектов и опреде-
 * лить группы параллельных прямых.
 */
public class TaskB10 {
    public static void main(String[] args) {

        StraightOnPlane.initStraits();
        StraightOnPlane.detCrossAxes(StraightOnPlane.straights);
        StraightOnPlane.interCoord();


    }
    static class StraightOnPlane {
        /**
         * a*x + b*y + c = 0
         */

         private final int a, b, c;
        static private double x;
        static private double y;
        StraightOnPlane (int a, int b, int c){
            this.a = a;
           this.b = b;
            this.c = c;
        }

        @Override
        public String toString() {
            return "StraightOnPlane{ " + a + "*x + " + b + "*y + " + c + "= 0 " + '}';
        }
        static ArrayList <StraightOnPlane> straights = new ArrayList<>();

        static void initStraits (){
            System.out.println("Straights:/n");
            Random rn = new Random();
            for (int i = 0; i < 10 ; i++) {
                straights.add(new StraightOnPlane(rn.nextInt(20) - 10,rn.nextInt(20) - 10,
                        rn.nextInt(20) - 10));
                System.out.println(straights.get(i).toString());
            }
        }
         static void detCrossAxes (ArrayList<StraightOnPlane> straights){
             System.out.println("\nCrossing X - axe");
            for (StraightOnPlane s:straights) {
                x = (double) (-s.c) /s.a;
                System.out.println(s.toString() + "crossing the Axe X on: ( " + x + " ; 0 ) ");
            }
             System.out.println("\nCrossing Y - axe");
             for (StraightOnPlane s:straights) {
                 y = (double) (-s.c) /s.b;
                 System.out.println(s.toString() + "crossing the Axe Y on: (  0  ; " + y + " )");
             }
        }
        static void interCoord(){
            for (int i = 0; i < straights.size() - 1; i++) {
                double a1 = straights.get(i).a;
                double a2 = straights.get(i + 1).a;
                double b1 = straights.get(i).b;
                double b2 = straights.get(i+1).b;
                double c1 = straights.get(i).c;
                double c2 = straights.get(i + 1).c;
                 y =(c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);
                 x = (- b1 * y - c1) / a1;
                System.out.println("\n Coordinates of the intersection of:\n" +
                        straights.get(i).toString() +
                        " and " + straights.get(i+1).toString() +
                        "\n ( " + x + " ; " + y + " )");
            }
        }
    }
}
