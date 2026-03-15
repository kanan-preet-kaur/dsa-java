public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        reverseArray(arr);
        System.out.println("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        if(arr == null || arr.length == 0){
            return;
        }
        
        int firstIdx = 0;
        int lastIdx = arr.length - 1;

        while (firstIdx < lastIdx) {

            // swap
            int temp = arr[firstIdx];
            arr[firstIdx] = arr[lastIdx];
            arr[lastIdx] = temp;

            firstIdx++;
            lastIdx--;
        }
    }
}
