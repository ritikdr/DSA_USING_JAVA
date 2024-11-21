// import java.util.Scanner;

// public class revision {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the number:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         int i = 0;
//         for(i = 0; i < n ; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // int maxvalue = arr[0];
//         // for(i = 0; i < n; i++){
//         //     if(arr[i] > maxvalue) {
//         //         System.out.print(arr[i]);
//         //     }
//         // }

//         System.out.print("arr["+n+"] = ");
//         for (i = 0; i < n; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//         System.out.println("position = ");
//         int p = sc.nextInt();

//         // System.out.println("insert element = ");
//         // int a = sc.nextInt();
        
//         // arr = insertarr(n , arr, p, a);

//         arr = deletearr(n, arr, p);

//         System.out.print("arr[] =  ");
//         for (i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }

//     // public static int[] insertarr(int n, int arr[], int p,int a) {
//     //     int newarr[] = new int[n+1];

//     //     for (int i = 0, j = 0; i < n + 1; i++) {
//     //         if (i == p) {
//     //             newarr[i] = a;  
//     //         } else {
//     //             newarr[i] = arr[j];  
//     //             j++;
//     //         }
//     //     }

//     //     return newarr;
//     // }


//     public static int[] deletearr(int n, int arr[], int p) {
//         int newarr[] = new int[n-1];

//         for (int i = 0, j = 0; i < n;i++) {
//             if (i == p) {
//                 continue;
//             } 
//             newarr[j] = arr[i];
//             j++;
//         }
//         return newarr;
//     }
// }



// public class revision {
//     public static void main(String[] args) {
//         int a[][] = {{2,4,3},{4,3,5},{2,5,6}};
//         int b[][] = {{8,3,9},{0,2,7},{4,5,8}};

//         int c[][] = new int[3][3];
//         for(int i = 0; i < 3; i++) {
//             for(int j = 0; j < 3; j++) {
//                 c[i][j] = a[i][j] + b[i][j];
//                 System.out.print(c[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class revision {
//     public static void main(String[] args) {
//         int a[][] = {{2,4,3},{4,3,5},{2,5,6}};
//         int b[][] = {{8,3,9},{0,2,7},{4,5,8}};

//         int c[][] = new int[3][3];
//         for(int i = 0; i < 3; i++) {
//             for(int j = 0; j < 3; j++) {
//                 c[i][j] = 0;
//                 for(int k = 0; k < 3; k++) {
//                     c[i][j] += a[i][k] * b[k][j];
//                 }
//                 System.out.print(c[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class revision {
//     public static void main(String[] args) {
//         int a[][] = {{2,4,3},{4,3,5},{2,5,6}};

//         int c[][] = new int[3][3];
//         System.out.println("original matrix: ");
//         for(int i = 0; i < 3; i++) {
//             for(int j = 0; j < 3; j++) {
//                 c[i][j] = a[i][j];
//                 System.out.print(c[i][j]+" ");
//             }
//             System.out.println();
//         }

//         System.out.println("after transpose a matrix: ");
//         for(int i = 0; i < 3; i++) {
//             for(int j = 0; j < 3; j++) {
//                 c[i][j] = a[j][i];
//                 System.out.print(c[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }




public class revision {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 2, 3, 4, 5}; 

        int result = findLongestIncreasingSequence(arr);
        System.out.println(result);
    }

    public static int findLongestIncreasingSequence(int[] arr) {
        if(arr.length == 0) {
            return 0; 
        }

        int maxvalue = 1;
        int currentlength = 1;

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentlength++;
            } else {
                maxvalue = Math.max(maxvalue, currentlength);
                currentlength = 1;
            }
        }
        maxvalue = Math.max(maxvalue, currentlength);
        return maxvalue;
    }
}

