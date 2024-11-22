package array;
import java.util.Arrays;

public class DeleteElement {
    public static int[] deleteElement(int[] arr, int pos){
        if (pos < 0 || pos >= arr.length){
            System.out.println("Invalid position");
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++){
            if (i != pos) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Initial Array:\n"+Arrays.toString(arr));

        int pos = 4;

        arr = deleteElement(arr, pos);
        System.out.println("\nArray after deleting element at position" +pos+":\n"+Arrays.toString(arr));
    }
}
