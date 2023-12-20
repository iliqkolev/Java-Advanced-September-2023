import java.util.Scanner;

public class FishingCompetition_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());

        char[][] matrix=new char[n][n];
        fillMatrix(matrix,scanner);
        printMatrix(matrix);
        System.out.println();
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix,Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row]= scanner.nextLine().toCharArray();
        }
    }
}
