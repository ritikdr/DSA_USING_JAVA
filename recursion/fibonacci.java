package recursion;
// import java.io.*;
// class Main {
//     static void fibonacci(int N)
//     {
//         int num1 = 0,  num2 = 1;
        
//         for (int i = 0; i < N; i++){
//             system.out.print(num1 + " ");
            
//             int num3 = num2 + num1;
//             num1 = num2;
//             num2 = num3;
//         }
//     }
    
//     public static void main(string args[])
//     {
//         int N = 10;
//         fibonacci(N);
//     }
// }


// public class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello World");
//   }
// }

// import java.io.*;
// class Main {
//     static void fibonacci(int N)
//     {
//         num1 = 1

//         for (int i = 1; i < N; i++){
//             system.out.print(num1 + " ");
            
//             int num2 = num1 * i;
          
//         }
//     }
    
//     public static void main(string args[])
//     {
//         int N = 10;
//         fibonacci(N);
//     }
// }



// import java.util.Scanner;

// public class fibonacci {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = in.nextInt();
//         in.close(); 
        
//         int x = 0;
//         int y = 1;
//         int z = 0; 
//         System.out.println(x);
//         System.out.println(y);
//         for (int i = 0; i < n; i++) {
//             z = x + y;
//             x = y;
//             y = z;
           
//             System.out.println(z); 
//         }
        
//     }
// }


import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int factorial = 1;
        if(n < 0){
            System.out.println("Factorials are not defined for negative numbers.");
        }
        while(n > 0){
            factorial *=  n;
            n--;
        }
        System.out.println(factorial);
    }
}

