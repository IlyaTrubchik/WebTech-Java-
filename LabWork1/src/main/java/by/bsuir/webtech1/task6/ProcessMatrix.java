package by.bsuir.webtech1.task6;

public class ProcessMatrix {
    private static int[] array;
    private static int[][] matrix;

    public static int[][] process(int[] array) {
        int n = array.length;
        matrix =  new int[n][n];
        for(int i= 0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j>=n)
                {
                    matrix[i][j] = array[i+j-n];
                }
                else
                    matrix[i][j] = array[i+j];
            }
        }
        return matrix;
    }
}
