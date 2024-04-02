package LearningFromEPAM.Chapter3;
/**
 * 1. Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
 * Объявить и инициализировать массив из k дробей, ввести/вывести значе-
 * ния для массива дробей. Создать массив/список/множество объектов и пе-
 * редать его в метод, который изменяет каждый элемент массива с четным
 * индексом путем добавления следующего за ним элемента.
 */
public class TaskB1 {
    public static void main(String[] args) {
        for (int i = 0; i < Fraction.fractions.length ; i++) {
            Fraction.fractions[i] = new Fraction(i*2,i*3);
            System.out.println(i + "element");
            System.out.println(Fraction.fractions[i]);
        }
       Fraction.fractions2(Fraction.fractions);
        for (var v:Fraction.fractions2)
        {
            System.out.println(v);
        }
        }
    }
         class Fraction{
        private int m, n;
        Fraction (int m, int n){
            this.m = m;
            this.n = n;
        }
             @Override
             public String toString() {
                 return "Fraction{" +
                         "m=" + m +
                         ", n=" + n +
                         '}';
             }
         static Fraction[] fractions = new Fraction[11];
        static Fraction[] fractions2 = new Fraction[11];
             static void fractions2(Fraction[] fractions){
                fractions2 = fractions;
                 for (int i = 0; i < fractions2.length-1; i++) {
                     if (i!=0 && i%2==0) {
                         fractions2[i].m = fractions[i].m + fractions[i+1].m;
                         fractions2[i].n = fractions[i].n + fractions[i+1].n;

                     }
                 }
             }
    }


