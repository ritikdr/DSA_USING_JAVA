package Sort;
// import java.util.Arrays;

// public class marge_sort {
//     public static void main(String[] args) {
//         double[] unsortedArr = { 3, 7, 6, -10, 15, 23.5, 55, -13 };
//         double[] sortedArr = mergeSort(unsortedArr);
//         System.out.println("Sorted array: " + Arrays.toString(sortedArr));
//     }

//     public static double[] mergeSort(double[] arr) {
//         if (arr.length <= 1) {
//             return arr;
//         }

//         int mid = arr.length / 2;
//         double[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
//         double[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

//         double[] sortedLeft = mergeSort(leftHalf);
//         double[] sortedRight = mergeSort(rightHalf);

//         return merge(sortedLeft, sortedRight);
//     }

//     public static double[] merge(double[] left, double[] right) {
//         double[] result = new double[left.length + right.length];
//         int i = 0, j = 0, k = 0;

//         while (i < left.length && j < right.length) {
//             if (left[i] < right[j]) {
//                 result[k++] = left[i++];
//             } else {
//                 result[k++] = right[j++];
//             }
//         }

//         while (i < left.length) {
//             result[k++] = left[i++];
//         }

//         while (j < right.length) {
//             result[k++] = right[j++];
//         }

//         return result;
//     }
// }




public class marge_sort {
    public static void main(String[] args) {
        int[] arr = {1,8,3,2,5,0,7};

        marge_sort(arr, 0, arr.length - 1);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void marge_sort(int[] arr,int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;

            marge_sort(arr, left, mid);
            marge_sort(arr, mid + 1, right);

            marge(arr,left, mid, right);
        }
    }
    public static void marge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        for(int i = 0;i < n1;i++) {
            leftarr[i] = arr[left + i];
        }
        for(int j = 0;j < n2;j++) {
            rightarr[j] = arr[mid + 1 +j];
        }

        int i = 0,j = 0,k = left;

        while (i < n1 && j < n2) {
            if(leftarr[i] < rightarr[j]) {
                arr[k++] = leftarr[i++]; 
            } else {
                arr[k++] = rightarr[j++];
            }
        }

        while(i < n1) {
            arr[k++] = leftarr[i++];
        }

        while(j < n2) {
            arr[k++] = rightarr[j++];
        }
    }
}     