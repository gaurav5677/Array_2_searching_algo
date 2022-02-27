public class SelectionSort {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Selection(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            //in each round we have to put the element in ith position
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < arr.length; j++) {
                //finding the minimum element among the j positions
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
//         swap minimum element with ith position
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 9, 7, 5, 2};
        Selection(arr);//getting reference of the array in main ;
        //every sorting algo will have type void .. because its task is to sort array .
        printArray(arr);
    }
}
