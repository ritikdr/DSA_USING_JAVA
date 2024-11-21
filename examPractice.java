//1

// public class examPractice {
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 4, 5, 2, 1, 2, 3, 4,5};

//         int result = longestincreasing(arr);
//         System.out.println("lingestincreasingsebsequence: "+ result);
//     }
//     public static int longestincreasing(int[] arr) {
//         if(arr.length == 0) {
//             return 0;
//         }
//         int maxvalue = 1;
//         int currentvalue = 1;
//         for(int i = 1; i < arr.length; i++) {
//             if(arr[i] > arr[i - 1]) {
//                 currentvalue++;
//             } else {
//                 maxvalue = Math.max(maxvalue, currentvalue);
//                 currentvalue = 1;
//             }
//         }
//         maxvalue = Math.max(maxvalue, currentvalue);
//         return maxvalue;
//     }
// }


//2

// import java.util.Arrays;
// import java.util.HashSet;
// public class examPractice {
//     public static void main(String[] args) {
//         int[] arr = {2,3,4,3,2,1,4,5,4,6,8,0};

//         int[] result = duplicateRemove(arr);
//         System.out.println("Array: " + Arrays.toString(result));
//     }
//     public static int[] duplicateRemove(int[] arr) {
//         HashSet<Integer> set = new HashSet<>();

//         for(int num : arr) {
//             set.add(num);
//         }

//         int[] uniquearr = new int[set.size()];
//         int i = 0;
//         for(int num : set) {
//             uniquearr[i++] = num;
//         }
//         return uniquearr;
//     }
// }


//3

// public class examPractice {
//     public static void main(String[] args) {
//         int[][] arr = {{1,4,8},{3,6,0},{2,9,7}};

//         System.out.println("after transpose arr[i][j]: ");
//         for(int i = 0;i < arr.length; i++) {
//             for(int j = 0;j < arr.length; j++) {
//                 System.out.print(arr[j][i]);
//             }
//             System.out.println();
//         }
//     }
// }


//4

// public class examPractice {
//     static class node{
//         int data;
//         node next;
//         node(int value) {
//             this.data = value;
//             this.next = null;
//         }
//     }
//     public static void main(String[] args) {
//         node n1 = new node(3);
//         node n2 = new node(4);
//         node n3 = new node(2);
//         node n4 = new node(8);
//         node n5 = new node(1);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;
//         n4.next = n5;
        
//         System.out.print("Linked list: ");
//         traversal(n1);
//     }
//     public static void traversal(node head) {
//         node currentnode = head;
//         while (currentnode != null) {
//             System.out.print(currentnode.data + " --> ");
//             currentnode = currentnode.next;
//         }
//         System.out.println("null");
//     }
//     public static node secondSmallest(node head);
//     if (head == null) {
//         return head;
//     }

//     int temp = head;
//     while (temp != null) {
//         if (temp > temp.next){
//             temp = temp.next;
//         }
//     }
// }


//5


// public class examPractice {
//     static class node{
//         int data;
//         node next;
//         node prev;
//         node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }
//     public static void main(String[] args) {
//         node n1 = new node(1);
//         node n2 = new node(3);
//         node n3 = new node(6);
//         node n4 = new node(9);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;

//         n4.prev = n3; 
//         n3.prev = n2;
//         n2.prev = n1;

//         System.out.println("forwardtraversal: ");
//         forwardtraversal(n1);
        
//         System.out.println("backwardtraversal: ");
//         backwardtraversal(n4);

//         boolean ispandulam = ispandulam(n1, n4);
//         if(ispandulam) {
//             System.out.println("linked list is pandularm.");
//         } else {
//             System.out.println("linked list is not pandularm.");
//         }
//     }
//     public static void forwardtraversal(node head) {
//         node currentnode = head;
//         while(currentnode != null) {
//             System.out.print(currentnode.data + " --> ");
//             currentnode = currentnode.next;
//         }
//         System.out.println("null");
//     }
//     public static void backwardtraversal(node head) {
//         node currentnode = head;
//         while(currentnode != null) {
//             System.out.print(currentnode.data + " --> ");
//             currentnode = currentnode.prev;
//         }
//         System.out.println("null");
//     }
//     public static boolean ispandulam(node head, node tail) {
//         while (head != null && tail != null) {
//             if (head.data != tail.data) {
//                 return false;
//             }
//             head.next = head;
//             tail.next = tail;   
//         }
//         return true;
//     }
// }


//8

// public class examPractice {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};

//         int result = 0;
//         for (int i = 0;i < arr.length; i++) {
//             result += arr[i];
//         }
//         int avg = result / arr.length;
//         System.out.println("avg: " + avg);
//     }
// }


//9

// public class examPractice {
//     static class node{
//         int data;
//         node next;
//         node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static void main(String[] args) {
//         node n1 = new node(1);
//         node n2 = new node(3);
//         node n3 = new node(5);
//         node n4 = new node(7);
//         node n5 = new node(9);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;
//         n4.next = n5;

//         System.out.println("linked list: ");
//         traversal(n1);

