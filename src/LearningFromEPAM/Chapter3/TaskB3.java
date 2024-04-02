package LearningFromEPAM.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 3. Определить класс Квадратное уравнение. Реализовать методы для поиска
 * корней, экстремумов, а также интервалов убывания/возрастания. Создать
 * массив/список/множество объектов и определить наибольшие и наимень-
 * шие по значению корни.
 */
public class TaskB3 {
    public static void main(String[] args) {
        QuadraticEquation.equations.addAll(Arrays.asList(QuadraticEquation.equation, QuadraticEquation.equation1,
                        QuadraticEquation.equation2, QuadraticEquation.equation3, QuadraticEquation.equation4,
                        QuadraticEquation.equation5, QuadraticEquation.equation6));
        for (QuadraticEquation eq:QuadraticEquation.equations) {
            System.out.println(eq.toString());
            eq.roots();
            eq.extremum();
            eq.decreasingInterval();
            eq.increasingInterval();
            eq.maxMinRoots();
        }

    }

    static class QuadraticEquation {
        static QuadraticEquation equation = new QuadraticEquation(1, 22, 1);
        static QuadraticEquation equation1 = new QuadraticEquation(4,5,5);
        static QuadraticEquation equation2 = new QuadraticEquation(6,4,-5);
        static QuadraticEquation equation3 = new QuadraticEquation(-9,8,1);
        static QuadraticEquation equation4 = new QuadraticEquation(-41,51,15);
        static QuadraticEquation equation5 = new QuadraticEquation(-11,-21,11);
        static QuadraticEquation equation6 = new QuadraticEquation(-41,5,5);

        static ArrayList<QuadraticEquation> equations = new ArrayList<>();

        private final double a, b, c;
        private double x1, x2, xEx;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;

        }

        @Override
        public String toString() {
            return "\nQuadraticEquation{ y = " +
                    a +
                    " * x'2 + " + b +
                    " * x + " + c
                    +
                    '}';
        }

        void roots() {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            System.out.println("discriminant = " + discriminant);
            if (discriminant < 0) {
                System.out.println("the equation has no real roots");
            }

            if (discriminant == 0) {
                System.out.println("the equation has one root");
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x = " + x1);
            }
            if (discriminant > 0) {
                System.out.println("the equation has two roots");
                x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
                System.out.println("x1 = " + x1);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("x2 = " + x2);
            }
        }

        void extremum() {
            xEx = -b / 2 * a;
            double yEx = c - (Math.sqrt(b) / (4 * a));
            System.out.println("coordinates of extremum\nx = " + xEx + " y = " + yEx);
        }

        void decreasingInterval() {
            if (a > 0) {
                System.out.println("decreasing interval (-∞ ; " + xEx + " )");
            } else {
                if (a != 0) {
                    System.out.println("decreasing interval ( " + xEx + ";  +∞ )");
                }
            }
        }

        void increasingInterval() {
            if (a > 0) {
                System.out.println("increasing interval ( " + xEx + ";  +∞ )");
            } else {
                if (a != 0) {
                    System.out.println("increasing interval (-∞ ; " + xEx + " )");
                }
            }
        }
        void maxMinRoots(){
            ArrayList<Double> roots = new ArrayList<>();
            for (QuadraticEquation eq:QuadraticEquation.equations) {
               roots.add(eq.x1);
               roots.add(eq.x2);
            }
            System.out.println("x_max = " + Collections.max(roots));
            System.out.println("x_min = " + Collections.min(roots));
            System.out.println(Arrays.toString(roots.toArray()));
        }
    }
}
