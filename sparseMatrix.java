public class sparseMatrix {
    public static void main(String[] args) {
        
        int sparseMatrix[][] ={{0,0,3,0,4},{0,0,5,7,0},{0,0,0,0,0},{0,2,6,0,0}};

        int size = 0;

        for (int i = 0; i < sparseMatrix.length; i++){
            for (int j = 0; j < sparseMatrix[i].length; j++){
                if (sparseMatrix[i][j] != 0){
                    size++;
                }
            }
        }

        int complexMatrix[][] = new int[3][size];

        int k = 0;
        for (int i=0;i<sparseMatrix.length;i++){
            for (int j=0;j<sparseMatrix[i].length;j++){
                if (sparseMatrix[i][j] != 0){
                    complexMatrix[0][k]=i;
                    complexMatrix[1][k]=j;
                    complexMatrix[2][k]=sparseMatrix[i][j];
                    k++;
                }
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<size;j++){
                System.out.printf("%d",complexMatrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
