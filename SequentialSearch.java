public class SequentialSearch {

    public static int sequentialSearch(int[] array, int target) {
       
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  
            }
        }
  
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 13, 15};
        int target = 9;

        int result = sequentialSearch(array, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

