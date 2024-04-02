package LearningFromEPAM.Chapter3;


import java.util.*;

public class ttrryy {
    public static void main(String[] args) {

        Ob.initObs();
        System.out.println(Ob.obs.get(0));
        System.out.println(Arrays.toString(Ob.obs.toArray()));

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(55);
        nums.add(62);
        nums.add(+652);
        nums.add(61);
        nums.add(616);
        nums.add(616);
        nums.add(616);
        for (Integer n:nums
             ) {
            System.out.println(n);
        }

        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(55);
        nums2.add(62);
        nums2.add(652);
        nums2.add(61);
        nums2.add(616);
        nums2.add(616);
        nums2.add(616);
        System.out.println("printing set");
        System.out.println(nums2.size());
        for (Integer n:nums2
        ) {
            System.out.println(n);
        }

        class Song {
            Song song = new Song();

        }







    }

    static class Ob{
        int a, b, c;
        Ob (int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString() {
            return "Ob{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    '}';
        }
        static ArrayList<Ob> obs = new ArrayList<>();
        static void initObs (){
            Random rn = new Random();

            for (int i = 0; i < 10; i++) {
                obs.add(new Ob(rn.nextInt(10), rn.nextInt(10), rn.nextInt(10)));
                System.out.println(obs.get(i));
            }
        }


}

}


