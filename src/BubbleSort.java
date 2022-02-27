public class BubbleSort {
    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length ; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 9,23,56,78,90, 2,6,5,8,12};
        bubbleSort(arr);
        PrintArray(arr);
    }

}

