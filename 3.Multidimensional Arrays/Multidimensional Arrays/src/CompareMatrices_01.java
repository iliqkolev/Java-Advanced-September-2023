import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[][] firstMatrix=readMatrix(scanner);
        int[][] secondMatrix=readMatrix(scanner);

        boolean isEqual= firstMatrix.length == secondMatrix.length;

        if (isEqual) {

            for (int r = 0; r < firstMatrix.length; r++) {

                int[] firstArr = firstMatrix[r];
                int[] secondArr = secondMatrix[r];

                isEqual = firstArr.length == secondArr.length;

                if (isEqual) {
                    for (int i = 0; i < firstArr.length; i++) {
                        if (firstArr[i] != secondArr[i]) {
                            isEqual = false;
                        }
                    }
                }
            }
        }
        String output;

        if (isEqual){
            output="equal";
        }else{
            output="not equal";
        }
        System.out.println(output);
    }
    private static int[][] readMatrix(Scanner scanner){
        int[] matrixSize= readArray(scanner);

        int rows=matrixSize[0];
        int cols=matrixSize[1];

        int[][] matrix=new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] arr= readArray(scanner);

            matrix[i] =arr;

        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
