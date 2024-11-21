public class createArrayStack {
    public static void main(String[] args) {
        int arr[][] = {{2, 3, 5},{8, 3, 2},{9, 1, 0}};
        for(int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int push(int arr[], int a) {
        if (arr[0] == null) {
            arr[0] = a;
        }
    }
}
