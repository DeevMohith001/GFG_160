public class q02_moveZeros_toEnd {
    public static void main(String[] args) {
        int[] arr = {0, 10, 22, 0, 8, 0, 5};
        moveZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void moveZerosToEnd(int[] arr){
        int nz = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[nz];
                arr[nz] = arr[i];
                arr[i] = temp;
                nz++;
            }
        }
    }
}
