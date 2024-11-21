import java.util.Arrays;

public class InsertElement {
    public static int[] insertX(int n, int arr[], int X, int pos) {
        int i;
        int newarr[] = new int[n + 1];

        for (i = 0; i < n+1; i++){
            if (i < pos - 1){
                newarr[i] = arr[i];
            } else if (i == pos - 1){
                newarr[i] = X;
            } else {
                newarr[i] = arr[i - 1];
            }
        }
        return newarr;
    }
        
    public static void main(String[] args) {
        int n = 10;
        int i;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // System.out.println("initial Array:\n"+Arrays.toString(arr));
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int X = 50;
        int pos =5;
        arr = insertX(n, arr, X, pos);
        System.out.println("Array with " +X+ " inserted at position " +pos+"\n"+Arrays.toString(arr));
    } 
}
