import java.util.Arrays;

public class printArray {
    public static void main(String[] args){
        Integer [] arr = {1,2,3,4,5};
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);

        for (int value:arr)
            System.out.println(value);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
    }
}
