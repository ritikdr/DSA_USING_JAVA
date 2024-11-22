package recursion;
class recursion {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 9 };
        int target = 8;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("index is: " + result);
        } else {
            System.out.println("target is not found.");
        }
    }
}
