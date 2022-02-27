public class InsertionSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length  ; i++) {
            //Insert ith element in sorted portion
            int j = i - 1;// here our jth element will start form the j-1 element
            int temp = arr[i];   // here if we store the arr[i] then the condition will be false .. ...
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 7, 2, 8, 1, 5};
        insertionSort(arr);
        printArray(arr);
    }

}
