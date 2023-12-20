import java.util.Scanner;

public class PawnWars_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char[][] board=inputToBoard(scanner);

        boolean whiteToMove=true;

        while (true){
            if (whiteToMove){
                String captured = canWhiteCapture(board, -1,'w','b');
                if (captured != null){
                    System.out.printf("Game over! White capture on %s.\n", captured);
                    break;
                }

                String promoted= movePawnForward(board, -1, 'w');
                if (promoted != null){
                    System.out.printf("Game over! White pawn is promoted to a queen at %s.\n", promoted);
                    break;
                }
            }else{
                String captured = canWhiteCapture(board, 1,'b','w');
                if (captured != null){
                    System.out.printf("Game over! Black capture on %s.\n", captured);
                    break;
                }
                String promoted= movePawnForward(board, +1, 'b');
                if (promoted != null){
                    System.out.printf("Game over! Black pawn is promoted to a queen at %s.\n", promoted);
                    break;
                }
            }
            whiteToMove = !whiteToMove;
        }
    }


    private static String coordinatesToChessNotation(int[] coordinates){
        // [0, 1]
        int row = 8 - coordinates[0];
        char col=(char) ('a' + coordinates[1]);
        return String.format("%c%d", col, row);
    }
    private static String movePawnForward(char[][] board, int direction, char pawn) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == pawn) {
                    if ((row + direction == 0 && pawn == 'w') || row + direction == 7 && pawn == 'b'){
                        return coordinatesToChessNotation(new int[]{row + direction, col});
                    }
                    board[row][col] = '-';
                    board[row + direction][col] = pawn;
                    return null;
                }
            }
        }
        return null;
    }

    private static String canWhiteCapture(char[][] board,int direction,char pawn, char enemyPawn) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == pawn) {
                    if ((row + direction>= 0 && col - 1 >= 0)
                            && board[row + direction][col - 1] == enemyPawn) {
                        return coordinatesToChessNotation(new int[]{row + direction, col - 1});

                    }
                    if ((row + direction >= 0 && row + direction < board.length
                            && col + 1 < board[row].length)
                            && board[row + direction][col + 1] == enemyPawn) {
                        return coordinatesToChessNotation(new int[]{row + direction, col + 1});
                    }
                    return null;
                }
            }
        }
        return null;
    }

    private static void printBoard(char[][] board){
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    private static char[][] inputToBoard(Scanner scanner) {
        char[][] board=new char[8][8];
        for (int row = 0; row < 8; row++) {
                var line=scanner.nextLine();
            for (int col = 0; col < 8; col++) {
                board[row][col]=line.charAt(col);
            }
        }
        return board;
    }
}
