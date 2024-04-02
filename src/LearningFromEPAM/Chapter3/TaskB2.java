package LearningFromEPAM.Chapter3;

import java.util.ArrayList;

/**
 * 2. Определить класс Комплекс. Создать массив/список/множество размерно-
 * сти n из комплексных координат. Передать его в метод, который выполнит
 * сложение/умножение его элементов.
 */
public class TaskB2 {
    public static void main(String[] args) {
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber1);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber2);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber3);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber4);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber5);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber6);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber7);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber8);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber9);
        ComplexNumber.complexNumbers.add(ComplexNumber.complexNumber10);

        for (ComplexNumber c : ComplexNumber.complexNumbers) {
            System.out.println(c.toString());
        }

        System.out.println("\nadding itself to each element\nand adding 7 to 'a' because of collision in future ");
        ComplexNumber.addition(ComplexNumber.complexNumbers);
        ComplexNumber.multiplication(ComplexNumber.complexNumbers,ComplexNumber.complexNumbersAddition);
    }
    static class ComplexNumber {
        private final int realNumber;
        private final int imaginaryNumber;
        ComplexNumber(int realNumber, int imaginaryNumber) {
            this.realNumber = realNumber;
            this.imaginaryNumber = imaginaryNumber;
        }
        @Override
        public String toString() {
            return "ComplexNumber{ z = " +
                    "(realNumber)" + realNumber +
                    " + (imaginaryNumber)" + imaginaryNumber +
                    "*i }";
        }
        static ArrayList<ComplexNumber> complexNumbers = new ArrayList<>();
        static ArrayList<ComplexNumber> complexNumbersAddition = new ArrayList<>();
        static ArrayList<ComplexNumber> complexNumbersMultiplication = new ArrayList<>();
        static ComplexNumber complexNumber1 = new ComplexNumber(561, 62);
        static ComplexNumber complexNumber2 = new ComplexNumber(61, 32);
        static ComplexNumber complexNumber3 = new ComplexNumber(3, -12);
        static ComplexNumber complexNumber4 = new ComplexNumber(61, -51);
        static ComplexNumber complexNumber5 = new ComplexNumber(-15, 65);
        static ComplexNumber complexNumber6 = new ComplexNumber(-54, 0);
        static ComplexNumber complexNumber7 = new ComplexNumber(6, 62);
        static ComplexNumber complexNumber8 = new ComplexNumber(95, 26);
        static ComplexNumber complexNumber9 = new ComplexNumber(-6, -45);
        static ComplexNumber complexNumber10 = new ComplexNumber(58, 89);
        static void addition(ArrayList<ComplexNumber> complexNumbers) {
            for (ComplexNumber c : complexNumbers) {
                int a = c.realNumber + c.realNumber + 7;
                int b = c.imaginaryNumber + c.imaginaryNumber;
                complexNumbersAddition.add(new ComplexNumber(a, b));
                }
            for (ComplexNumber c:complexNumbersAddition) {
                System.out.println(c.toString());
            }
        }
        static void multiplication(ArrayList<ComplexNumber> complexNumbers,
                                   ArrayList<ComplexNumber> complexNumbersAddition){
            System.out.println("\nMultiplication of complex numbers\n");
            for (int i = 0; i < complexNumbersAddition.size(); i++) {
                /**
                 * Multiplication of complex numbers is determined by the rule:
                 * (a1 + b1i) (a2 + b2i) = (a1a2 - b1b2) + (a1b2 - a2b1)*i.
                 */
                int a1 = ComplexNumber.complexNumbers.get(i).realNumber;
                int b1 = ComplexNumber.complexNumbers.get(i).imaginaryNumber;
                int a2 = ComplexNumber.complexNumbersAddition.get(i).realNumber;
                int b2 = ComplexNumber.complexNumbersAddition.get(i).imaginaryNumber;
                int a3 = a1*a2 - b1*b2;
                int b3 = a1*b2 - a2*b1;
                complexNumbersMultiplication.add(new ComplexNumber(a3,b3));
            }
            for (ComplexNumber c:complexNumbersMultiplication) {
                System.out.println(c.toString());
            }
        }
    }
}


