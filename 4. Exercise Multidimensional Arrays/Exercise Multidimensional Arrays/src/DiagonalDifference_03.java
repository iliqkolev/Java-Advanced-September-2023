import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int[][] matrix=new int[n][n];

        fillMatrix(matrix, scanner);

        int primaryDiagonalSum = getPrimaryDiagonal(matrix);

        int secondaryDiagonalSum = getSecondaryDiagonal(matrix);
        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));


    }

    private static int getPrimaryDiagonal(int[][] matrix) {
        int sum=0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][row];
        }
        return  sum;
    }
    private static int getSecondaryDiagonal(int[][] matrix) {
    int sum=0;
        for (int row = 0; row <matrix.length ; row++) {
            sum += matrix[row][matrix.length - 1 - row];
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {

                int[] currentRow=Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                matrix[row]=currentRow;
        }
    }
}
