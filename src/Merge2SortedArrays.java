public class Merge2SortedArrays {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] merge2SortedArrays(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10, 13, 17};
        int[] arr2 = {2, 3, 5, 7, 9, 11, 12,};

        int[] arr3 = merge2SortedArrays(arr1, arr2);

        printArray(arr3);


    }

}
