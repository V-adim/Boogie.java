package LearningFromEPAM.Chapter3;

import java.util.Arrays;
import java.util.Random;

/**
 * Определить класс Массив. Создать методы сортировки: обменная сорти-
 * ровка (метод пузырька); обменная сортировка «Шейкер-сортировка», сор-
 * тировка посредством выбора (метод простого выбора), сортировка вставка-
 * ми: метод хеширования (сортировка с вычислением адреса), сортировка
 * вставками (метод простых вставок), сортировка бинарного слияния, сорти-
 * ровка Шелла (сортировка с убывающим шагом).
 */
public class TaskC18 {
    public static void main(String[] args) {

        System.out.println("Creating array\n" + Arrays.toString(Array.initAr()));
        System.out.println("Buble\n" + Arrays.toString(Array.buble()));
        System.out.println("Shake\n" + Arrays.toString(Array.shake()));
        System.out.println("Choice\n" + Arrays.toString(Array.choice()));
        System.out.println("Insertion\n" + Arrays.toString(Array.insert()));
        

        
    }
    static class Array{
    static Integer[] ar = new Integer[100];

    static Integer[] initAr () {
        Random rn = new Random();
        for (int i = 0; i < 100; i++) {
            ar[i] = rn.nextInt(200) - 100;
        }
        return ar;
    }
    static Integer[] buble () {
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = ar.length - 1; j > i ; j--) {
                if (ar[j] < ar[j-1]){
                    int tmp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = tmp;
                }
            }
        }
        return ar;
    }
    static Integer[] shake () {
        int left = 0;
        int right = ar.length - 1;
        while (left < right) {
            for (int j = left; j < right; j++) {
                if (ar[j] < ar[j + 1]) {
                    int tmp = ar[j + 1];
                    ar[j + 1] = ar[j];
                    ar[j] = tmp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (ar[i - 1] < ar[i]) {
                    int tmp = ar[i];
                    ar[i] = ar[i - 1];
                    ar[i - 1] = tmp;
                }
            }
            left++;
        }
        return ar;
    }
    static Integer[] choice(){
        for (int j = 0; j < ar.length; j++) {
            int min = ar[j];
            int index = j;
        for (int i = j; i < ar.length; i++) {
            if (ar[i] < min){
              index = i;
              min = ar[i];
            }
        }
        int tmp = ar[j];
        ar[j] = min;
        ar[index] = tmp;
    }
        return ar;
    }
    static Integer[] insert(){
        for (int i = 0; i < ar.length; i++) {
            int tmp = ar[i];
            for (int j = i - 1; j >= 0 ; j--) {
                if (tmp > ar[j]){
                    ar[j+1] = ar[j];
                    ar[j] = tmp;
                }else {
                    break;
                }
            }
        }
        return ar;
    }



    }

}
