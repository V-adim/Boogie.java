public class massiv {
    public static void main (String[] args) {
        int[] nums1 = new int[]{3, 5, 34, 45, 23, -34, 23, 232, 23, 1, 32, 67, 87, 65, 43, 54};
        System.out.println(nums1.length);
        int min = nums1[0];
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < min) {
                min = nums1[i];
            }

            System.out.println(nums1[i]);
        }
        System.out.println("minim=" + min);


        int[][] nums2 = new int[][]{
                {23, -134, 67, 87, 34},
                {-23, -93, 11, 54, -32, -3000}
        };
        min = nums2[0][0];
        for (int i=0; i< nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.println(nums2[i][j]);
                if (nums2[i][j] < min) {
                    min = nums2[i][j];
                }
            }
        }
        System.out.println("min2 = "+min);
    }
}