import java.util.Scanner;

public class factorial {
    static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        int number, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Non Negative Number:");
        number = input.nextInt();
        input.close();
        result = fact(number);
        System.out.print("The factorial of " + number + " is " + result);
    }
}

