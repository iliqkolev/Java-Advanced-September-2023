import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] matrix = readMatrix();
        Coordinate playerCoordinate = findPlayer(matrix);
        double initialAmount = 100;
        String command;

        while (true) {
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("end")) {
                break;
            }

            Coordinate newCoordinate = readNewCoordinate(command, playerCoordinate);

            if (!newCoordinate.within(matrix.length, matrix[0].length)) {
                // Ends
            }

            char symbol = matrix[newCoordinate.X()][newCoordinate.Y()];
            playerCoordinate = newCoordinate;

            if (symbol == 'W') {
                initialAmount += 100;
            } else if (symbol == 'P') {
                if (initialAmount <= 200) {
                    System.out.println("Game Over! You lost everything!");
                    return;
                }

                initialAmount -= 200;
            } else if (symbol == 'J') {
                initialAmount += 100000;
                System.out.println("You win the Jackpot!");
                break;
            }
        }

        // Ends
        System.out.println("End of the game. Total amount: " + initialAmount + "$");
        printMatrix(matrix);
    }

    private static Coordinate readNewCoordinate(String command, Coordinate playerCoordinate) {
        Coordinate newCoordinate = null;

        switch (command) {
            case "up": {
                newCoordinate = new Coordinate(playerCoordinate.X() - 1, playerCoordinate.Y());
                break;
            }
            case "down": {
                newCoordinate = new Coordinate(playerCoordinate.X() + 1, playerCoordinate.Y());
                break;
            }
            case "left": {
                newCoordinate = new Coordinate(playerCoordinate.X(), playerCoordinate.Y() - 1);
                break;
            }
            case "right": {
                newCoordinate = new Coordinate(playerCoordinate.X(), playerCoordinate.Y() + 1);
                break;
            }
        }

        return newCoordinate;
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]);
            }

            System.out.println();
        }
    }

    private static Coordinate findPlayer(char[][] matrix) {
        Coordinate coordinate = null;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 'G') {
                    coordinate = new Coordinate(row, column);
                }
            }
        }

        return coordinate;
    }

    private static char[][] readMatrix() {
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            String inputLine = scanner.nextLine();

            for (int column = 0; column < n; column++) {
                matrix[row][column] = inputLine.charAt(column);
            }
        }

        return matrix;
    }
}