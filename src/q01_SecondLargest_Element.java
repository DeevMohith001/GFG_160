public class q01_SecondLargest_Element {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secLargestElement(arr));
    }
    static int secLargestElement(int[] arr){
        if (arr==null || arr.length<2){
            return -1;
        }
        int max = arr[0];
        int secMax = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
