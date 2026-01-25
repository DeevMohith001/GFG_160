import java.util.Arrays;

public class q03_reverseArray {
    public static void main(String[] args) {
        int[] arr = {23, 2, 4, 123, 5, 11};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int e = arr.length-1;
        for (int i = 0; i < e; i++) {
            int temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
            e--;
        }

    }
}
