import java.util.Scanner;

// public class sum {
//     public static void main(String[] args) {
//         float x, y, sum;
//         Scanner myObj = new Scanner(System.in);
//         System.out.println("Type a number:");
//         x = myObj.nextFloat();

//         System.out.println("Type another number:");
//         y = myObj.nextFloat();

//         sum = x + y;
//         System.out.println("Sum is:" + sum);
//     }
// }



public class sum {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type a number:");
        x = myObj.nextInt();

        System.out.println("Type another number:");
        y = myObj.nextInt();

        sum = x + y;
        System.out.println("Sum is:" + sum);
    }
}
