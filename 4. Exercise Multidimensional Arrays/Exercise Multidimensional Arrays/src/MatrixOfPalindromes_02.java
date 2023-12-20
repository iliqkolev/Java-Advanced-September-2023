import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [] tokens= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row=tokens[0];
        int col=tokens[1];

        String[][] matrix=new String[row][col];

        fillPalindromeMatrix(matrix);
        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillPalindromeMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String outsideSymbol=String.valueOf((char) ('a' + row));
                String midSymbol=String.valueOf((char) ('a' + row + col));
                matrix[row][col]=outsideSymbol + midSymbol + outsideSymbol;

            }
        }
        
    }
}