//         node midvalue = midterm(n1);
//         if(midvalue != null) {
//             System.out.println("midterm of linked list are: " + midvalue.data);
//         } else {
//             System.out.println("linked list is null.");
//         }
//     }
//     public static void traversal(node head) {
//         node currentnode = head;
//         while(currentnode != null) {
//             System.out.print(currentnode.data + " --> ");
//             currentnode = currentnode.next;
//         }
//         System.out.println("null");
//     }
//     public static node midterm(node head) {
//         if(head == null) {
//             return null;
//         }

//         node slow = head;
//         node fast = head;
//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
// }


//13

// public class examPractice {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};

//         System.out.print("Orginal: ");
//         for(int num : arr) {
//             System.out.print(num + " ");
//         }

//         bubbole_sort(arr);
//         System.out.print("\nafter sort: ");
//         for(int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
//     public static void bubbole_sort(int[] arr) {
//         int n = arr.length;
//         boolean swap;

//         for (int i = 0; i < n - 1; i++) {
//             swap = false;
//             for(int j = 0; j < n - 1 - i; j++) {
//                 if(arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swap = true;
//                 }
//             }
//             if(!swap) {
//                 break;
//             }
//         }
//     }
// }


//14

// public class examPractice {
//     public static void main(String[] args) {
//         int[] arr = {1,3,5,7,9};
//         int[] arr1 = {2,4,6,8};

//         int[] num = marge(arr, arr1);

//         for(int result : num) {
//             System.out.print(result + " ");
//         }
//     }
//     public static int[] marge(int[] arr, int[] arr1) {
//         int n1 = arr.length;
//         int n2 = arr1.length;

//         int[] marged = new int[n1 + n2];
//         int i = 0, j = 0, k = 0;

//         while (i < n1 && j < n2) {
//             if(arr[i] < arr1[j]) {
//                 marged[k++] = arr[i++];
//             } else {
//                 marged[k++] = arr1[j++];
//             }
//         }

//         while(i < n1) {
//             marged[k++] = arr[i++];
//         }

//         while(j < n2) {
//             marged[k++] = arr1[j++];
//         }

//         return marged;
//     }
// }


//16

// public class examPractice {
//     public static void main(String[] args) {
//         int result = hcf(56, 98);

//         System.out.print(result);
//     }
//     public static int hcf(int n1,int n2) {
//         if(n2 == 0) {
//             return n1;
//         }

//         return hcf(n2, n1 % n2);
//     }
// } 


//17

// public class examPractice {
//     static class node{
//         int data;
//         node next;
//         node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static void main(String[] args) {
//         node n1 = new node(1);
//         node n2 = new node(2);
//         node n3 = new node(45);
//         node n4 = new node(56);

//         n1.next = n2;
//         n2.next = n3;
//         n3.next = n4;

//         node n5 = new node(3);
//         node n6 = new node(24);
//         node n7 = new node(56);
//         node n8 = new node(63);
//         node n9 = new node(66);

//         n5.next = n6;
//         n6.next = n7;
//         n7.next = n8;
//         n8.next = n9;

//         System.out.print("first linked list: ");
//         traversal(n1);

//         System.out.print("\nsecond linked list: ");
//         traversal(n5);

//         System.out.print("\nafter marged linked list: ");
//         node n = marge(n1, n5);
//         traversal(n);
//     }
//     public static void traversal(node head) {
//         node current = head;
//         while(current != null) {
//             System.out.print(current.data + " --> ");
//             current = current.next;
//         }
//         System.out.print("null");
//     }
//     public static node marge(node head, node head1) {
//         node dummy = new node(-1);
//         node current = dummy;
//         while(head != null && head1 != null) {
//             if(head.data < head1.data) {
//                 current.next = head;
//                 head = head.next;
//             } else {
//                 current.next = head1;
//                 head1 = head1.next;
//             }
//             current = current.next;
//         }

//         while (head != null) {
//             current.next = head;
//             head = head.next;
//         }

//         while (head1 != null) {
//             current.next = head1;
//             head1 = head1.next;
//         }

//         return dummy.next;
//     }
// }


//36

// import java.util.Scanner;

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         System.out.print("binary " + n+ " is: ");
//         decimal(n);

//         sc.close();
//     }
//     public static void decimal(int num){
//         if (num == 0){
//             return;
//         }
//         decimal(num / 2);
//         int result = num % 2;
//         System.out.print(result);
//     }
// }


//38 (Dought******)

// import java.util.Scanner;

// public class examPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         System.out.print("sum of digit of " + n + " is: ");
//         sum(n);
//     }
//     public static int sum(int num) {
//         if(num == 0) {
//             return 0;
//         }
//         int result = 0;
//         int digit = sum(num) % 10;
//         result = result + digit;
//         sum(num / 10);
//         return result;
//     }
// }


//39

import java.util.Scanner;

public class examPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("\nEnter the element: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter the target: ");
        int target = sc.nextInt();

        System.out.println("pair with the sum is " + target);
        findpair(arr, target);

        sc.close();
    }
    public static void findpair(int[] arr, int target) {
        boolean found = false;
        for(int i = 0;i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] +","+ arr[j] + ")");
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("pair not found.");
        }
    }
}