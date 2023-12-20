import java.util.Scanner;

public class NavyBattle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        int submarineRow=0;
        int submarineCol=0;

        for (int row = 0; row < n; row++) {
            matrix[row]= scanner.nextLine().toCharArray();

            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 'S'){
                    submarineRow=row;
                    submarineCol=col;
                }
            }
        }


        int submarineHits=0;
        int cruiserHits=0;

        while (submarineHits < 3 && cruiserHits < 3){
        String command=scanner.nextLine();

        matrix[submarineRow][submarineCol] = '-';

        switch (command){
            case "up": submarineRow--;
                break;

            case "down": submarineRow++;
                break;

            case "left": submarineCol--;
                break;

            case "right": submarineCol++;
                break;
            }

            if (matrix[submarineRow][submarineCol] == '-'){
                matrix[submarineRow][submarineCol]  = 'S';

            } else if (matrix[submarineRow][submarineCol] == '*') {
                matrix[submarineRow][submarineCol]  = 'S';
                submarineHits++;

            } else if (matrix[submarineRow][submarineCol] == 'C') {
                matrix[submarineRow][submarineCol] = 'S';
                cruiserHits++;
            }

        }

        if (submarineHits == 3){
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!\n", submarineRow,submarineCol);
        }else{
            System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
        }

        printMatrix(matrix);

    }
    private static void printMatrix(char[][] matrix){
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
