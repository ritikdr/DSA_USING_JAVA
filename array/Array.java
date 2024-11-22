package array;
import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements you want to store:");

//         n = sc.nextInt();

//         int[]array = new int[n];
//         System.out.println("Enter the elements of the arrray:");

//         for (int i = 0; i<n; i++){
//             array[i] = sc.nextInt();
//         }

//         System.out.println("Array elements are:");

//         for (int i = 0; i<n; i++){
//             System.out.println(array[i]);
//         }
//     }

// }

// public class Array {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements you want to store:");

//         n = sc.nextInt();

//         int[]array = new int[n];
//         System.out.println("Enter the elements of the arrray:");

//         for (int i = 0; i<n; i++){
//             array[i] = sc.nextInt();
//         }

//         int max = array[0];

//         for (int i = 0; i<n; i++){
//             if (max < array[i]){
//                 max = array[i];
//             }
//         }
//         System.out.print("max = "+max);
//     }

// }

// public class Array {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements you want to store:");

//         n = sc.nextInt();

//         int[] array = new int[n];
//         System.out.println("Enter the elements of the arrray:");

//         for (int i = 0; i < n; i++) {
//             array[i] = sc.nextInt();
//         }

//         int max = array[0];

//         for (int i = 0; i<n; i++){
//             if (max < array[i]){
//                 max = array[i];
//             }
//         }
//         System.out.print("max = "+max);
//     }
// }




/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
         
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");

        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the element:");
        for (int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.print("element of array are:");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}