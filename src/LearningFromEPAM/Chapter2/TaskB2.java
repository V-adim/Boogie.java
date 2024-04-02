package LearningFromEPAM.Chapter2;

import java.util.Arrays;

public class TaskB2 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int [] nums2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums2 [nums.length - 1 - i] = nums [i];
        }
        System.out.println(Arrays.toString(nums2));
    }
}
