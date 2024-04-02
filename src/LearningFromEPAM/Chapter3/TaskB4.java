package LearningFromEPAM.Chapter3;

import java.util.Arrays;
import java.util.Random;

/**
 * 4. Определить класс Полином степени n. Объявить массив/список/множест-
 * во из m полиномов и определить сумму полиномов массива.
 */
public class TaskB4 {
    public static void main(String[] args) {
        Random rn = new Random();
        for (int i = 0; i < Polynomial.polynomials.length; i++) {
            Polynomial.polynomials[i] = new Polynomial( rn.nextInt(100), rn.nextInt(100),rn.nextInt(100),
                    rn.nextInt(100), rn.nextInt(100), rn.nextInt(100));
        }
        System.out.println(Arrays.toString(Polynomial.polynomials));
        Polynomial.InitNewPolAr();
        System.out.println(Arrays.toString(Polynomial.polynomials2));
        Polynomial.sum();
        System.out.println(Arrays.toString(Polynomial.sum));
        }
    static class Polynomial{
         private final int a5, a4, a3, a2, a1, a0;
         private Polynomial(int a5, int a4, int a3, int a2, int a1, int a0) {
            this.a5 = a5;
            this.a4 = a4;
            this.a3 = a3;
            this.a2 = a2;
            this.a1 = a1;
            this.a0 = a0;
        }
        @Override
        public String toString() {
            return "Polynomial{" + a5 + "*x^5 + " +
                     a4 + "*x^4 + "  +
                     a3 + "*x^3 + " +
                     a2 + "*x^2 + " +
                     a1 + "*x^1 + " +
                     a0 + '}';
        }
        static Polynomial[] polynomials = new Polynomial[6];
        static Polynomial[] polynomials2 = new Polynomial[6];
        static Polynomial[] sum = new Polynomial[6];

        static void InitNewPolAr (){
            System.out.println("Initialise new array of polynomials");
            Random rn = new Random();
            for (int i = 0; i < Polynomial.polynomials2.length; i++) {
                Polynomial.polynomials2[i] = new Polynomial( rn.nextInt(100), rn.nextInt(100),rn.nextInt(100),
                        rn.nextInt(100), rn.nextInt(100), rn.nextInt(100));
            }
        }
        static void sum(){
            System.out.println("Printing the sum of two arrays:");
            for (int i = 0; i < Polynomial.sum.length; i++) {
                Polynomial.sum[i] = new Polynomial(Polynomial.polynomials[i].a5 + polynomials2[i].a5,
                        Polynomial.polynomials[i].a4 + polynomials2[i].a4,
                        Polynomial.polynomials[i].a3 + polynomials2[i].a3,
                        Polynomial.polynomials[i].a2 + polynomials2[i].a2,
                        Polynomial.polynomials[i].a1 + polynomials2[i].a1,
                        Polynomial.polynomials[i].a0 + polynomials2[i].a0);
                System.out.println();
            }
        }
    }
}
