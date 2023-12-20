import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2SubMatrix_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] tokens= Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows=tokens[0];
        int cols=tokens[1];

        int[][] matrix=new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i]=Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] maxSubMatrix=new int[2][2];

        int maxSum=Integer.MIN_VALUE;


        for (int i = 0; i < matrix.length - 1 ; i++) {
            for (int j = 0; j <matrix[i].length - 1; j++) {
                int currentElement=matrix[i][j];
                int right=matrix[i][j+1];
                int below=matrix[i+1][j];
                int rightBelow=matrix[i+1][j+1];

                int sum=currentElement+right+below+rightBelow;
                if (maxSum < sum){
                    maxSum=sum;
                    maxSubMatrix[0][0] = currentElement;
                    maxSubMatrix[0][1] = right;
                    maxSubMatrix[1][0]=below;
                    maxSubMatrix[1][1]=rightBelow;
                }
            }
        }

        System.out.println(maxSubMatrix[0][0] + " " + maxSubMatrix[0][1]);
        System.out.println(maxSubMatrix[0][1] + " " + maxSubMatrix[1][1]);
        System.out.println(maxSum);

    }
}
