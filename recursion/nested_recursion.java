package recursion;

public class nested_recursion{
    static int nestedRecursion(int i) {
        if (i > 100) {
            return i - 10;
        } else {
            return nestedRecursion(nestedRecursion(i + 11));
        }
    }

    public static void main(String[] args) {
        int i = 95;
        System.out.println(nestedRecursion(i));
    }
}
