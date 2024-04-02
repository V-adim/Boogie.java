package LearningFromEPAM.Chapter3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class tryyyyy {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(new Integer[]{1531,2,23,2,323,2,323,2,321,31,356113,125,5}));
//        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println(numbers.stream().toString());
        for (var v :numbers.toArray()) {
            System.out.println(v);
        }
//        System.out.println( min);
//        System.out.println(min.get());





    }
}
