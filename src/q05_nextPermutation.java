import java.util.Arrays;

public class q05_nextPermutation {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 5, 0, 0};
        permutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void permutation(int[] arr){
        // find the pivot element
        int n = arr.length;
        int pivot = -1;

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot != -1){
            for(int i = n-1; i>pivot; i--){
                if(arr[i] > arr[pivot]){
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
        }
        // reverse the right side
        reverse(arr, pivot+1, n-1);
    }
    static void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}

