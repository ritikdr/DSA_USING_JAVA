import java.util.*;

class sort {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 1, 9 };
        divide(arr, 0, arr.length);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void divide(int[] arr, int left, int right) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        divide(arr, 0, mid);
        divide(arr, mid + 1, arr.length);
        margesort(arr, mid, right);
    }

    public static int margesort(int[] arr, int left,int right) {
        int[] result = new int[left + right];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left && j < right) {
            if(arr[i] < arr[j]){
                arr[k++] = arr[i++];
            } else {
                arr[k++] = arr[j++];
            }
        }
        while(i < left) {
            arr[k++] = arr[i++];
        } 
        while(j < right) {
            arr[k++] = arr[j++];
        }
        return result;
    }
}
