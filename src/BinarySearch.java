public class BinarySearch {
    public static int Search(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s+e) / 2;
            if (arr[mid] > x) {
                e = mid - 1;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 14,};

        int gh = Search(arr, 4);
        System.out.println(gh);


    }
}
