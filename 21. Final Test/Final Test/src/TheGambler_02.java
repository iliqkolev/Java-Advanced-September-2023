import java.util.Scanner;

public class TheGambler_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        int[] coordinates = fillMatrixAndFindG(n, scanner, matrix);
        int startRowG = coordinates[0];
        int startColG = coordinates[1];

        String command = scanner.nextLine();
        while (!command.equals("end")){
            switch (command){
                case "up":
                    
                    break;

                case "down":

                    break;

                case "left":

                    break;

                case "right":

                    break;
            }









            command=scanner.nextLine();
        }








    }

    private static int[] fillMatrixAndFindG(int n, Scanner scanner, char[][] matrix) {
        int [] coordinates = new int[2];
        for (int row = 0; row < n; row++) {
            char[] currentRow = scanner.nextLine().toCharArray();
            matrix[row] = currentRow;

            for (int col = 0; col < currentRow.length; col++) {
                char symbol = currentRow[col];
                if (symbol == 'G') {
                    coordinates[0] = row;
                    coordinates[1] = col;
                    break;
                }
            }
        }
        return coordinates;
    }
}